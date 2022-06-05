package ch.fhnw.acrm.data.repository;

import ch.fhnw.acrm.data.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}