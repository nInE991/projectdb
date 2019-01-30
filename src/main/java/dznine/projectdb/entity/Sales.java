package dznine.projectdb.entity;

import javax.persistence.*;

@Entity
@Table(name = "tbl_sales")
public class Sales {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.DETACH)
    @JoinColumn(name="products_id",nullable = false)
    private Products products;
    @Column(nullable = false)
    private Integer count;
    @Column(nullable = false)
    private Double total;
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "counterparties_id", nullable = false)
    private Counterparties counterparties;

    public Sales() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Products getProducts() {
        return products;
    }

    public void setProducts(Products products) {
        this.products = products;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Counterparties getCounterparties() {
        return counterparties;
    }

    public void setCounterparties(Counterparties counterparties) {
        this.counterparties = counterparties;
    }
}
