package com.example.demo.entity;
import com.example.demo.entity.CompositePK.Grade_commentPK;
import com.example.demo.entity.CompositePK.Rec_appPk;
import com.example.demo.entity.CompositePK.Rec_commentPK;
import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name="rec_comment")
public class Rec_comment {
    @EmbeddedId
    private Rec_commentPK rec_commentPK;

    private int Rec_Grade;
    private String Comment;
}
