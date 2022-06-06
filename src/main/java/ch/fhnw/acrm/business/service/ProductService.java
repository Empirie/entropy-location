package ch.fhnw.acrm.business.service;


import ch.fhnw.acrm.data.domain.Customer;
import ch.fhnw.acrm.data.domain.Product;
import ch.fhnw.acrm.data.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
//import ch.fhnw.acrm.data.domain.Product.*;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;
    @Autowired
    ProductService productService;

    public ProductService(ProductRepository productRepository, ProductService productService) {
        this.productRepository = productRepository;
        this.productService = productService;
    }

    public List<Product> findAllProducts() {
        return productRepository.findAll();

    }
}
