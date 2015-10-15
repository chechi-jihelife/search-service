package com.jihelife.search.dto;

import java.io.Serializable;

/**
 * search-service
 * 通用查询接口查询参数数据传输对象
 * Created by chechi on 2015/10/10.
 */
public class SearchQuery implements Serializable {

    private String keyWords;

    private String destination;

    private String travelScene;


    /**
     * Gets key words.
     *
     * @return the key words 搜索关键字
     */
    public String getKeyWords() {
        return keyWords;
    }

    /**
     * Sets key words.
     *
     * @param keyWords the key words 搜索关键字
     */
    public void setKeyWords(String keyWords) {
        this.keyWords = keyWords;
    }

    /**
     * Gets destination.
     *
     * @return the destination 搜索目的地
     */
    public String getDestination() {
        return destination;
    }

    /**
     * Sets destination.
     *
     * @param destination the destination 搜索目的地
     */
    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * Gets travel scene.
     *
     * @return the travel scene 搜索旅游场景
     */
    public String getTravelScene() {
        return travelScene;
    }

    /**
     * Sets travel scene.
     *
     * @param travelScene the travel scene 搜索旅游场景
     */
    public void setTravelScene(String travelScene) {
        this.travelScene = travelScene;
    }

    @Override
    public String toString() {
        if (this.keyWords != null) {
            return this.keyWords;
        }
        if (this.destination != null) {
            return this.destination;
        }
        return "*:*";
    }
}
