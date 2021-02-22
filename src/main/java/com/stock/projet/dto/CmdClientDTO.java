package com.stock.projet.dto;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.stock.projet.entities.CmdClient;
import lombok.Builder;
import lombok.Data;
import java.time.Instant;
import java.util.List;

@Data
@Builder
public class CmdClientDTO {

    private long idCmdClient;
    private String codeClient;


    private Instant dateCmdClient;

    @JsonIgnore
    private ClientDTO client;

    @JsonIgnore
    private List<LigneCmdClientDTO>CmdClientList;

    public static CmdClientDTO fromEntity(CmdClient cmdClient){
        if(cmdClient == null){
            return null;

        }

        return CmdClientDTO.builder()
                .idCmdClient(cmdClient.getIdCmdClient())
                .codeClient(cmdClient.getCodeClient())
                .dateCmdClient(cmdClient.getDateCmdClient())
                .build();
    }

    public static CmdClient toEntity(CmdClientDTO cmdClientDTO){
        if(cmdClientDTO==null){
            return null;
        }

        return CmdClient.builder()
                .idCmdClient(cmdClientDTO.idCmdClient)
                .codeClient(cmdClientDTO.codeClient)
                .dateCmdClient(cmdClientDTO.dateCmdClient)
                .build();
    }
}
