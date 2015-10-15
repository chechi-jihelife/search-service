package com.jihelife.search.dto;

import java.io.Serializable;

/**
 * search-service
 * 数据传输对象基础类型定义,数据传输的基本属性定义在这个类,
 * 子类共享基础属性.
 * Created by chechi on 2015/10/12.
 */
public class SearchBaseModel implements Serializable {


    private Long id;

    private Integer type;

    private String title;

    private String img;

    private ShareInfo shareInfo;

    private SearchDataBase object;


    /**
     * Gets share info.
     * 获取资源分享信息
     *
     * @return the share info. 资源的分享信息数据.
     * @see com.jihelife.search.dto.ShareInfo
     */
    public ShareInfo getShareInfo() {
        return shareInfo;
    }

    /**
     * Sets share info.
     * 设置资源分享信息
     *
     * @param shareInfo the share info.资源的分享信息数据.
     * @see com.jihelife.search.dto.ShareInfo
     */
    public void setShareInfo(ShareInfo shareInfo) {
        this.shareInfo = shareInfo;
    }
}
