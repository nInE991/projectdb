package dznine.projectdb.entity;

import javax.persistence.*;

@Entity
@Table(name = "tbl_counterparties")
public class Counterparties {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false,unique = true)
    private String name;
    @Column(nullable = false,unique = true)
    private String telephone;
    @Column(nullable = false)
    private String address;
    @Column(nullable = false)
    private String director;

    public Counterparties() {

    }

    public Counterparties(String name, String telephone, String address, String directior) {
        this.name = name;
        this.telephone = telephone;
        this.address = address;
        this.director = directior;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Counterparties(Integer id, String name, String telephone, String address, String directior) {
        this.id = id;
        this.name = name;
        this.telephone = telephone;
        this.address = address;
        this.director = directior;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDirectior() {
        return director;
    }

    public void setDirectior(String director) {
        this.director = director;
    }
}
