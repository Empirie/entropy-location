package ch.fhnw.acrm.data.repository;

import ch.fhnw.acrm.data.domain.Agent;
import ch.fhnw.acrm.data.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {


}