package dznine.projectdb.entity;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "tbl_logs")
public class Logs {
    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false)
    private Date date;
    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "actions_id",nullable = false)
    private LogsActions actions;
    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name="components_id",nullable = false)
    private Components components;
    @Column(nullable = false)
    private Float count;
    @Column(nullable = false)
    private String note;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
}
