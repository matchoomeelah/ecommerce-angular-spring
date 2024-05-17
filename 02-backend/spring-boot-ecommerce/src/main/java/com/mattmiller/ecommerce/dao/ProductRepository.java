package com.mattmiller.ecommerce.dao;

import com.mattmiller.ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

// By extending JpaRepository<T, ID>, we gain access to basic CRUD operations
// and pagination and sorting!!
@CrossOrigin("http://localhost:4200")
public interface ProductRepository extends JpaRepository<Product, Long> {

}
