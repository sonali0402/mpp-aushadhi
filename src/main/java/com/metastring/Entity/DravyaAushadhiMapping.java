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
@Table(name = "Dravya_aushadhi_mapping")
public class DravyaAushadhiMapping extends PanacheEntity {

    @OneToOne
    @JoinColumn(name = "dravya_id", referencedColumnName = "id")
    private Dravya dravyaId;

    @Column(name = "dravyaName")
    private String dravyaName;


}
