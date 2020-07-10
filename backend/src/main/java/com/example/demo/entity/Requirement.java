package com.example.demo.entity;
import com.example.demo.entity.CompositePK.FeaturePK;
import com.example.demo.entity.CompositePK.RequirementPK;
import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name="feature")
public class Requirement {
    @EmbeddedId
    private RequirementPK requirementPK;
}
