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
@Table(name = "client")
public class Client implements Serializable {

    @Id
    @GeneratedValue
    private  long idClient;
    private String nomClient;
    private String prenomClient;

    @Embedded
    private Adresse adresseClient;

    private String emailClient;
    private String imageClient;
    private String numTelephone;

    @OneToMany(mappedBy = "client")
    private List<CmdClient> cmdClients;

    @CreatedDate
    @JsonIgnore
    private Instant dateCreation;

    @LastModifiedDate
    @JsonIgnore
    private Instant  dateDernierMiseAJour;
}

