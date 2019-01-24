package dznine.projectdb.entity;

import javax.persistence.*;

@Entity
@Table(name = "tbl_components")
public class Components {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(unique = true,nullable = false)
    private String name;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "products_id",nullable = false)
    private Products products;
    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "units_id",nullable = false)
    private Units units;
    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name="balance_id",nullable = false)
    ComponentBalance componentBalance;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Products getProducts() {
        return products;
    }

    public void setProducts(Products products) {
        this.products = products;
    }

    public Units getUnits() {
        return units;
    }

    public void setUnits(Units units) {
        this.units = units;
    }

    public ComponentBalance getComponentBalance() {
        return componentBalance;
    }

    public void setComponentBalance(ComponentBalance componentBalance) {
        this.componentBalance = componentBalance;
    }
}
