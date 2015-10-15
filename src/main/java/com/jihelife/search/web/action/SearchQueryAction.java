package com.jihelife.search.web.action;

import com.jihelife.search.constants.ResultCode;
import com.jihelife.search.exception.BizException;
import com.jihelife.search.service.BaseTagService;
import com.jihelife.search.web.BaseAction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * search-service
 * Created by chechi on 2015/10/13.
 */
@Controller
public class SearchQueryAction extends BaseAction {

    @Autowired
    BaseTagService baseTagService;

    /**
     * Gets price query parameter.
     * 获取搜索价格范围列表
     *
     * @return the price query parameter
     */
    @ResponseBody
    @RequestMapping(value = "/parameter/query/filterTagList")
    public Map<String, Object> getFilterTagList() throws BizException {
        List<Integer> ids = new ArrayList<Integer>(2);
        ids.add(3);
        result.put(ResultCode.RESULT_DATA, baseTagService.getFilterTagList(ids));
        return result;
    }


    /**
     * Gets query tags list.
     * 获取搜索关键词标签列表信息
     *
     * @return the query tags list
     * @throws BizException the biz exception
     * @see com.jihelife.search.dto.BaseTagGroupModel
     * @see com.jihelife.search.dto.BaseTagModel
     */
    @ResponseBody
    @RequestMapping(value = "/parameter/query/tagsList")
    public Map<String, Object> getQueryTagsList() throws BizException {
        List<Integer> ids = new ArrayList<Integer>(2);
        ids.add(1);
        ids.add(2);
        result.put(ResultCode.RESULT_DATA, baseTagService.getTagMap(ids));
        return result;
    }


}
