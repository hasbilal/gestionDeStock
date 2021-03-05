package com.stock.projet.Exception;

import lombok.Getter;

public class EntityNotFoundException extends RuntimeException {

    @Getter
    private CodeErreur codeErreur;

    public EntityNotFoundException(String message){
        super(message);
    }

    public EntityNotFoundException(String message, Throwable cause){
        super(message,cause);
    }

    public EntityNotFoundException(String message, Throwable cause,CodeErreur codeErreur){
        super(message,cause);
        this.codeErreur=codeErreur;
    }

    public EntityNotFoundException(CodeErreur codeErreur){
        this.codeErreur=codeErreur;
    }


}
