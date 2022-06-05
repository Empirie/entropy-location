package ch.fhnw.acrm.data.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class TestEntity {


    @Id
    @GeneratedValue
    private Long id;


    public TestEntity(Long id) {
        this.id = id;
    }

    public TestEntity() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return "TestEntity{" +
                "id=" + id +
                '}';
    }
}
