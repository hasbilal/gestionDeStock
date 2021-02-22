package com.stock.projet.dto;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.stock.projet.entities.CmdFournisseur;
import lombok.Builder;
import lombok.Data;
import java.time.Instant;
import java.util.List;

@Data
@Builder
public class CmdFournisseurDTO {


    private long idCmdFournisseur;
    private String codeFournisseur;
    @JsonIgnore
    private FournisseurDTO fournisseur;
    private Instant dateCmdFournisseur;
    @JsonIgnore
    private List<LigneCmdFournisseurDTO> ligneCmdFournisseurs;


    public static CmdFournisseurDTO fromEntity(CmdFournisseur cmdFournisseur){
        if(cmdFournisseur==null){
            return null;
        }

        return CmdFournisseurDTO.builder()
                .idCmdFournisseur(cmdFournisseur.getIdCmdFournisseur())
                .codeFournisseur(cmdFournisseur.getCodeFournisseur())
                .dateCmdFournisseur(cmdFournisseur.getDateCmdFournisseur())
                .build();
    }

    public static CmdFournisseur toEntity(CmdFournisseurDTO cmdFournisseurDTO){
        if(cmdFournisseurDTO==null){
            return null;
        }

        return CmdFournisseur.builder()
                .idCmdFournisseur(cmdFournisseurDTO.getIdCmdFournisseur())
                .codeFournisseur(cmdFournisseurDTO.getCodeFournisseur())
                .dateCmdFournisseur(cmdFournisseurDTO.getDateCmdFournisseur())
                .build();
    }
}
