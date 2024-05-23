package entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Set;

@Getter
@Setter
@Entity
@NamedQueries({
        @NamedQuery(name = "Person.getMaintainedPersons",
                query = "SELECT  p FROM Maintenance m JOIN m.person p JOIN m.facility f WHERE f.facilityName = :facilityName AND m.cost > 0"),
})
@Table(name = "people")
public class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "person_id")
    private String id;
    @Column(name = "full_name")
    private String name;
    private String position;
    private String phone;
    private String email;

    @OneToOne(mappedBy = "manager")
    private Department department;

    public Person() {
    }

    public Person(String id, String name, String position, String phone, String email) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.phone = phone;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}