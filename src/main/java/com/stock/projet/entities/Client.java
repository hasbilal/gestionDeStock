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
@Table(name = "client")
public class Client implements Serializable {

    @Id
    @GeneratedValue
    private  long idClient;
    private String nomClient;
    private String prenomClient;
    private String adresseClient;
    private String emailClient;
    private String imageClient;

    @OneToMany(mappedBy = "client")
    private List<CmdClient> cmdClients;

}
