package com.luv2code.luv2codeecommerce.dao;

import com.luv2code.luv2codeecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Long> {
}
