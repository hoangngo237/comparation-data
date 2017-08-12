package com.item.controller;


import com.item.entities.Product;
import com.item.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by tthn on 8/11/2017.
 */

@RequestMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
@RestController
public class ProductController {
    @Autowired
    private IProductService productService;

    @RequestMapping(value = "/product", method = RequestMethod.POST)
    void create(@RequestBody Product product) {
        productService.addProduct(product);
    }

    @RequestMapping(value = "/product/{id}", method = RequestMethod.DELETE)
    void delete(@PathVariable("id") int id) {
        productService.removeProduct(id);
    }

    @RequestMapping(value="/product", method = RequestMethod.GET)
    List<Product> findAll() {
        return productService.listAllproducts();
    }
}
