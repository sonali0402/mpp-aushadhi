package com.metastring.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "chemical_constitutions")
public class ModernPharmacology extends PanacheEntity {

    @OneToOne
    @JoinColumn(name = "ingredient_id", referencedColumnName = "id")
    private Ingredient ingredientId;

    @OneToMany
    private List<Constituents> constituents;
    @Column(name = "biological_actions")
    private String biologicalActions;
    @Column(name = "clinical_report")
    private String clinicalReport;
    @Column(name = "remarks")
    private String remarks;
    @OneToOne
    @JoinColumn(name = "reference_id", referencedColumnName = "id")
    private References referenceId;


}
