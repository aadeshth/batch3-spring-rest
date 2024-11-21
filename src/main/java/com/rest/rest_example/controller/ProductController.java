package com.rest.rest_example.controller;

import com.rest.rest_example.model.Product;
import com.rest.rest_example.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/products")
    public List<Product> getProductList()
    {
        return productService.getAllProduct();
    }
    @GetMapping("/products/{id}")
    public Product getProductById(@PathVariable("id") int id, @RequestParam(value = "name",required = false) String name)
    {
        return productService.getAllProduct(id, name);
    }

}
