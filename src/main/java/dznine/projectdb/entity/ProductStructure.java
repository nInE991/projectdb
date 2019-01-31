package dznine.projectdb.entity;

import javax.persistence.*;

@Entity
@Table(name = "tbl_productStructure")
public class ProductStructure {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.DETACH)
    @JoinColumn(name = "products_id")
    private Products products;
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.DETACH)
    @JoinColumn(name = "components_id", nullable = false)
    private Components components;
    @Column(nullable = false)
    private Double count;

    public ProductStructure() {
    }

    public ProductStructure(Products products, Components components, Double count) {
        this.products = products;
        this.components = components;
        this.count = count;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Components getComponents() {
        return components;
    }

    public void setComponents(Components components) {
        this.components = components;
    }

    public Double getCount() {
        return count;
    }

    public void setCount(Double count) {
        this.count = count;
    }

    public Products getProducts() {
        return products;
    }

    public void setProducts(Products products) {
        this.products = products;
    }
}
