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
@Table(name = "ingredient")
public class Ingredient extends PanacheEntity {

    @Column(name = "ingredient_type")
    private String ingredientType; //animal or Mineral or Other

    private String description;

    @ManyToOne
    @JoinColumn(name = "aushadhi_id", referencedColumnName = "id")
    private Aushadhi aushadhiId;


}
