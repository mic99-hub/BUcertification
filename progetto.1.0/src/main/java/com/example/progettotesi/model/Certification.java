package com.example.progettotesi.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table
public class Certification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long certificationId;

    @Column(name ="certification_name" , nullable = false )
    private String certificationName;

    @Column(name = "type")
    private String type;

    @Column(name = "scope")
    private String scope;

    @Column(name = "duration")
    private String duration;

}
