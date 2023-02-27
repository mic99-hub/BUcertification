package com.example.progettotesi.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "first_name",nullable = false)
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "company_level")
    private String companyLevel;

    @Column(name = "company_residence")
    private String companyResidence;

    //@Column( name = "assumption_date")
    //@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = DateFormatPDSUtility.DATE_CONSTANT_CS)
    //private Date asssumptionDate;










}
