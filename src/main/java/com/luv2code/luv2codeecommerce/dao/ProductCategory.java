package com.luv2code.luv2codeecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "productCategory", path = "product-category")
public interface ProductCategory extends JpaRepository<com.luv2code.luv2codeecommerce.entity.ProductCategory, Long> {
}
