package dznine.projectdb.entity;

import javax.persistence.*;

@Entity
@Table(name = "tbl_compbalance")
public class ComponentBalance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private Double balance;

    public ComponentBalance() {
    }

    public ComponentBalance(Integer id, Double balance) {
        this.id = id;
        this.balance = balance;
    }

    public ComponentBalance(Double balance) {
        this.balance = balance;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}
