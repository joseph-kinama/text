package com.UniversitySystem.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private int rolNo;
    @Column(name = "student_name")
private String name;
    @Column(name = "student_percentage")
private float percentage;
    @Column(name = "student_branch")
private String branch;

    public Student(){

    }

    public Student(String name, float percentage, String branch) {
        this.name = name;
        this.percentage = percentage;
        this.branch = branch;
    }

    public int getRolNo() {
        return rolNo;
    }

    public void setRolNo(int rolNo) {
        this.rolNo = rolNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPercentage() {
        return percentage;
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
    @Override
    public String toString(){
        return "Student [rolNo=" + rolNo +",name="+name+ ",percentage="+
        percentage+",branch="+branch;
    }
}
