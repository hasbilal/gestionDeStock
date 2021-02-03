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
@Table(name = "commandeClient")
public class CmdClient implements Serializable {

    @Id
    @GeneratedValue
    private long idCmdClient;
    private String codeClient;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCmdClient;

    @ManyToOne
    @JoinColumn(name = "idClient")
    private Client client;

    @OneToMany(mappedBy ="cmdClient" )
    private List<LigneCmdClient>CmdClientList;
}
