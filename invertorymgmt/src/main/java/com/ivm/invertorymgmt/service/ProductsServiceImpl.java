package com.ivm.invertorymgmt.service;

import com.ivm.invertorymgmt.dto.ProductsDTO;
import com.ivm.invertorymgmt.entity.Products;
import com.ivm.invertorymgmt.repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductsServiceImpl implements ProductsService {

    @Autowired
    ProductsRepository productsRepository;


    @Override
    public List<ProductsDTO> getAllProducts() throws Exception {
        return productsRepository.findAll().stream().map(ProductsDTO::new).toList();
    }

    @Override
    public ProductsDTO saveProduct(ProductsDTO productsDTO) throws Exception {
        return new ProductsDTO(productsRepository.save(new Products(productsDTO)));
    }


    @Override
    public void deleteById(Long id) throws Exception {
        productsRepository.deleteById(id);
    }

}
