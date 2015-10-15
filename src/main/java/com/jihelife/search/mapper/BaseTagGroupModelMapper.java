package com.jihelife.search.mapper;

import com.jihelife.search.dto.BaseTagGroupModel;
import com.jihelife.search.dto.BaseTagGroupModelExample;
import com.jihelife.search.dto.BaseTagModel;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BaseTagGroupModelMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_tag_group
     *
     * @mbggenerated Wed Oct 14 17:56:25 CST 2015
     */
    int countByExample(BaseTagGroupModelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_tag_group
     *
     * @mbggenerated Wed Oct 14 17:56:25 CST 2015
     */
    int deleteByExample(BaseTagGroupModelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_tag_group
     *
     * @mbggenerated Wed Oct 14 17:56:25 CST 2015
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_tag_group
     *
     * @mbggenerated Wed Oct 14 17:56:25 CST 2015
     */
    int insert(BaseTagGroupModel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_tag_group
     *
     * @mbggenerated Wed Oct 14 17:56:25 CST 2015
     */
    int insertSelective(BaseTagGroupModel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_tag_group
     *
     * @mbggenerated Wed Oct 14 17:56:25 CST 2015
     */
    List<BaseTagGroupModel> selectByExample(BaseTagGroupModelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_tag_group
     *
     * @mbggenerated Wed Oct 14 17:56:25 CST 2015
     */
    BaseTagGroupModel selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_tag_group
     *
     * @mbggenerated Wed Oct 14 17:56:25 CST 2015
     */
    int updateByExampleSelective(@Param("record") BaseTagGroupModel record, @Param("example") BaseTagGroupModelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_tag_group
     *
     * @mbggenerated Wed Oct 14 17:56:25 CST 2015
     */
    int updateByExample(@Param("record") BaseTagGroupModel record, @Param("example") BaseTagGroupModelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_tag_group
     *
     * @mbggenerated Wed Oct 14 17:56:25 CST 2015
     */
    int updateByPrimaryKeySelective(BaseTagGroupModel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_tag_group
     *
     * @mbggenerated Wed Oct 14 17:56:25 CST 2015
     */
    int updateByPrimaryKey(BaseTagGroupModel record);

    /**
     * 获取搜索关键字分组标签
     *
     * @param ids
     * @return
     */
    List<BaseTagGroupModel> selectTagGroups(@Param("ids") List<Integer> ids);

    /**
     * 获取搜索目的标签列表
     *
     * @return
     */
    List<BaseTagModel> selectCityTagList();
}