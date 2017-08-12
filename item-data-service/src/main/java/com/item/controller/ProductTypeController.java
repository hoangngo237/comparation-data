package com.item.controller;


import com.item.entities.ProductType;
import com.item.service.IProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by tthn on 8/11/2017.
 */

@RequestMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
@RestController
public class ProductTypeController {
    @Autowired
    private IProductTypeService productTypeService;

    @RequestMapping(value = "/product_type", method = RequestMethod.POST)
    void create(@RequestBody ProductType type) {

        productTypeService.addType(type);

    }

    @RequestMapping(value = "/product_type/{id}", method = RequestMethod.DELETE)
    void delete(@PathVariable("id") int id) {
        productTypeService.removeType(id);
    }

    @RequestMapping(value="/product_type", method = RequestMethod.GET)
    List<ProductType> findAll() {
        return productTypeService.listAllProductsType();
    }

}
