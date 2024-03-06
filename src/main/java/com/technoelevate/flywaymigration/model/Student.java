package com.technoelevate.flywaymigration.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "student")
public class Student {

    @Id
    private int id;
    private String name;
    private String emailId;
    private double age;
    private int mobileNumber;
}
