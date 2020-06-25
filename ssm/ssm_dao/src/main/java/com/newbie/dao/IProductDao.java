package com.newbie.dao;

import com.newbie.domain.Product;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 持久层接口
 */
public interface IProductDao {
    @Select("select * from product")
    public List<Product> findAll() throws Exception;

    @Insert("insert into product(productNum,productName,cityName,departureTime,productPrice,productDesc,productStatus) values(#{productNum},#{productName},#{cityName},#{departureTime},#{productPrice},#{productDesc},#{productStatus})")
    void save(Product product);
}
