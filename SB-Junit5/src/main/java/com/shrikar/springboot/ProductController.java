package com.shrikar.springboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	
      @Autowired
      private ProductRepository productRepository;
      
      public ProductController(ProductRepository productRepository) {
    	  this.productRepository = productRepository;
      }
      
      @GetMapping("/productlist")
      public List<Product> allProducts(){
    	  return productRepository.findAll();
      }
      @GetMapping("/{name}")
      public Product findByName1(@PathVariable String name){
    	  return productRepository.findByName(name);
      }
      
      @PostMapping("/create")
      public Product createProduct(@RequestBody Product product){
    	  return productRepository.save(product);
      }
      
      
}
