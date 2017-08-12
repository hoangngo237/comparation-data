package com.item.service;



import com.item.entities.Product;

import java.util.List;

/**
 * Created by tthn on 8/11/2017.
 */

public interface IProductService {
    void addProduct(Product product);

    public void removeProduct(int id);

    public List<Product> listAllproducts();
}
