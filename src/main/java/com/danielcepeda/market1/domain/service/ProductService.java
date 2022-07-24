package com.danielcepeda.market1.domain.service;

import com.danielcepeda.market1.domain.Product;
import com.danielcepeda.market1.domain.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAll () {
        return productRepository.getAll();
    }
    public Optional<Product> getProduct (int productId) {
        return productRepository.getProduct(productId);
    }
    public Optional<List<Product>> getByCategory (int categoryId) {
        return productRepository.getByCategory(categoryId);
    }
    public Product save (Product product) {
        return productRepository.save(product);
    }
    public boolean delete (int productID) {
        return getProduct(productID).map(product -> {
            productRepository.delete(productID);
            return true;
        }).orElse(false);
//        if (getProduct(productID).isPresent()){
//            productRepository.delete(productID);
//            return true;
//        }else{
//            return false;
//        }
    }
}
