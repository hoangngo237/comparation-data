package com.item.repository;


import com.item.entities.Product;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


/**
 * Created by tthn on 8/11/2017.
 */

@Repository
public interface ProductRepository extends CrudRepository<Product, Long>{
    void deleteProductById(int id);

    @Modifying
    @Query(value = "Insert into product(name, price, company, code, product_type_id) VALUES (:name, :price, :company, :code, :product_type_id);", nativeQuery = true)
    @Transactional
    void save(@Param("name") String name, @Param("price") int price, @Param("company") String company, @Param("code") String code, @Param("product_type_id") int product_type_id);
}
