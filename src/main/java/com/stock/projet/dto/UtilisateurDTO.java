package com.stock.projet.dto;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.stock.projet.entities.Utilisateur;
import lombok.Builder;
import lombok.Data;
import java.time.Instant;
import java.util.List;

@Data
@Builder
public class UtilisateurDTO {

    private long idUtilisateur;
    private String nomUtilisateur;
    private String prenomUtilisateur;
    private String mail;
    private Instant dateDeNaissance;
    private String pwd;

    @JsonIgnore
    private AdresseDTO adresseUtilisateur;

    private String imageUtilisateur;

    @JsonIgnore
    private EntrepriseDTO entreprise;
    @JsonIgnore
    private List<RolesDTO> roles;


    public static UtilisateurDTO fromEntity(Utilisateur utilisateur){
        if(utilisateur==null){
            return null;
        }


        return UtilisateurDTO.builder()
                .idUtilisateur(utilisateur.getIdUtilisateur())
                .nomUtilisateur(utilisateur.getNomUtilisateur())
                .prenomUtilisateur(utilisateur.getPrenomUtilisateur())
                .mail(utilisateur.getMail())
                .dateDeNaissance(utilisateur.getDateDeNaissance())
                .pwd(utilisateur.getPwd())
                .imageUtilisateur(utilisateur.getImageUtilisateur())
                .build();

    }

    public static Utilisateur toEntity(UtilisateurDTO utilisateurDTO){
        if(utilisateurDTO ==null){
            return null;
        }


        return Utilisateur.builder()
                .idUtilisateur(utilisateurDTO.getIdUtilisateur())
                .nomUtilisateur(utilisateurDTO.getNomUtilisateur())
                .prenomUtilisateur(utilisateurDTO.getPrenomUtilisateur())
                .mail(utilisateurDTO.getMail())
                .dateDeNaissance(utilisateurDTO.getDateDeNaissance())
                .pwd(utilisateurDTO.getPwd())
                .imageUtilisateur(utilisateurDTO.getImageUtilisateur())
                .build();

    }


}
