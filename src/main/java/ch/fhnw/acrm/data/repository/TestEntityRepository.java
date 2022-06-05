package ch.fhnw.acrm.data.repository;

import ch.fhnw.acrm.data.domain.TestEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestEntityRepository extends JpaRepository<TestEntity, Long> {
}