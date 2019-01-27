package dznine.projectdb.entity;

import javax.persistence.*;

@Entity
@Table(name ="tbl_products")
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(unique = true,nullable = false)
    private String name;
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "components_id", nullable = false)
    private ProductStructure productStructure;
    @Column(nullable = false)
    private Float price;

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

    public ProductStructure getProductStructure() {
        return productStructure;
    }

    public void setProductStructure(ProductStructure productStructure) {
        this.productStructure = productStructure;
    }
}
