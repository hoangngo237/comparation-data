package com.item.service.impl;

import com.google.common.collect.Lists;

import com.item.entities.Product;
import com.item.repository.ProductRepository;
import com.item.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by tthn on 8/11/2017.
 */

@Service
public class ProductService implements IProductService {

    @Autowired
    Environment env;

    @Autowired
    private ProductRepository productRepository;

    public void addProduct(Product product) {
        productRepository.save(product.getName(), product.getPrice(), product.getCompany(), product.getCode(), product.getProductTypeId());
    }

    public void removeProduct(int id) {
        productRepository.deleteProductById(id);
    }

    public List<Product> listAllproducts() {
        Iterable<Product> products = productRepository.findAll();

        return Lists.newArrayList(products);
    }
}
