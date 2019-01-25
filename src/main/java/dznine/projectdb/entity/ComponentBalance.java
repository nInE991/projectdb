package dznine.projectdb.entity;

import javax.persistence.*;

@Entity
@Table(name = "tbl_componetsbalance")
public class ComponentBalance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private Float balance;

    public ComponentBalance() {
    }

    public ComponentBalance(Float balance) {
        this.balance = balance;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getBalance() {
        return balance;
    }

    public void setBalance(Float balance) {
        this.balance = balance;
    }
}
