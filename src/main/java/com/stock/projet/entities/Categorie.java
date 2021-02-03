package com.stock.projet.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "categorie")
public class Categorie  implements Serializable {

    @Id
    @GeneratedValue
    private long idcategorie;
    private  String codeCategorie;
    private String designation;
    @OneToMany(mappedBy = "categorie")
    private List<Article> articles;



}
