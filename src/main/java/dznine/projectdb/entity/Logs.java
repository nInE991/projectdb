package dznine.projectdb.entity;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "tbl_logs")
public class Logs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private Date date;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.DETACH)
    @JoinColumn(name = "actions_id",nullable = false)
    private LogsActions actions;
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name="components_id",nullable = false)
    private Components components;
    @Column(nullable = false)
    private Float count;
    @Column
    private String note;

    public Logs() {
    }

    public Logs(Date date, LogsActions actions, Components components, Float count, String note) {
        this.date = date;
        this.actions = actions;
        this.components = components;
        this.count = count;
        this.note = note;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public LogsActions getActions() {
        return actions;
    }

    public void setActions(LogsActions actions) {
        this.actions = actions;
    }

    public Components getComponents() {
        return components;
    }

    public void setComponents(Components components) {
        this.components = components;
    }

    public Float getCount() {
        return count;
    }

    public void setCount(Float count) {
        this.count = count;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
