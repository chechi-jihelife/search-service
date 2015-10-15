package com.jihelife.search.service;

import com.jihelife.search.dto.BaseTagGroupModel;
import com.jihelife.search.exception.BizException;

import java.util.List;
import java.util.Map;

/**
 * search-service
 * 获取查询关键词标签服务
 * Created by chechi on 2015/10/14.
 */
public interface BaseTagService {

    /**
     * Gets tag map.
     * 获取搜索关键词标签
     *
     * @param ids the ids
     * @return the tag map
     * @throws BizException the biz exception
     * @see com.jihelife.search.dto.BaseTagGroupModel
     * @see com.jihelife.search.dto.BaseTagModel
     * @see com.jihelife.search.exception.BizException
     */
    Map<String, BaseTagGroupModel> getTagMap(List<Integer> ids) throws BizException;


    /**
     * Gets filter tag list.
     * 获取过滤搜索结果的标签
     *
     * @param ids the ids
     * @return the filter tag list
     * @throws BizException the biz exception
     * @see com.jihelife.search.dto.BaseTagGroupModel
     * @see com.jihelife.search.dto.BaseTagModel
     * @see com.jihelife.search.exception.BizException
     */
    Map<String, BaseTagGroupModel> getFilterTagList(List<Integer> ids) throws BizException;
}
