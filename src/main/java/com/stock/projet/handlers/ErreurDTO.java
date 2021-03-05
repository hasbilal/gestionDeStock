package com.stock.projet.handlers;

import com.stock.projet.Exception.CodeErreur;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class ErreurDTO {

    private Integer httpCode;
    private CodeErreur codeErreur;
    private String message;
    private List<String> erreurs =new ArrayList<>();

}
