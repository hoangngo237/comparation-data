package com.item.service.impl;

import com.google.common.collect.Lists;

import com.item.entities.ProductType;
import com.item.repository.ProductTypeRepository;
import com.item.service.IProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by tthn on 8/11/2017.
 */

@Service
public class ProductTypeService implements IProductTypeService {

    @Autowired
    Environment env;

    @Autowired
    ProductTypeRepository productTypeRepository;


    public void addType(ProductType productType) {
        productTypeRepository.save(productType.getCode(), productType.getName());
    }

    public void removeType(int id) {
        productTypeRepository.deleteProductTypeById(id);
    }

    public List<ProductType> listAllProductsType() {
        Iterable<ProductType> productTypes = productTypeRepository.findAll();

        return Lists.newArrayList(productTypes);
    }
}
