package com.jihelife.search.service;

import com.jihelife.search.dto.SearchBaseModel;

import java.util.List;

/**
 * search-service
 * 搜索服务不能提供的信息,通过这个服务添加到搜索返回结果.
 * Created by chechi on 2015/10/10.
 */
public interface DataService {

    /**
     * Sets data.
     * 设置搜索引擎不能获取到的搜索结果信息.
     *
     * @param baseDtos the base dtos.搜索结果的集合的list.
     * @return the data List(SearchBaseModel).搜索结果和数据库来源信息合成结果集合list.
     */
    List<SearchBaseModel> setData(List<SearchBaseModel> baseDtos);
}
