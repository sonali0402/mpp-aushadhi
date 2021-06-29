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
@Table(name = "Dravya")
public class Dravya extends PanacheEntity {

    @Column(name = "species_id")
    private Long speciesId;
    @Column(name = "botmast_id")
    private Long botmastId;
    @Column(name = "species_name")
    private String speciesName;

    @OneToOne
    @JoinColumn(name = "part_id", referencedColumnName = "id")
    private PlantPart partId;

    @Column(name = "dravya_name")
    private String dravyaName;

    @Column(name = "source_reference_id")
    private Long sourceReferenceId;

    @OneToOne
    @JoinColumn(name = "reference_id", referencedColumnName = "id")
    private References referenceId;

}
