package dznine.projectdb.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name ="tbl_products")
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(unique = true,nullable = false)
    private String name;
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "products_id")
    private Set<ProductStructure> productStructure;
    @Column(nullable = false)
    private Float price;

    public Products() {
    }

    public Products(String name, Set<ProductStructure> productStructure, Float price) {
        this.name = name;
        this.productStructure = productStructure;
        this.price = price;
    }

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

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Set<ProductStructure> getProductStructure() {
        return productStructure;
    }

    public void setProductStructure(Set<ProductStructure> productStructure) {
        this.productStructure = productStructure;
    }
}
