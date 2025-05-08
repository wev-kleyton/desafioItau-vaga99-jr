package com.br.desafio.itau.service.validacoes.impl;

import com.br.desafio.itau.dto.TransacaoRequest;
import com.br.desafio.itau.exception.ValorNegativoException;
import com.br.desafio.itau.service.validacoes.Validacao;
import org.springframework.stereotype.Component;

@Component
public class ValidaValorNegativoImpl implements Validacao {


    @Override
    public void validar(TransacaoRequest request) {
        boolean ehNumeroNegativo = request.valor() < 0 ;

        if (ehNumeroNegativo){
           throw  new ValorNegativoException("Nao e permitido valor negativo!");
        }
    }
}
