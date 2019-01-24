package dznine.projectdb.entity;

import javax.persistence.*;

@Entity
@Table(name = "tbl_price")
public class Prices {
    @Id
    @GeneratedValue
    private Integer id;
    @Column(nullable = false)
    private Float price;
    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "products_id", nullable = false)
    private Products products;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Products getProducts() {
        return products;
    }

    public void setProducts(Products products) {
        this.products = products;
    }
}
