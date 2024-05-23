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

@Table(name = "facilities")
public class Facility implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "facility_id")
    private String id;
    private String description;
    private String location;
    @Column(name = "facility_name")
    private String facilityName;
    private double price;
    @Column(name = "purchase_date")
    private LocalDate purchaseDate;
    @Enumerated(EnumType.STRING)
    private Status status;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;





    public Facility() {
    }

    public Facility(String id, String description, String location, String facilityName, double price, LocalDate purchaseDate, Status status) {
        this.id = id;
        this.description = description;
        this.location = location;
        this.facilityName = facilityName;
        this.price = price;
        this.purchaseDate = purchaseDate;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "id='" + id + '\'' +
                ", description='" + description + '\'' +
                ", location='" + location + '\'' +
                ", facilityName='" + facilityName + '\'' +
                ", price=" + price +
                ", purchaseDate=" + purchaseDate +
                ", status=" + status +
                '}';
    }
}