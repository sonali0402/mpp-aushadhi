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
@Table(name = "synonym_table")
public class Synonym extends PanacheEntity {

    @Column(name = "synonym_name")
    private String synonymName;
    @Column(name = "synonym_type")
    private String synonymType;
    private String language;
    @Column(name = "element_id")
    private Long elementId;
    //private  element_table
    private String description;
    @OneToOne
    @JoinColumn(name = "reference_id", referencedColumnName = "id")
    private References referenceId;


}
