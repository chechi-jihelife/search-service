/*
 * Copyright (c) 2015. qiatuhangzhou
 */

package com.jihelife.search;

import com.jihelife.search.conf.TomcatDataSourceProperties;
import com.jihelife.search.web.interceptors.BaseInterceptor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.impl.HttpSolrServer;
import org.apache.tomcat.jdbc.pool.DataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.data.solr.core.SolrOperations;
import org.springframework.data.solr.core.SolrTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.annotation.PreDestroy;

@EnableScheduling
@EnableAspectJAutoProxy
@Configuration
@EnableAutoConfiguration(exclude = DataSourceAutoConfiguration.class)
@EnableConfigurationProperties(TomcatDataSourceProperties.class)
@MapperScan("com.jihelife.search.mapper")
@ComponentScan("com.jihelife.search")
public class TxAppServerApplication extends WebMvcConfigurerAdapter {

    private Logger logger = LoggerFactory.getLogger(TxAppServerApplication.class);

    @Autowired
    private TomcatDataSourceProperties dataSourceProperties;

    private DataSource dataSource;


    /**
     * 初始化数据库连接池
     *
     * @return DataSource
     */
    @Bean(destroyMethod = "close")
    public DataSource dataSource() {
        logger.debug("dataSource bean create");
        this.dataSource = new DataSource();

        this.dataSource.setDriverClassName(dataSourceProperties.getDriverClassName());
        this.dataSource.setUrl(dataSourceProperties.getUrl());
        if (dataSourceProperties.getUsername() != null) {
            this.dataSource.setUsername(dataSourceProperties.getUsername());
        }
        if (dataSourceProperties.getPassword() != null) {
            this.dataSource.setPassword(dataSourceProperties.getPassword());
        }
        this.dataSource.setInitialSize(dataSourceProperties.getInitialSize());
        this.dataSource.setMaxActive(dataSourceProperties.getMaxActive());
        this.dataSource.setMaxIdle(dataSourceProperties.getMaxIdle());
        this.dataSource.setMinIdle(dataSourceProperties.getMinIdle());
        this.dataSource.setTestOnBorrow(dataSourceProperties.isTestOnBorrow());
        this.dataSource.setTestOnReturn(dataSourceProperties.isTestOnReturn());
        this.dataSource.setValidationQuery(dataSourceProperties.getValidationQuery());
        return this.dataSource;
    }

    /**
     * 关闭数据库连接池
     */
    @PreDestroy
    public void close() {

        logger.debug("dataSourcePool close");

        if (this.dataSource != null) {
            this.dataSource.close();
        }
    }

    /**
     * 创建数据库链接会话管理工厂类
     *
     * @return SqlSessionFactoryBean
     * @throws RuntimeException java 运行时异常,服务运行,建立数据库链接异常
     */
    @Bean
    public SqlSessionFactory sqlSessionFactoryBean() throws Exception {
        logger.debug("sqlSessionFactory bean create");

        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        sqlSessionFactoryBean.setDataSource(dataSource());
        sqlSessionFactoryBean.setMapperLocations(resolver.getResources("classpath:com/jihelife/search/mapper/*.xml"));

        return sqlSessionFactoryBean.getObject();
    }


    /**
     * 创建数据库事物管理器
     *
     * @return PlatformTransactionManager
     */
    @Bean
    public PlatformTransactionManager transactionManager() {
        return new DataSourceTransactionManager(dataSource());
    }


    /**
     * 创建基础拦截器
     *
     * @return BaseInterceptor
     */
    @Bean
    public BaseInterceptor baseInterceptorCreator() {
        BaseInterceptor baseInterceptor = new BaseInterceptor();
        return baseInterceptor;
    }

    /**
     * 注册solr server
     *
     * @return SolrServer
     */
    @Bean
    public SolrServer solrServer() {
        HttpSolrServer httpSolrServer = new HttpSolrServer("http://10.1.0.206:8080/solr/travel");
        return httpSolrServer;
    }

    /**
     * 获取solr操作模板
     *
     * @return SolrOperations
     */
    @Bean
    public SolrOperations solrTemplate() {
        return new SolrTemplate(solrServer());
    }

    /**
     * 注册拦截器
     *
     * @param registry 拦截器注册类
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(baseInterceptorCreator()).addPathPatterns("/search/**");
    }

    /**
     * spring boot 启动入口函数
     *
     * @param args 启动入口配置参数
     */
    public static void main(String[] args) {
        SpringApplication.run(TxAppServerApplication.class, args);
    }

}
