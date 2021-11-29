package pe.edu.upc.userservice.entity;

import lombok.Data;
import javax.persistence.*;
@Entity
@Data
@Table(name = "patients")
public class Patient  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "breed")
    private String breed;

    @Column(name = "age")
    private String age;
}