package com.aos.productservice.controller;


import com.aos.productservice.model.Product;
import com.aos.productservice.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {

   private final ProductRepository productRepository;

    @GetMapping
    @ResponseStatus( HttpStatus.OK)
    public List<Product> findAll(){
     return (List<Product>) productRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody Product product){
           productRepository.save(product);
    }
}
