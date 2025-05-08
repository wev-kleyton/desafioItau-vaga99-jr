package com.br.desafio.itau.service;

import com.br.desafio.itau.domain.Transacao;
import com.br.desafio.itau.dto.TransacaoRequest;
import com.br.desafio.itau.service.validacoes.Validacao;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TransacaoService {

    private final List<Transacao> transacaos = new ArrayList<>();
    private final List<Validacao> validacoes ;

    public TransacaoService(List<Validacao> validacoes){
        this.validacoes = validacoes;
    }

    public  void salvar(TransacaoRequest request){
        validacoes.forEach( v -> v.validar(request));
        transacaos.add(new Transacao(request.valor(), request.dataHora()));
    }
}
