package com.br.desafio.itau.service.validacoes.impl;

import com.br.desafio.itau.dto.TransacaoRequest;
import com.br.desafio.itau.exception.FormularioInvalidoException;
import com.br.desafio.itau.service.validacoes.Validacao;
import org.springframework.stereotype.Component;

@Component
public class ValidaCamposPreenchidosImpl  implements Validacao {

    @Override
    public void validar(TransacaoRequest request) {
        if (request.valor() == null || request.dataHora() == null){
            throw  new FormularioInvalidoException("Campo varlo ou Data Hora nao foram ");
        }
    }
}
