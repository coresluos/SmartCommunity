package com.smartcommunity.mapper;

import com.smartcommunity.pojo.Decorate;
import com.smartcommunity.pojo.DecorateExample;

import edu.hust.smartcommunity.paginator.domain.PageList;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface DecorateMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table decorate
     *
     * @mbggenerated Tue Jan 20 13:50:49 CST 2015
     */
    int countByExample(DecorateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table decorate
     *
     * @mbggenerated Tue Jan 20 13:50:49 CST 2015
     */
    int deleteByExample(DecorateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table decorate
     *
     * @mbggenerated Tue Jan 20 13:50:49 CST 2015
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table decorate
     *
     * @mbggenerated Tue Jan 20 13:50:49 CST 2015
     */
    int insert(Decorate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table decorate
     *
     * @mbggenerated Tue Jan 20 13:50:49 CST 2015
     */
    int insertSelective(Decorate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table decorate
     *
     * @mbggenerated Tue Jan 20 13:50:49 CST 2015
     */
    List<Decorate> selectByExample(DecorateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table decorate
     *
     * @mbggenerated Tue Jan 20 13:50:49 CST 2015
     */
    Decorate selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table decorate
     *
     * @mbggenerated Tue Jan 20 13:50:49 CST 2015
     */
    int updateByExampleSelective(@Param("record") Decorate record, @Param("example") DecorateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table decorate
     *
     * @mbggenerated Tue Jan 20 13:50:49 CST 2015
     */
    int updateByExample(@Param("record") Decorate record, @Param("example") DecorateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table decorate
     *
     * @mbggenerated Tue Jan 20 13:50:49 CST 2015
     */
    int updateByPrimaryKeySelective(Decorate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table decorate
     *
     * @mbggenerated Tue Jan 20 13:50:49 CST 2015
     */
    int updateByPrimaryKey(Decorate record);
    /** add_y */

    PageList<Decorate> selectByExample(DecorateExample example,edu.hust.smartcommunity.paginator.domain.PageBounds pageBounds);
}