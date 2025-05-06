package com.br.desafio.itau.controller;

import com.br.desafio.itau.dto.TransacaoRequest;
import com.br.desafio.itau.service.TransacaoService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/transacao")
@RestController
public class TransacaoController {

    private final TransacaoService service;

    public TransacaoController (TransacaoService service){
        this.service = service;
    }

    @PostMapping
    public void salvar(@RequestBody TransacaoRequest request){
        service.salvar(request);
    }
}
