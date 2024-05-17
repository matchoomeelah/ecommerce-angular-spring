package com.mattmiller.ecommerce.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.util.Date;

@Entity // Defines the class as a table for our db essentially
@Table(name="product") // Only necessary to provide explicit name for table, otherwise defaults to "Product"
@Data // Auto-generates our getters and setters
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Akin to AUTOINCREMENT
    @Column(name = "id") // These are necessary only to explicitly define column names
    private Long id;

    @Column(name = "sku") // Necessary in cases like unitPrice needing to be unit_price in the db
    private String sku;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "unit_price")
    private BigDecimal unitPrice;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "active")
    private Boolean active;

    @Column(name = "units_in_stock")
    private int unitsInStock;

    @Column(name = "date_created")
    @CreationTimestamp
    private Date dateCreated;

    @UpdateTimestamp
    @Column(name = "last_updated")
    private Date lastUpdated;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private ProductCategory category;
}
