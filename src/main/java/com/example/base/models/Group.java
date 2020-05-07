package com.example.base.models;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@EqualsAndHashCode(of = {"name"})
@Table(name = "group", schema = "public")
public class Group {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "studentsList")
    private ArrayList<Student> studentsList;
    @Column(name = "faculty")
    private String faculty;
}
