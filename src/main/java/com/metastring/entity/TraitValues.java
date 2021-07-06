package com.metastring.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Table(name = "trait_values")
public class TraitValues extends PanacheEntity {
    @OneToOne
    @JoinColumn(name = "trait_id", referencedColumnName = "id")
    private Traits traitId;

    @Column(name = "trait_value")
    private String value;
}
