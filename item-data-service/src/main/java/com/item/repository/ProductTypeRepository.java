package com.item.repository;



import com.item.entities.ProductType;
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
public interface ProductTypeRepository extends CrudRepository<ProductType, Long> {
    void deleteProductTypeById(int id);

    @Modifying
    @Query(value = "Insert into product_type(code, name) VALUES (:code, :name);", nativeQuery = true)
    @Transactional
    void save(@Param("code") String code, @Param("name") String name);
}
