package com.example.demo.entity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name="app_info")
@JsonIgnoreProperties(value = {"handler","hibernateLazyInitializer","fieldHandler"})
public class AppInfo {
    @Id
    @Column(name="App_ID")
    private int App_ID;
    public int getApp_ID(){return  App_ID;}
    public void setApp_ID(int app_ID){this.App_ID = app_ID;}

    private int  App_Salary;
    private String App_Location;
    private String App_TimeSchedule;
    private String App_Job;
    private String App_State;

    @Basic
    @Column(name="App_Salary")
    public int getApp_Salary(){return App_Salary;}
    public void setApp_Salary(int app_Salary){this.App_Salary=app_Salary;}

    @Basic
    @Column(name="App_Location")
    public String getApp_Location(){return App_Location;}
    public void setApp_Location(String location){this.App_Location=location;}

    @Basic
    @Column(name="App_TimeSchedule")
    public String getApp_TimeSchedule(){return App_TimeSchedule;}
    public void setApp_TimeSchedule(String timeSchedule){this.App_TimeSchedule=timeSchedule;}

    @Basic
    @Column(name="App_Job")
    public String getJob(){return App_Job;}
    public void setApp_Job(String job){this.App_Job = job;}

    @Basic
    @Column(name="State")
    public String getApp_State(){return App_State;}
    public void setApp_State(String state){this.App_State = state;}


}
