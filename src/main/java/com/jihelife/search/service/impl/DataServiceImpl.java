package com.jihelife.search.service.impl;

import com.jihelife.search.dto.SearchBaseModel;
import com.jihelife.search.service.DataService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * search-service
 * Created by chechi on 2015/10/12.
 */
@Service
public class DataServiceImpl implements DataService {
    /**
     * Sets data.
     * 设置搜索引擎不能获取到的搜索结果信息.
     *
     * @param baseDtos the base dtos.搜索结果的集合的list.
     * @return the data List(SearchBaseModel).搜索结果和数据库来源信息合成结果集合list.
     */
    @Override
    public List<SearchBaseModel> setData(List<SearchBaseModel> baseDtos) {
        return null;
    }
}
