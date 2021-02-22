package com.stock.projet.dto;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.stock.projet.entities.Roles;
import lombok.Builder;
import lombok.Data;
@Data
@Builder
public class RolesDTO {

    private long idRoles;
    private String nomRole;

    @JsonIgnore
    private UtilisateurDTO utilisateur;


    public static RolesDTO fromEntity(Roles roles){
        if(roles==null){
            return null;
        }

        return RolesDTO.builder()
                .idRoles(roles.getIdRoles())
                .nomRole(roles.getNomRole())
                .build();
    }


    public static Roles toEntity(RolesDTO rolesDTO){
        if(rolesDTO==null){
            return null;
        }

        return Roles.builder()
                .idRoles(rolesDTO.getIdRoles())
                .nomRole(rolesDTO.getNomRole())
                .build();
    }
}
