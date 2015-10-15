package com.jihelife.search.service.impl;

import com.jihelife.search.constants.BizExceptionCodes;
import com.jihelife.search.dto.BaseTagGroupModel;
import com.jihelife.search.dto.BaseTagModel;
import com.jihelife.search.exception.BizException;
import com.jihelife.search.mapper.BaseTagGroupModelMapper;
import com.jihelife.search.service.BaseTagService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * search-service
 * Created by chechi on 2015/10/14.
 */
@Service
public class BaseTagServiceImpl implements BaseTagService {

    private static Logger logger = LoggerFactory.getLogger(BaseTagServiceImpl.class);

    @Autowired
    private BaseTagGroupModelMapper tagGroupModelMapper;

    /**
     * Gets tag map.
     * 获取搜索关键词标签
     *
     * @param ids the ids
     * @return the tag map
     * @throws BizException the biz exception
     * @see com.jihelife.search.dto.BaseTagGroupModel
     * @see com.jihelife.search.exception.BizException
     */
    @Override
    public Map<String, BaseTagGroupModel> getTagMap(List<Integer> ids) throws BizException {

        if (null == ids || ids.size() == 0) {
            if (logger.isErrorEnabled()) {
                logger.error("parameter ids is empty");
            }
            throw new BizException(BizExceptionCodes.PARAMETER_EMPTY, "");
        }

        if (logger.isDebugEnabled()) {
            logger.debug("parameter ids ->" + ids.toString());
        }

        Map<String, BaseTagGroupModel> tagMap = new HashMap<String, BaseTagGroupModel>();

        List<BaseTagGroupModel> tagGroupModels = tagGroupModelMapper.selectTagGroups(ids);


        for (BaseTagGroupModel tagGroupModel : tagGroupModels) {
            tagMap.put(tagGroupModel.getAliasKey(), tagGroupModel);
        }

        Map<String, List<BaseTagModel>> sortCityListMap = sortCityTagList(tagGroupModelMapper.selectCityTagList());

        for (String key : sortCityListMap.keySet()) {
            BaseTagGroupModel temp = new BaseTagGroupModel();
            temp.setAliasKey(key);
            temp.setTagList(sortCityListMap.get(key));
            tagMap.put(key, temp);
        }

        return tagMap;
    }


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
    @Override
    public Map<String, BaseTagGroupModel> getFilterTagList(List<Integer> ids) throws BizException {
        Map<String, BaseTagGroupModel> filterTagListMap = new HashMap<String, BaseTagGroupModel>();
        List<BaseTagGroupModel> filterTagList = tagGroupModelMapper.selectTagGroups(ids);
        for (BaseTagGroupModel tagGroupModel : filterTagList) {
            filterTagListMap.put(tagGroupModel.getAliasKey(), tagGroupModel);
        }
        return filterTagListMap;
    }


    private Map<String, List<BaseTagModel>> sortCityTagList(List<BaseTagModel> cityTagList) {

        Map<String, List<BaseTagModel>> cityTagMap = new HashMap<String, List<BaseTagModel>>();

        for (BaseTagModel baseTagModel : cityTagList) {
            List obj = cityTagMap.get(baseTagModel.getIndexName());
            if (null == obj) {
                List tempCityList = new ArrayList();
                tempCityList.add(baseTagModel);
                cityTagMap.put(baseTagModel.getIndexName(), tempCityList);
            } else {
                obj.add(baseTagModel);
            }
        }

        return cityTagMap;
    }
}
