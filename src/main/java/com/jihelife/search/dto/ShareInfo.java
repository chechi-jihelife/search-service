package com.jihelife.search.dto;

import java.io.Serializable;

/**
 * search-service
 * 资源分享基础信息
 * Created by chechi on 2015/10/12.
 */
public class ShareInfo implements Serializable {

    private String title;

    private String desc;

    private String imageUrl;

    private String shareLink;

    /**
     * Gets title.
     *
     * @return the title.分享资源的分享标题.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets title.
     *
     * @param title the title.分享资源的分享标题.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Gets desc.
     *
     * @return the desc.分享资源的分享描述.
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets desc.
     *
     * @param desc the desc.分享资源的分享描述.
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * Gets image url.
     *
     * @return the image url.分享资源的图片地址.
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * Sets image url.
     *
     * @param imageUrl the image url.分享资源的图片地址.
     */
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    /**
     * Gets share link.
     *
     * @return the share link .分享资源的分享链接地址.
     */
    public String getShareLink() {
        return shareLink;
    }

    /**
     * Sets share link.
     *
     * @param shareLink the share link .分享资源的分享链接地址.
     */
    public void setShareLink(String shareLink) {
        this.shareLink = shareLink;
    }
}
