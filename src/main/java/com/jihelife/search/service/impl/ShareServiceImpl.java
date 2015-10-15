package com.jihelife.search.service.impl;

import com.jihelife.search.dto.SearchBaseModel;
import com.jihelife.search.dto.SearchResult;
import com.jihelife.search.service.ShareService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * search-service
 * Created by chechi on 2015/10/12.
 */
@Service
public class ShareServiceImpl implements ShareService {
    /**
     * Sets share info.
     * 通过返回搜索引擎搜索信息加载资源的分享信息.
     *
     * @param searchResults the search results.搜索引擎搜索结果的集合list.
     * @return the share info  List(SearchBaseModel) 搜索引擎搜索信息和资源分享信息的集合list.
     */
    @Override
    public List<SearchBaseModel> setShareInfo(List<SearchResult> searchResults) {
        return null;
    }
}
