package com.jihelife.search.service.impl;

import com.jihelife.search.dto.SearchFields;
import com.jihelife.search.dto.SearchQuery;
import com.jihelife.search.dto.SearchResult;
import com.jihelife.search.service.SearchService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.solr.core.SolrTemplate;
import org.springframework.data.solr.core.query.SimpleQuery;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * search-service
 * Created by chechi on 2015/10/12.
 */
@Service
public class SearchServiceImpl implements SearchService, SearchFields {

    private static final Logger logger = LoggerFactory.getLogger(SearchServiceImpl.class);

    @Resource
    SolrTemplate solrTemplate;

    /**
     * Search list.
     * 搜索引擎通用搜索接口服务.
     *
     * @param query the query 搜索查询条件.
     * @return the list  List(SearchResult). 搜索引擎返回搜索结果基础信息.
     * @see SearchQuery
     * @see com.jihelife.search.dto.SearchResult
     */
    @Override
    public Page<SearchResult> search(SearchQuery query, Pageable pageable) {
        if (logger.isDebugEnabled()) {
            logger.debug("query:" + query.toString());
        }
        return solrTemplate.queryForPage(new SimpleQuery(query.toString()).addSort(new Sort("id")).setPageRequest(pageable), SearchResult.class);
    }
}
