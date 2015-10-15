package com.jihelife.search.dto;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.solr.core.mapping.SolrDocument;

import java.io.Serializable;

/**
 * search-service
 * 通用搜索结果定义,定义基础的搜索结果参数
 * Created by chechi on 2015/10/10.
 */
@SolrDocument(solrCoreName = "travel")
public class SearchResult implements SearchFields, Serializable {

    @Id
    private Long id;
    @Field
    private Integer resType;

    private String title;

    /**
     * Gets id.搜索结果对象标示ID.
     *
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * Gets resType.搜索结果对象类型,1:活动信息,2:酒店信息,3:活动信息,4:几何PLUS
     *
     * @return the resType
     */
    public Integer getResType() {
        return resType;
    }

    /**
     * Gets title.
     *
     * @return the title
     */
    public String getTitle() {
        return title;
    }


    /**
     * Sets title.
     *
     * @param title the title
     */
    public void setTitle(String title) {
        this.title = title;
    }
}
