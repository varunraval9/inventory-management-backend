package com.ivm.invertorymgmt.entity;

import com.ivm.invertorymgmt.dto.ProductsDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "tbl_products")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Products {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Long productId;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "product_image")
    private String productImage;

    @Column(name = "product_description")
    private String productDescription;

    @Column(name = "product_stock")
    private Long productStock;

    @Column(name = "created_date")
    private LocalDateTime createdDate = LocalDateTime.now();

    @Column(name = "updated_date")
    private LocalDateTime updatedDate = LocalDateTime.now();


    public Products(ProductsDTO productsDTO) {
        this.productId = productsDTO.getProductId();
        this.productName = productsDTO.getProductName();
        this.productImage = productsDTO.getProductImage();
        this.productDescription = productsDTO.getProductDescription();
        this.productStock = productsDTO.getProductStock();
        this.createdDate = productsDTO.getCreatedDate();
        this.updatedDate = productsDTO.getUpdatedDate();
    }
}
