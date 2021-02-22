package com.stock.projet.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.stock.projet.entities.Client;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class ClientDTO {


    private  long idClient;
    private String nomClient;
    private String prenomClient;


    @JsonIgnore
    private AdresseDTO adresseClient;

    private String emailClient;
    private String imageClient;
    private String numTelephone;


    @JsonIgnore
    private List<CmdClientDTO> cmdClients;

    public static ClientDTO fromEntity(Client client){
        if(client == null){
            return null;
        }
        return ClientDTO.builder()
                .idClient(client.getIdClient())
                .nomClient(client.getNomClient())
                .prenomClient(client.getPrenomClient())
                .emailClient(client.getEmailClient())
                .numTelephone(client.getNumTelephone())
                .imageClient(client.getImageClient())
                .build();
    }

    public static Client toEntity(ClientDTO clientDTO){
        if(clientDTO == null){
            return null;
        }
        return Client.builder()
                .idClient(clientDTO.getIdClient())
                .prenomClient(clientDTO.getPrenomClient())
                .nomClient(clientDTO.getNomClient())
                .emailClient(clientDTO.getEmailClient())
                .numTelephone(clientDTO.getNumTelephone())
                .imageClient(clientDTO.getImageClient())
                .build();

    }
}
