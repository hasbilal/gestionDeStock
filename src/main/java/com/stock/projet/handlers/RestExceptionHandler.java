package com.stock.projet.handlers;

import com.stock.projet.Exception.EntityNotFoundException;
import com.stock.projet.Exception.InvalideEntityException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity<ErreurDTO> handleException(EntityNotFoundException exception, WebRequest webRequest){

        final HttpStatus notFound = HttpStatus.NOT_FOUND;
        final ErreurDTO erreurDTO = ErreurDTO.builder()
                .codeErreur(exception.getCodeErreur())
                .httpCode(notFound.value())
                .message(exception.getMessage())
                .build();

        return new ResponseEntity<>(erreurDTO,notFound);
    }

    @ExceptionHandler(InvalideEntityException.class)
    public ResponseEntity<ErreurDTO> handleException(InvalideEntityException exception, WebRequest webRequest){

        final HttpStatus badRequest = HttpStatus.BAD_REQUEST;
        final ErreurDTO erreurDTO = ErreurDTO.builder()
                .codeErreur(exception.getCodeErreur())
                .httpCode(badRequest.value())
                .message(exception.getMessage())
                .erreurs(exception.getErreurs())
                .build();

        return new ResponseEntity<>(erreurDTO,badRequest);

    }
}
