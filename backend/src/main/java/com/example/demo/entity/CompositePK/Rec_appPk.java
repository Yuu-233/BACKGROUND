package com.example.demo.entity.CompositePK;
import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Data
@Embeddable
public class Rec_appPk implements  Serializable{
    private int Rec_ID;
    private int App_ID;
}
