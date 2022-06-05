package ch.fhnw.acrm.business.service;


import ch.fhnw.acrm.data.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import ch.fhnw.acrm.data.domain.Product.*;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;
}
