package com.jihelife.search.dto;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.Date;
import java.util.List;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class BaseTagGroupModel {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_tag_group.id
     *
     * @mbggenerated Wed Oct 14 17:56:25 CST 2015
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_tag_group.name
     *
     * @mbggenerated Wed Oct 14 17:56:25 CST 2015
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_tag_group.alias_name
     *
     * @mbggenerated Wed Oct 14 17:56:25 CST 2015
     */
    private String aliasName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_tag_group.alias_key
     *
     * @mbggenerated Wed Oct 14 17:56:25 CST 2015
     */
    private String aliasKey;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_tag_group.update_time
     *
     * @mbggenerated Wed Oct 14 17:56:25 CST 2015
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_tag_group.create_time
     *
     * @mbggenerated Wed Oct 14 17:56:25 CST 2015
     */
    private Date createTime;

    private List<BaseTagModel> tagList;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_tag_group.id
     *
     * @return the value of base_tag_group.id
     * @mbggenerated Wed Oct 14 17:56:25 CST 2015
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_tag_group.id
     *
     * @param id the value for base_tag_group.id
     * @mbggenerated Wed Oct 14 17:56:25 CST 2015
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_tag_group.name
     *
     * @return the value of base_tag_group.name
     * @mbggenerated Wed Oct 14 17:56:25 CST 2015
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_tag_group.name
     *
     * @param name the value for base_tag_group.name
     * @mbggenerated Wed Oct 14 17:56:25 CST 2015
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_tag_group.alias_name
     *
     * @return the value of base_tag_group.alias_name
     * @mbggenerated Wed Oct 14 17:56:25 CST 2015
     */
    public String getAliasName() {
        return aliasName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_tag_group.alias_name
     *
     * @param aliasName the value for base_tag_group.alias_name
     * @mbggenerated Wed Oct 14 17:56:25 CST 2015
     */
    public void setAliasName(String aliasName) {
        this.aliasName = aliasName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_tag_group.alias_key
     *
     * @return the value of base_tag_group.alias_key
     * @mbggenerated Wed Oct 14 17:56:25 CST 2015
     */
    public String getAliasKey() {
        return aliasKey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_tag_group.alias_key
     *
     * @param aliasKey the value for base_tag_group.alias_key
     * @mbggenerated Wed Oct 14 17:56:25 CST 2015
     */
    public void setAliasKey(String aliasKey) {
        this.aliasKey = aliasKey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_tag_group.update_time
     *
     * @return the value of base_tag_group.update_time
     * @mbggenerated Wed Oct 14 17:56:25 CST 2015
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_tag_group.update_time
     *
     * @param updateTime the value for base_tag_group.update_time
     * @mbggenerated Wed Oct 14 17:56:25 CST 2015
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_tag_group.create_time
     *
     * @return the value of base_tag_group.create_time
     * @mbggenerated Wed Oct 14 17:56:25 CST 2015
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_tag_group.create_time
     *
     * @param createTime the value for base_tag_group.create_time
     * @mbggenerated Wed Oct 14 17:56:25 CST 2015
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public List<BaseTagModel> getTagList() {
        return tagList;
    }

    public void setTagList(List<BaseTagModel> tagList) {
        this.tagList = tagList;
    }
}