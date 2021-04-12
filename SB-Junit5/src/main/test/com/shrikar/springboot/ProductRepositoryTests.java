package com.shrikar.springboot;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
 
@DataJpaTest
public class ProductRepositoryTests {
	
    @Autowired
    private TestEntityManager entityManager;
     
    @Autowired
    private ProductRepository repository;
     
    @Test
    public void testSaveNewProduct() {
    	 Product p = new Product("Hearts",9.5f);
    	 Product savedproduct = repository.save(p);
    	 assertNotNull(savedproduct);
    }
    @Test
    public void testfindByNameMethod() {
    	String name = "Hearts";
    	Product p = repository.findByName(name);
    	assertThat(p.getName()).isEqualTo(name);
    }
    
    @Test
    public void testFindAllProduct() {
    	List<Product> products = repository.findAll();
    	assertNotNull(products);
    }
    
}