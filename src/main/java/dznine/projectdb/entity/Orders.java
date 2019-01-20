package dznine.projectdb.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tbl_orders")
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private Date data;
    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name="ordersActions_id",nullable = false)
    private OrdersActions ordersActions;
    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name="counterpoints_id",nullable = false)
    private Counterparties counterparties;
    @Column
    private String note;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public OrdersActions getOrdersActions() {
        return ordersActions;
    }

    public void setOrdersActions(OrdersActions ordersActions) {
        this.ordersActions = ordersActions;
    }

    public Counterparties getCounterparties() {
        return counterparties;
    }

    public void setCounterparties(Counterparties counterparties) {
        this.counterparties = counterparties;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
