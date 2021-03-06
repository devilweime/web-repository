package com.b2c.model;

import java.util.Date;

public class Product {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.id
     *
     * @mbg.generated Fri Jul 14 23:13:06 GMT+08:00 2017
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.name
     *
     * @mbg.generated Fri Jul 14 23:13:06 GMT+08:00 2017
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.price
     *
     * @mbg.generated Fri Jul 14 23:13:06 GMT+08:00 2017
     */
    private Integer price;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.images
     *
     * @mbg.generated Fri Jul 14 23:13:06 GMT+08:00 2017
     */
    private String images;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.sale_point
     *
     * @mbg.generated Fri Jul 14 23:13:06 GMT+08:00 2017
     */
    private String salePoint;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.category_id
     *
     * @mbg.generated Fri Jul 14 23:13:06 GMT+08:00 2017
     */
    private Integer categoryId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.category
     *
     * @mbg.generated Fri Jul 14 23:13:06 GMT+08:00 2017
     */
    private String category;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.create_time
     *
     * @mbg.generated Fri Jul 14 23:13:06 GMT+08:00 2017
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.update_time
     *
     * @mbg.generated Fri Jul 14 23:13:06 GMT+08:00 2017
     */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.create_user
     *
     * @mbg.generated Fri Jul 14 23:13:06 GMT+08:00 2017
     */
    private String createUser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.update_user
     *
     * @mbg.generated Fri Jul 14 23:13:06 GMT+08:00 2017
     */
    private String updateUser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.flag
     *
     * @mbg.generated Fri Jul 14 23:13:06 GMT+08:00 2017
     */
    private Byte flag;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.id
     *
     * @return the value of product.id
     *
     * @mbg.generated Fri Jul 14 23:13:06 GMT+08:00 2017
     */
    
    //描述id
    private Integer descId;
    //描述内容
    private String desc;
    
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.id
     *
     * @param id the value for product.id
     *
     * @mbg.generated Fri Jul 14 23:13:06 GMT+08:00 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.name
     *
     * @return the value of product.name
     *
     * @mbg.generated Fri Jul 14 23:13:06 GMT+08:00 2017
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.name
     *
     * @param name the value for product.name
     *
     * @mbg.generated Fri Jul 14 23:13:06 GMT+08:00 2017
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.price
     *
     * @return the value of product.price
     *
     * @mbg.generated Fri Jul 14 23:13:06 GMT+08:00 2017
     */
    public Integer getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.price
     *
     * @param price the value for product.price
     *
     * @mbg.generated Fri Jul 14 23:13:06 GMT+08:00 2017
     */
    public void setPrice(Integer price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.images
     *
     * @return the value of product.images
     *
     * @mbg.generated Fri Jul 14 23:13:06 GMT+08:00 2017
     */
    public String getImages() {
        return images;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.images
     *
     * @param images the value for product.images
     *
     * @mbg.generated Fri Jul 14 23:13:06 GMT+08:00 2017
     */
    public void setImages(String images) {
        this.images = images == null ? null : images.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.sale_point
     *
     * @return the value of product.sale_point
     *
     * @mbg.generated Fri Jul 14 23:13:06 GMT+08:00 2017
     */
    public String getSalePoint() {
        return salePoint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.sale_point
     *
     * @param salePoint the value for product.sale_point
     *
     * @mbg.generated Fri Jul 14 23:13:06 GMT+08:00 2017
     */
    public void setSalePoint(String salePoint) {
        this.salePoint = salePoint == null ? null : salePoint.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.category_id
     *
     * @return the value of product.category_id
     *
     * @mbg.generated Fri Jul 14 23:13:06 GMT+08:00 2017
     */
    public Integer getCategoryId() {
        return categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.category_id
     *
     * @param categoryId the value for product.category_id
     *
     * @mbg.generated Fri Jul 14 23:13:06 GMT+08:00 2017
     */
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.category
     *
     * @return the value of product.category
     *
     * @mbg.generated Fri Jul 14 23:13:06 GMT+08:00 2017
     */
    public String getCategory() {
        return category;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.category
     *
     * @param category the value for product.category
     *
     * @mbg.generated Fri Jul 14 23:13:06 GMT+08:00 2017
     */
    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.create_time
     *
     * @return the value of product.create_time
     *
     * @mbg.generated Fri Jul 14 23:13:06 GMT+08:00 2017
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.create_time
     *
     * @param createTime the value for product.create_time
     *
     * @mbg.generated Fri Jul 14 23:13:06 GMT+08:00 2017
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.update_time
     *
     * @return the value of product.update_time
     *
     * @mbg.generated Fri Jul 14 23:13:06 GMT+08:00 2017
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.update_time
     *
     * @param updateTime the value for product.update_time
     *
     * @mbg.generated Fri Jul 14 23:13:06 GMT+08:00 2017
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.create_user
     *
     * @return the value of product.create_user
     *
     * @mbg.generated Fri Jul 14 23:13:06 GMT+08:00 2017
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.create_user
     *
     * @param createUser the value for product.create_user
     *
     * @mbg.generated Fri Jul 14 23:13:06 GMT+08:00 2017
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.update_user
     *
     * @return the value of product.update_user
     *
     * @mbg.generated Fri Jul 14 23:13:06 GMT+08:00 2017
     */
    public String getUpdateUser() {
        return updateUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.update_user
     *
     * @param updateUser the value for product.update_user
     *
     * @mbg.generated Fri Jul 14 23:13:06 GMT+08:00 2017
     */
    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.flag
     *
     * @return the value of product.flag
     *
     * @mbg.generated Fri Jul 14 23:13:06 GMT+08:00 2017
     */
    public Byte getFlag() {
        return flag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.flag
     *
     * @param flag the value for product.flag
     *
     * @mbg.generated Fri Jul 14 23:13:06 GMT+08:00 2017
     */
    public void setFlag(Byte flag) {
        this.flag = flag;
    }

	public Integer getDescId() {
		return descId;
	}

	public void setDescId(Integer descId) {
		this.descId = descId;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
}