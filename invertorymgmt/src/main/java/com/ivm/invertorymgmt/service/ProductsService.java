package com.ivm.invertorymgmt.service;

import com.ivm.invertorymgmt.dto.ProductsDTO;

import java.util.List;

public interface ProductsService {
    List<ProductsDTO> getAllProducts() throws Exception;

    ProductsDTO saveProduct(ProductsDTO productsDTO) throws Exception;

    void deleteById(Long id) throws Exception;
}
