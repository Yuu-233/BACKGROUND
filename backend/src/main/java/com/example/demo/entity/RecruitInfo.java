package com.example.demo.entity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name="recruitinfo")
@JsonIgnoreProperties(value = {"handler","hibernateLazyInitializer","fieldHandler"})
public class RecruitInfo {
    @Id
    @Column(name="Rec_ID")
    private int Rec_ID;
    public int getRec_ID(){return Rec_ID;}
    public void setRec_ID(int rec_ID){this.Rec_ID = rec_ID;}

    private int User_ID;
    private int Rec_Salary;
    private String Rec_Location;
    private String Rec_TimeSchedule;
    private String Rec_Job;
    private int Rec_Enrolled;
    private int Rec_Quota;

    @Basic
    @Column(name="User_ID")
    public int getUser_ID(){return User_ID;}


    @Basic
    @Column(name="Rec_Salary")
    public int getRec_Salary(){return Rec_Salary;}
    public void setRec_Salary(int rec_salary){this.Rec_Salary=rec_salary;}

    @Basic
    @Column(name="Rec_Location")
    public String getRec_Location(){return Rec_Location;}
    public void setRec_Locaiton(String locaiton){this.Rec_Location=locaiton;}

    @Basic
    @Column(name="Rec_TimeSchedule")
    public String getRec_TimeSchedule(){return Rec_TimeSchedule;}
    public void setRec_TimeSchedule(String timeSchedule){this.Rec_TimeSchedule=timeSchedule;}

    @Basic
    @Column(name="Rec_Job")
    public String getRec_Job(){return Rec_Job;}
    public void setRec_Job(String job){this.Rec_Job=job;}

    @Basic
    @Column(name="Rec_Enrolled")
    public int getRec_Enrolled(){return Rec_Enrolled;}
    public void setRec_Enrolled(int enrolled){this.Rec_Enrolled=enrolled;}

    @Basic
    @Column(name="Rec_Quota")
    public int getRec_Quota(){return Rec_Quota;}
    public void setRec_Quota(int quota){this.Rec_Quota=quota;}

}
