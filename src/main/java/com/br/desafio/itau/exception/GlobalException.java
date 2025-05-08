package com.br.desafio.itau.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {

    @ExceptionHandler(FormularioInvalidoException.class)
    @ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
    public void formularioInvalidoException(FormularioInvalidoException ex){
        System.out.println(ex);
    }

    @ExceptionHandler(ValorNegativoException.class)
    @ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
    public String valorNegativoException(ValorNegativoException ex){
        return  ex.getMessage();
    }

}
