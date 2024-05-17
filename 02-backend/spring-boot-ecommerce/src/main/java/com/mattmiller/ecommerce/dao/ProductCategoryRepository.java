package com.mattmiller.ecommerce.dao;

import com.mattmiller.ecommerce.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

// We define explicit names for our JSON key (productCategory)
// and the path we access our endpoint at ("product-category")
// because the auto behavior tries to pluralize and we don't want
@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(collectionResourceRel = "productCategory", path = "product-category")
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {

}
