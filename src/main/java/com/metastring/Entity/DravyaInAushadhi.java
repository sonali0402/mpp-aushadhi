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
@Table(name = "dravya_in_aushadhi")
public class DravyaInAushadhi extends PanacheEntity {

    @OneToOne
    @JoinColumn(name = "aushadhi_id", referencedColumnName = "id")
    private Aushadhi aushadhiId;

    @OneToOne
    @JoinColumn(name = "plant_part_id", referencedColumnName = "id")
    private PlantPart plantPartId;


}
