package com.example.demo.entity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.org.apache.xpath.internal.operations.Bool;
import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name="app_gr")
public class App_gr {
    @Id
    @Column(name="User_ID")
    private int User_ID;
    public int getUser_ID(){return User_ID;}
    public void setUser_ID(int id){this.User_ID=id;}

    private float App_Avg_Grade;
    public float getApp_Avg_Grade(){return App_Avg_Grade;}
    public void setApp_Avg_Grade(float app_Avg_Grade){this.App_Avg_Grade=app_Avg_Grade;}


}
