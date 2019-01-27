package dznine.projectdb.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tbl_orders")
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private Date date;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.DETACH)
    @JoinColumn(name="ordersActions_id",nullable = false)
    private OrdersActions ordersActions;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.DETACH)
    @JoinColumn(name="counterpoints_id",nullable = false)
    private Counterparties counterparties;
    @Column(nullable = false)
    private Float total;

    @Column
    private String note;

    public Orders() {

    }

    public Orders(Integer id, Date date, Float total, String note, OrdersActions ordersActions, Counterparties counterparties) {
        this.id = id;
        this.date = date;
        this.ordersActions = ordersActions;
        this.counterparties = counterparties;
        this.total = total;
        this.note = note;
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    public Integer getId() {

        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String toString() {
        return date.toString();
    }

}
