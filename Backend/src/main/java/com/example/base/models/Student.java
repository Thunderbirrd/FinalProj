package com.example.base.models;

import org.json.JSONObject;

public class Student extends Person{
    private String birthDate;
    private Group group;
    private JSONObject examsMarks = new JSONObject();
}
