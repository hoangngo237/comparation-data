package com.item.service;



import com.item.entities.ProductType;

import java.util.List;

/**
 * Created by tthn on 8/11/2017.
 */
public interface IProductTypeService {
    void addType(ProductType productType);

    public void removeType(int id);

    public List<ProductType> listAllProductsType();
}
