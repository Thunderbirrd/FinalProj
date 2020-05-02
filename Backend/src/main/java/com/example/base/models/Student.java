package com.example.base.models;

import org.json.JSONObject;

public class Student {
    private Integer id;
    private String birthDate;
    private Group group;
    private JSONObject examsMarks = new JSONObject();
    private String name;
    private String surname;
    private String secondName;
}
