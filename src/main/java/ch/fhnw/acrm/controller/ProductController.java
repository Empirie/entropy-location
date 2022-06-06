package ch.fhnw.acrm.controller;


import ch.fhnw.acrm.data.domain.Customer;
import ch.fhnw.acrm.data.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductController productController;


    @GetMapping()
    public String getProductView(){return "user/product.html";}

    @GetMapping("/user/product")
    public String getProduct(){return "user/product.html";}

    @GetMapping(path = "product/allproducts", produces = "application/json")
    public List<Product> getProducts() {
        return productController.getProducts();

    }

}
