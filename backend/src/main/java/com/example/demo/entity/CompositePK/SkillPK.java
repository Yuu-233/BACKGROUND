package com.example.demo.entity.CompositePK;
import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Data
@Embeddable
public class SkillPK implements Serializable{
    private int Skill_ID;
    private String Certificate;
}

