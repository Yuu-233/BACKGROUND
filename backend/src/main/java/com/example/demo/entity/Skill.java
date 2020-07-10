package com.example.demo.entity;
import com.example.demo.entity.CompositePK.FeaturePK;
import com.example.demo.entity.CompositePK.RequirementPK;
import com.example.demo.entity.CompositePK.SkillPK;
import lombok.Data;
import javax.persistence.*;

@Data
@Entity
public class Skill {
    @EmbeddedId
    private SkillPK skillPK;
}
