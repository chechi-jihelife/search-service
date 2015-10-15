package com.jihelife.search.web.action;

import com.jihelife.search.constants.ResultCode;
import com.jihelife.search.dto.SearchBaseModel;
import com.jihelife.search.dto.SearchQuery;
import com.jihelife.search.dto.SearchResult;
import com.jihelife.search.service.DataService;
import com.jihelife.search.service.SearchService;
import com.jihelife.search.service.ShareService;
import com.jihelife.search.web.BaseAction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * search-service
 * 通用搜索服务action,提供资源搜索服务的接口服务和搜索结果的数据库信息组装服务
 * Created by chechi on 2015/10/10.
 */
@Controller
public class SearchAction extends BaseAction {

    @Autowired
    SearchService searchService;

    /**
     * The Data service.通用数据组装加载服务,通过搜索引擎的ID查询资源信息表,加载需要的数据库数据.
     */
    @Autowired
    DataService dataService;

    /**
     * The Share service.提供统一资源分享接口服务.
     */
    @Autowired
    ShareService shareService;

    /**
     * Common search result.
     * 通用搜索接口服务
     *
     * @return the result map (String,Object).接口返回数据map.
     * @see SearchQuery
     */
    @ResponseBody
    @RequestMapping(value = "/search", method = RequestMethod.POST, produces = "application/json;charset=UTF-8", consumes = "application/json;charset=UTF-8")
    public Map<String, Object> commonSearch(@RequestBody SearchQuery query, @PageableDefault(page = 0, size = 5) Pageable pageable) {
        Page<SearchResult> searchResults = searchService.search(query, pageable);
        List<SearchBaseModel> searchList = dataService.setData(shareService.setShareInfo(searchResults.getContent()));
        result.put(ResultCode.RESULT_DATA, searchList);
        return result;
    }

}
