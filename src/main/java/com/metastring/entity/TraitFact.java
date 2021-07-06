package com.metastring.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "trait_fact")
public class TraitFact extends PanacheEntity {

    @Column(name = "table_name")
    private String tableName;

    @OneToOne
    @JoinColumn(name = "trait_id", referencedColumnName = "id")
    private Traits traitId;

    @OneToOne
    @JoinColumn(name = "trait_value_id", referencedColumnName = "id")
    private TraitValues traitValueId;

}
