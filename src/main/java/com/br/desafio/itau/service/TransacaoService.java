package com.br.desafio.itau.service;

import com.br.desafio.itau.domain.Transacao;
import com.br.desafio.itau.dto.TransacaoRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TransacaoService {

    private final List<Transacao> transacaos = new ArrayList<>();

    public  void salvar(TransacaoRequest request){
        transacaos.add(new Transacao(request.valor(), request.dataHora()));
    }
}
