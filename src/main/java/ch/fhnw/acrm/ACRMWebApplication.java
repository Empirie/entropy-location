package ch.fhnw.acrm;

import ch.fhnw.acrm.business.service.ProductService;
import ch.fhnw.acrm.data.domain.Product;
import ch.fhnw.acrm.data.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.Entity;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnit;

@SpringBootApplication
public class ACRMWebApplication {






    public static void main(String[] args) {
        SpringApplication.run(ACRMWebApplication.class, args);










        System.out.println("boob");
    }
}
