package com.example.demo.entity;
import com.example.demo.entity.CompositePK.FeaturePK;
import com.example.demo.entity.CompositePK.Rec_appPk;
import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name="rec_app")
public class Rec_app {
    @EmbeddedId
    private Rec_appPk rec_appPk;
}

