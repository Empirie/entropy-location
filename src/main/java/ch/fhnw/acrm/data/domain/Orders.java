package ch.fhnw.acrm.data.domain;

import javax.persistence.*;

@Entity
//@Table(name = "orders")
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long oid;
    private String oname;
    private int pamount;


    public Orders(Long id, Long oid, String oname, int pamount) {
        this.id = id;
        this.oid = oid;
        this.oname = oname;
        this.pamount = pamount;
    }

    public Orders() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOid() {
        return oid;
    }

    public void setOid(Long oid) {
        this.oid = oid;
    }

    public String getOname() {
        return oname;
    }

    public void setOname(String oname) {
        this.oname = oname;
    }

    public int getPamount() {
        return pamount;
    }

    public void setPamount(int pamount) {
        this.pamount = pamount;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", oid=" + oid +
                ", oname='" + oname + '\'' +
                ", pamount=" + pamount +
                '}';
    }
}
