package com.b2c.mapper;

import com.b2c.model.ProductCategory;
import com.b2c.model.ProductCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductCategoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_category
     *
     * @mbg.generated Wed Jul 19 14:16:17 GMT+08:00 2017
     */
    long countByExample(ProductCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_category
     *
     * @mbg.generated Wed Jul 19 14:16:17 GMT+08:00 2017
     */
    int deleteByExample(ProductCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_category
     *
     * @mbg.generated Wed Jul 19 14:16:17 GMT+08:00 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_category
     *
     * @mbg.generated Wed Jul 19 14:16:17 GMT+08:00 2017
     */
    int insert(ProductCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_category
     *
     * @mbg.generated Wed Jul 19 14:16:17 GMT+08:00 2017
     */
    int insertSelective(ProductCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_category
     *
     * @mbg.generated Wed Jul 19 14:16:17 GMT+08:00 2017
     */
    List<ProductCategory> selectByExample(ProductCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_category
     *
     * @mbg.generated Wed Jul 19 14:16:17 GMT+08:00 2017
     */
    ProductCategory selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_category
     *
     * @mbg.generated Wed Jul 19 14:16:17 GMT+08:00 2017
     */
    int updateByExampleSelective(@Param("record") ProductCategory record, @Param("example") ProductCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_category
     *
     * @mbg.generated Wed Jul 19 14:16:17 GMT+08:00 2017
     */
    int updateByExample(@Param("record") ProductCategory record, @Param("example") ProductCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_category
     *
     * @mbg.generated Wed Jul 19 14:16:17 GMT+08:00 2017
     */
    int updateByPrimaryKeySelective(ProductCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_category
     *
     * @mbg.generated Wed Jul 19 14:16:17 GMT+08:00 2017
     */
    int updateByPrimaryKey(ProductCategory record);
}