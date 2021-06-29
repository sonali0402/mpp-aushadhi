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
@Table(name = "karma")
public class Karma extends PanacheEntity {


    @OneToOne
    @JoinColumn(name = "aushadhi_id", referencedColumnName = "id")
    private Aushadhi aushadhiId;

    @Column(name = "dhatu_karma")
    private String dhatuKarma;
    @Column(name = "dosh_karma")
    private String doshKarma;
    @OneToOne
    @JoinColumn(name = "reference_id", referencedColumnName = "id")
    private References referenceId;


}
