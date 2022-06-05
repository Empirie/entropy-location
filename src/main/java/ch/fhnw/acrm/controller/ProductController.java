package ch.fhnw.acrm.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {

    @Autowired
    private ProductController productController;


    @GetMapping("/product")
    public String getProductView(){return "user/product.html";}

}
