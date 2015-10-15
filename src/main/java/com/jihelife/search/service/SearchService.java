package com.jihelife.search.service;

import com.jihelife.search.dto.SearchQuery;
import com.jihelife.search.dto.SearchResult;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


/**
 * search-service
 * 通用搜索引擎搜索接口服务.
 * Created by chechi on 2015/10/10.
 */
public interface SearchService {

    /**
     * Search list.
     * 搜索引擎通用搜索接口服务.
     *
     * @param query the query 搜索查询条件.
     * @return the list  Page(SearchResult).搜索引擎返回搜索结果基础信息.
     * @see org.springframework.data.domain.Page
     * @see SearchQuery
     * @see com.jihelife.search.dto.SearchResult
     */
    Page<SearchResult> search(SearchQuery query, Pageable pageable);
}
