package com.stock.projet.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;
import java.util.Date;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Entity
@Table(name = "vente")
public class Vente  implements Serializable {

    @Id
    @GeneratedValue
    private long idVente;
    private String codeVente;



    //  @Temporal(TemporalType.TIMESTAMP)
    private Instant dateVente;
    private String commentaire;

    @OneToMany(mappedBy = "vente")
    private List<LigneVente>ligneVentes;

    @CreatedDate
    @JsonIgnore
    private Instant dateCreation;

    @LastModifiedDate
    @JsonIgnore
    private Instant  dateDernierMiseAJour;
}
