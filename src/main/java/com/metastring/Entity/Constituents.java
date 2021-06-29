package com.metastring.Entity;

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
@Table(name = "constituents")
public class Constituents extends PanacheEntity {

    @Column(name = "constituents_type")
    private String constituentsType; // active or chemical
    @Column(name = "constituents_details")
    private String constituentsDetails;

    @ManyToOne
    private ModernPharmacology modernPharmacology;




}
