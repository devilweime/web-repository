package com.b2c.model;

public class ProductCategory {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_category.id
     *
     * @mbg.generated Wed Jul 19 14:16:17 GMT+08:00 2017
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_category.pid
     *
     * @mbg.generated Wed Jul 19 14:16:17 GMT+08:00 2017
     */
    private Integer pid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_category.name
     *
     * @mbg.generated Wed Jul 19 14:16:17 GMT+08:00 2017
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_category.flag
     *
     * @mbg.generated Wed Jul 19 14:16:17 GMT+08:00 2017
     */
    private Byte flag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_category.is_parent
     *
     * @mbg.generated Wed Jul 19 14:16:17 GMT+08:00 2017
     */
    private Byte isParent;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_category.id
     *
     * @return the value of product_category.id
     *
     * @mbg.generated Wed Jul 19 14:16:17 GMT+08:00 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_category.id
     *
     * @param id the value for product_category.id
     *
     * @mbg.generated Wed Jul 19 14:16:17 GMT+08:00 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_category.pid
     *
     * @return the value of product_category.pid
     *
     * @mbg.generated Wed Jul 19 14:16:17 GMT+08:00 2017
     */
    public Integer getPid() {
        return pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_category.pid
     *
     * @param pid the value for product_category.pid
     *
     * @mbg.generated Wed Jul 19 14:16:17 GMT+08:00 2017
     */
    public void setPid(Integer pid) {
        this.pid = pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_category.name
     *
     * @return the value of product_category.name
     *
     * @mbg.generated Wed Jul 19 14:16:17 GMT+08:00 2017
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_category.name
     *
     * @param name the value for product_category.name
     *
     * @mbg.generated Wed Jul 19 14:16:17 GMT+08:00 2017
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_category.flag
     *
     * @return the value of product_category.flag
     *
     * @mbg.generated Wed Jul 19 14:16:17 GMT+08:00 2017
     */
    public Byte getFlag() {
        return flag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_category.flag
     *
     * @param flag the value for product_category.flag
     *
     * @mbg.generated Wed Jul 19 14:16:17 GMT+08:00 2017
     */
    public void setFlag(Byte flag) {
        this.flag = flag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_category.is_parent
     *
     * @return the value of product_category.is_parent
     *
     * @mbg.generated Wed Jul 19 14:16:17 GMT+08:00 2017
     */
    public Byte getIsParent() {
        return isParent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_category.is_parent
     *
     * @param isParent the value for product_category.is_parent
     *
     * @mbg.generated Wed Jul 19 14:16:17 GMT+08:00 2017
     */
    public void setIsParent(Byte isParent) {
        this.isParent = isParent;
    }
}