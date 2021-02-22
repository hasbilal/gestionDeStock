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
@Table(name = "commandeFournisseur")
public class CmdFournisseur  implements Serializable {

    @Id
    @GeneratedValue
    private long idCmdFournisseur;
    private String codeFournisseur;

    @ManyToOne
    @JoinColumn(name = "idFournisseur")
    private Fournisseur fournisseur;

    //@Temporal(TemporalType.TIMESTAMP)
    private Instant dateCmdFournisseur;


    @OneToMany(mappedBy = "cmdFournisseur")
    private List<LigneCmdFournisseur>ligneCmdFournisseurs;

    @CreatedDate
    @JsonIgnore
    private Instant dateCreation;

    @LastModifiedDate
    @JsonIgnore
    private Instant  dateDernierMiseAJour;
}
