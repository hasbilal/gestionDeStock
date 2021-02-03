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
@Table(name = "commandeFournisseur")
public class CmdFournisseur  implements Serializable {

    @Id
    @GeneratedValue
    private long idCmdFournisseur;

    @ManyToOne
    @JoinColumn(name = "idFournisseur")
    private Fournisseur fournisseur;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCmdFournisseur;


    @OneToMany(mappedBy = "cmdFournisseur")
    private List<LigneCmdFournisseur>ligneCmdFournisseurs;
}
