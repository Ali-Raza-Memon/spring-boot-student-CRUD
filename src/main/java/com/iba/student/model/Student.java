package com.iba.student.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "Students")

public class Student {

    @Id
    @GeneratedValue
    private int id;
    private String first_name;
    private String last_name;
    private String gender;
    private String CMSId;
    private int Semester;

}
