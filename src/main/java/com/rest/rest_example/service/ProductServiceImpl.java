package com.rest.rest_example.service;

import com.rest.rest_example.model.Product;
import org.springframework.stereotype.Service;
import java.util.*;
@Service
public class ProductServiceImpl implements ProductService {

    @Override
    public List<Product> getAllProduct(){
        ArrayList<Product> products = new ArrayList<>();
        products.add(Product.builder().id(1).name("Mouse").price(500).build());
        products.add(Product.builder().id(2).name("Pen").price(100).build());
        return products;
    }
    @Override
    public Product getAllProduct(int id, String name) {
        ArrayList<Product> products = new ArrayList<>();
        products.add(Product.builder().id(1).name("Mouse").price(500).build());
        products.add(Product.builder().id(2).name("Pen").price(100).build());
        products.add(Product.builder().id(3).name("Mouse").price(1100).build());
        if (name == null) {
            Optional<Product> productOptional = products.stream().filter(product -> product.getId() == id).findFirst();
            if (productOptional.isPresent())
                return productOptional.get();
        } else {
            Optional<Product> productOptional = products.stream().filter(product -> product.getId() == id && product.getName().equals(name)).findFirst();
            if (productOptional.isPresent())
                return productOptional.get();
        }
        return null;
    }
}
