package com.br.desafio.itau.service.validacoes;

import com.br.desafio.itau.dto.TransacaoRequest;

public interface Validacao {

    void validar(TransacaoRequest request);

}
