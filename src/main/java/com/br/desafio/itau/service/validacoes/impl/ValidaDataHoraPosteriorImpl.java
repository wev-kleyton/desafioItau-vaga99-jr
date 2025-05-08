package com.br.desafio.itau.service.validacoes.impl;

import com.br.desafio.itau.dto.TransacaoRequest;
import com.br.desafio.itau.exception.DataHoraFuturoException;
import com.br.desafio.itau.service.validacoes.Validacao;
import org.springframework.stereotype.Component;

import java.time.OffsetDateTime;

@Component
public class ValidaDataHoraPosteriorImpl implements Validacao {

    @Override
    public void validar(TransacaoRequest request) {
        boolean ehDepois =  request.dataHora().isAfter(OffsetDateTime.now());
        if (ehDepois){
            throw new DataHoraFuturoException("Valor do campo Data Hora informado esta no futuro!");
        }
    }
}
