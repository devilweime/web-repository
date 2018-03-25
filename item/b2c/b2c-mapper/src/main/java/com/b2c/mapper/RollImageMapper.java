package com.b2c.mapper;

import com.b2c.model.RollImage;
import com.b2c.model.RollImageExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RollImageMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table roll_image
     *
     * @mbg.generated Tue Jul 18 14:50:59 GMT+08:00 2017
     */
    long countByExample(RollImageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table roll_image
     *
     * @mbg.generated Tue Jul 18 14:50:59 GMT+08:00 2017
     */
    int deleteByExample(RollImageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table roll_image
     *
     * @mbg.generated Tue Jul 18 14:50:59 GMT+08:00 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table roll_image
     *
     * @mbg.generated Tue Jul 18 14:50:59 GMT+08:00 2017
     */
    int insert(RollImage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table roll_image
     *
     * @mbg.generated Tue Jul 18 14:50:59 GMT+08:00 2017
     */
    int insertSelective(RollImage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table roll_image
     *
     * @mbg.generated Tue Jul 18 14:50:59 GMT+08:00 2017
     */
    List<RollImage> selectByExample(RollImageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table roll_image
     *
     * @mbg.generated Tue Jul 18 14:50:59 GMT+08:00 2017
     */
    RollImage selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table roll_image
     *
     * @mbg.generated Tue Jul 18 14:50:59 GMT+08:00 2017
     */
    int updateByExampleSelective(@Param("record") RollImage record, @Param("example") RollImageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table roll_image
     *
     * @mbg.generated Tue Jul 18 14:50:59 GMT+08:00 2017
     */
    int updateByExample(@Param("record") RollImage record, @Param("example") RollImageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table roll_image
     *
     * @mbg.generated Tue Jul 18 14:50:59 GMT+08:00 2017
     */
    int updateByPrimaryKeySelective(RollImage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table roll_image
     *
     * @mbg.generated Tue Jul 18 14:50:59 GMT+08:00 2017
     */
    int updateByPrimaryKey(RollImage record);
    
    List<RollImage> getImageList(byte flag);
}