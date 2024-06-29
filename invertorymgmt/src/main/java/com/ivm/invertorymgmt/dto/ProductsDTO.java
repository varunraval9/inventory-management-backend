package com.ivm.invertorymgmt.dto;

import com.ivm.invertorymgmt.entity.Products;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * Data Transfer object of products class so any changes
 * which shouldn't be commited directly will not reflect into database
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductsDTO {

    private Long productId;

    private String productName;

    private String productImage;

    private String productDescription;

    private Long productStock;

    private LocalDateTime createdDate = LocalDateTime.now();

    private LocalDateTime updatedDate = LocalDateTime.now();

    public ProductsDTO(Products products) {
        this.productId = products.getProductId();
        this.productName = products.getProductName();
        this.productImage = products.getProductImage();
        this.productDescription = products.getProductDescription();
        this.productStock = products.getProductStock();
        this.createdDate = products.getCreatedDate();
        this.updatedDate = products.getUpdatedDate();
    }

}
