package com.stock.projet.Exception;


import lombok.Getter;

import java.util.List;

public class InvalideEntityException extends RuntimeException {

    @Getter
    private CodeErreur codeErreur;
    @Getter
    private List<String> erreurs;


    public InvalideEntityException(String message){
        super(message);
    }

    public InvalideEntityException(String message, Throwable cause){
        super(message,cause);
    }

    public InvalideEntityException(String message, Throwable cause, CodeErreur codeErreur){
        super(message,cause);
        this.codeErreur=codeErreur;
    }

    public InvalideEntityException(String message, CodeErreur codeErreur){
        super(message);
        this.codeErreur=codeErreur;
    }

    public InvalideEntityException(String message,CodeErreur codeErreur, List<String>erreurs){
        super(message);
        this.codeErreur=codeErreur;
        this.erreurs=erreurs;
    }
}