package dznine.projectdb.entity;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tbl_buy")
public class Buy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private Date date;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.DETACH)
    @JoinColumn(name = "components_id", nullable = false)
    private Components components;
    @Column(nullable = false)
    private Integer count;
    @Column(nullable = false)
    private Double price;
    @Column(nullable = false)
    private Double total;

    public Buy() {
    }

    public Buy(Date date, Components components, Integer count, Double price, Double total) {
        this.date = date;
        this.components = components;
        this.count = count;
        this.price = price;
        this.total = total;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Components getComponents() {
        return components;
    }

    public void setComponents(Components components) {
        this.components = components;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
}
