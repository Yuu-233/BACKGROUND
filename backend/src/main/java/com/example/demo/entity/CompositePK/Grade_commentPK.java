package com.example.demo.entity.CompositePK;
import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Data
@Embeddable
public class Grade_commentPK implements Serializable{
    private  int App_ID;
    private int Commenter_User_ID;

}
