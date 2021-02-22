package com.stock.projet.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Entity
@Table(name = "categorie")
public class Categorie  implements Serializable {

    @Id
    @GeneratedValue
    private long idCategorie;
    private  String codeCategorie;
    private String designation;


    @OneToMany(mappedBy = "categorie")
    private List<Article> articles;

    @CreatedDate
    @JsonIgnore
    private Instant dateCreation;

    @LastModifiedDate
    @JsonIgnore
    private Instant  dateDernierMiseAJour;

}
