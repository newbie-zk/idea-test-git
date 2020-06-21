package com.newbie.service;

import com.newbie.domain.Product;

import java.util.List;

/**
 * 业务层接口
 */
public interface IProductService {
    public List<Product> findAll() throws Exception;
}
