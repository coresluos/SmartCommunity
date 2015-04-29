package com.smartcommunity.mapper;

import com.smartcommunity.pojo.Device;
import com.smartcommunity.pojo.DeviceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeviceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table device
     *
     * @mbggenerated Tue Jan 06 14:55:46 CST 2015
     */
    int countByExample(DeviceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table device
     *
     * @mbggenerated Tue Jan 06 14:55:46 CST 2015
     */
    int deleteByExample(DeviceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table device
     *
     * @mbggenerated Tue Jan 06 14:55:46 CST 2015
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table device
     *
     * @mbggenerated Tue Jan 06 14:55:46 CST 2015
     */
    int insert(Device record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table device
     *
     * @mbggenerated Tue Jan 06 14:55:46 CST 2015
     */
    int insertSelective(Device record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table device
     *
     * @mbggenerated Tue Jan 06 14:55:46 CST 2015
     */
    List<Device> selectByExample(DeviceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table device
     *
     * @mbggenerated Tue Jan 06 14:55:46 CST 2015
     */
    Device selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table device
     *
     * @mbggenerated Tue Jan 06 14:55:46 CST 2015
     */
    int updateByExampleSelective(@Param("record") Device record, @Param("example") DeviceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table device
     *
     * @mbggenerated Tue Jan 06 14:55:46 CST 2015
     */
    int updateByExample(@Param("record") Device record, @Param("example") DeviceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table device
     *
     * @mbggenerated Tue Jan 06 14:55:46 CST 2015
     */
    int updateByPrimaryKeySelective(Device record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table device
     *
     * @mbggenerated Tue Jan 06 14:55:46 CST 2015
     */
    int updateByPrimaryKey(Device record);
}