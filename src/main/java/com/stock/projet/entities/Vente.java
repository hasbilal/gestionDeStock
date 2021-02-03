package com.stock.projet.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "vente")
public class Vente  implements Serializable {

    @Id
    @GeneratedValue
    private long idVente;
    private String codeVente;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dateVente;


    @OneToMany(mappedBy = "vente")
    private List<LigneVente>ligneVentes;
}
