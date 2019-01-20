package dznine.projectdb.entity;

import javax.persistence.*;

@Entity
@Table(name = "tbl_counterparties")
public class Counterparties {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false,unique = true)
    private String name;
    @Column(nullable = false,unique = true)
    private String telephone;
    @Column(nullable = false)
    private String address;
    @Column(nullable = false)
    private String directior;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getDirectior() {
        return directior;
    }

    public void setDirectior(String directior) {
        this.directior = directior;
    }
}
