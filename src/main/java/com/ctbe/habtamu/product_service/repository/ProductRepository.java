package com.ctbe.habtamu.product_service.repository;

import com.ctbe.habtamu.product_service.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    // Spring Data automatically generates the SQL for this method:
    List<Product> findByNameContainingIgnoreCase(String keyword);
    List<Product> findByCategory(String category);
}
