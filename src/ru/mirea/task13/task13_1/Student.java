package ru.mirea.task13.task13_1;

public class Student {
    private String name;
    private String surname;
    private int iDNumber;
    private int study_score;
    public Student(int Id, int Study_score){
        iDNumber=Id;
        study_score=Study_score;
        name="";
        surname="";
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIdNumber(int id) {
        this.iDNumber = id;
    }

    public int getIdNumber() {
        return iDNumber;
    }

    public int getStudy_score() {
        return study_score;
    }

    public void setStudy_score(int study_score) {
        this.study_score = study_score;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
