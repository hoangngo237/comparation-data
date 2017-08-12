package com.item.entities;

import javax.persistence.*;

/**
 * Created by tthn on 8/11/2017.
 */

@Entity
@Table(name = "product_type")
public class ProductType {

    @Id
    @Column(name = "id")
    private Integer id;

    private String name;
    private String code;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
