package com.newbie.dao;

import com.newbie.domain.Product;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 持久层接口
 */
public interface IProductDao {
    @Select("select * from product")
    public List<Product> findAll() throws Exception;
}
