package com.example.demo.entity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.org.apache.xpath.internal.operations.Bool;
import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name="rec_gr")
public class rec_gr {
    @Id
    @Column(name="User_ID")
    private int User_ID;
    public int getUser_ID(){return User_ID;}
    public void setUser_ID(int id){this.User_ID=id;}

    private float Rec_Avg_Grade;
    public float getApp_Avg_Grade(){return Rec_Avg_Grade;}
    public void setApp_Avg_Grade(float rec_Avg_Grade){this.Rec_Avg_Grade=rec_Avg_Grade;}
}
