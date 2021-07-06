package com.metastring.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "traits")
public class Traits extends PanacheEntity {

    @Column(name = "trait_name")
    private String traitName;
    @Column(name = "trait_properties")
    private String traitProperties;
    @Column(name = "trait_icon")
    private String traitIcon;
}
