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
@Table(name = "Dravya_Guna")
public class Dravyaguna extends PanacheEntity {


    @OneToOne
    @JoinColumn(name = "dravya_id", referencedColumnName = "id")
    private Dravya dravyaId;

    @Column(name = "dravya_rasa")
    private String dravyaRasa;
    @Column(name = "dravya_guna")
    private String dravyaGuna;
    @Column(name = "dravya_virya")
    private String dravyaVirya;
    @Column(name = "dravya_vipika")
    private String dravyaVipaka;
    @Column(name = "dravya_prabhava")
    private String dravyaPrabhava;

    @OneToOne
    @JoinColumn(name = "reference_id", referencedColumnName = "id")
    private References referenceId;



}
