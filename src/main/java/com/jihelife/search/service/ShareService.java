package com.jihelife.search.service;

import com.jihelife.search.dto.SearchBaseModel;
import com.jihelife.search.dto.SearchResult;

import java.util.List;

/**
 * search-service
 * 获取资源的分享信息
 * Created by chechi on 2015/10/10.
 */
public interface ShareService {

    /**
     * Sets share info.
     * 通过返回搜索引擎搜索信息加载资源的分享信息.
     *
     * @param searchResults the search results.搜索引擎搜索结果的集合list.
     * @return the share info  List(SearchBaseModel).搜索引擎搜索信息和资源分享信息的集合list.
     */
    List<SearchBaseModel> setShareInfo(List<SearchResult> searchResults);
}
