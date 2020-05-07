package com.example.base.models;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity // аннотация говорит, что это таблица в БД
@Table(name = "students", schema = "public")
public class Student {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "birthDate")
    private String birthDate;
    /*
    @Column(name = "group")
    private Group group;
    @Column(name = "examsMarks")
    private JSONObject examsMarks = new JSONObject();
    */
    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;
    @Column(name = "secondName")
    private String secondName;
}
