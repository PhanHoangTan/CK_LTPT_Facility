package entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "maintenances")
public class Maintenance implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "start_date")
    private LocalDate startDate;
    @Column(name = "end_date")
    private LocalDate endDate;
    private String description;
    private double cost;

    @Id
    @ManyToOne
    @JoinColumn(name = "facility_id")
    private Facility facility;

    @Id
    @ManyToOne
    @JoinColumn(name = "person_id")
    private Person person;

    public Maintenance() {
    }

    public Maintenance(LocalDate startDate, LocalDate endDate, String description, double cost) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.description = description;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Maintenance{" +
                "startDate=" + startDate +
                ", endDate=" + endDate +
                ", description='" + description + '\'' +
                ", cost=" + cost +
                '}';
    }
}