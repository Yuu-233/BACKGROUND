package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="resume")
public class Resume {
    @Id
    @Column(name="User_ID")
    private int User_ID;
    public int getUser_ID(){return User_ID;}
    public void setUser_ID(int user_id){this.User_ID=user_id;}

    private String Name;
    private Boolean Gender;
    private String Birth;
    private String Experience;
    private String Education;

    @Basic
    @Column(name="Name")
    public String getName(){return Name;}
    public void setName(String name){this.Name=name;}

    @Basic
    @Column(name="Gender")
    public Boolean getGender(){return Gender;}
    public void setGender(Boolean gender){this.Gender=gender;}

    @Basic
    @Column(name="Birth")
    public String getBirth(){return Birth;}
    public void setBirth(String birth){this.Birth=birth;}

    @Basic
    @Column(name="Experience")
    public String getExperience(){return Experience;}
    public void   setExperience(String experience){this.Experience=experience;}



}
