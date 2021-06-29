package com.metastring.Entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "aushadhi")
public class Aushadhi extends PanacheEntity {

    @Column(unique = true, name = "aushadhi_name")
    private String aushadhiName;

    @OneToMany
    private List<Ingredient> ingredients;

    @Column(name = "peocess_id")
    private Long processId;
    @Column(name = "process_description")
    private String processDescription;

    @Column(name = "medicine_form")
    private String medicineForm;
    @Column(name ="remarks")
    private String remarks;

    @OneToOne
    @JoinColumn(name = "reference_id", referencedColumnName = "id")
    private References referenceId;

}
