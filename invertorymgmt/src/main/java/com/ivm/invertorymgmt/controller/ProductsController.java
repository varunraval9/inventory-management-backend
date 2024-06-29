package com.ivm.invertorymgmt.controller;

import com.ivm.invertorymgmt.dto.ProductsDTO;
import com.ivm.invertorymgmt.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/products")
public class ProductsController {

    @Autowired
    ProductsService productsService;

    @GetMapping("/get-all")
    @CrossOrigin(origins = "http://localhost:5173")
    public ResponseEntity<List<ProductsDTO>> getAllProducts() {
        try {
            return ResponseEntity.ok().body(productsService.getAllProducts());
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(null);
        }
    }

    @PutMapping("/save")
    @CrossOrigin(origins = "http://localhost:5173")
    public ResponseEntity<ProductsDTO> addProduct(@RequestBody ProductsDTO productsDTO) {
        try {
            return ResponseEntity.ok().body(productsService.saveProduct(productsDTO));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(null);
        }
    }

    @GetMapping("/delete/{id}")
    @CrossOrigin(origins = "http://localhost:5173")
    public ResponseEntity<String> delete(@PathVariable Long id) {
        try {
            productsService.deleteById(id);
            return ResponseEntity.ok().body("Product deleted successfully");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(null);
        }
    }
}
