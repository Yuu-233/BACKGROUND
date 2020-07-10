package com.example.demo.entity;
import com.example.demo.entity.CompositePK.FeaturePK;
import com.example.demo.entity.CompositePK.Grade_commentPK;
import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name="grade_comment")
public class Grade_comment {
    @EmbeddedId
    private Grade_commentPK grade_commentPK;
    private int App_Grade;
    private String App_Comment;
}
