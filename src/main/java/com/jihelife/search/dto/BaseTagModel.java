package com.jihelife.search.dto;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.Date;

@JsonSerialize(include= JsonSerialize.Inclusion.NON_NULL)
public class BaseTagModel {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_tag.id
     *
     * @mbggenerated Wed Oct 14 17:56:25 CST 2015
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_tag.gid
     *
     * @mbggenerated Wed Oct 14 17:56:25 CST 2015
     */
    private Integer gid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_tag.name
     *
     * @mbggenerated Wed Oct 14 17:56:25 CST 2015
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_tag.index_name
     *
     * @mbggenerated Wed Oct 14 17:56:25 CST 2015
     */
    private String indexName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_tag.update_time
     *
     * @mbggenerated Wed Oct 14 17:56:25 CST 2015
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_tag.create_time
     *
     * @mbggenerated Wed Oct 14 17:56:25 CST 2015
     */
    private Date createTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_tag.id
     *
     * @return the value of base_tag.id
     *
     * @mbggenerated Wed Oct 14 17:56:25 CST 2015
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_tag.id
     *
     * @param id the value for base_tag.id
     *
     * @mbggenerated Wed Oct 14 17:56:25 CST 2015
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_tag.gid
     *
     * @return the value of base_tag.gid
     *
     * @mbggenerated Wed Oct 14 17:56:25 CST 2015
     */
    public Integer getGid() {
        return gid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_tag.gid
     *
     * @param gid the value for base_tag.gid
     *
     * @mbggenerated Wed Oct 14 17:56:25 CST 2015
     */
    public void setGid(Integer gid) {
        this.gid = gid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_tag.name
     *
     * @return the value of base_tag.name
     *
     * @mbggenerated Wed Oct 14 17:56:25 CST 2015
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_tag.name
     *
     * @param name the value for base_tag.name
     *
     * @mbggenerated Wed Oct 14 17:56:25 CST 2015
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_tag.index_name
     *
     * @return the value of base_tag.index_name
     *
     * @mbggenerated Wed Oct 14 17:56:25 CST 2015
     */
    public String getIndexName() {
        return indexName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_tag.index_name
     *
     * @param indexName the value for base_tag.index_name
     *
     * @mbggenerated Wed Oct 14 17:56:25 CST 2015
     */
    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_tag.update_time
     *
     * @return the value of base_tag.update_time
     *
     * @mbggenerated Wed Oct 14 17:56:25 CST 2015
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_tag.update_time
     *
     * @param updateTime the value for base_tag.update_time
     *
     * @mbggenerated Wed Oct 14 17:56:25 CST 2015
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_tag.create_time
     *
     * @return the value of base_tag.create_time
     *
     * @mbggenerated Wed Oct 14 17:56:25 CST 2015
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_tag.create_time
     *
     * @param createTime the value for base_tag.create_time
     *
     * @mbggenerated Wed Oct 14 17:56:25 CST 2015
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}