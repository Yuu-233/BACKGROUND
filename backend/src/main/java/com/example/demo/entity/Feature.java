package com.example.demo.entity;
import com.example.demo.entity.CompositePK.FeaturePK;
import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name="feature")
public class Feature {
    @EmbeddedId
    private FeaturePK featurePK;
}
