package com.br.desafio.itau.controller;

import com.br.desafio.itau.dto.TransacaoRequest;
import com.br.desafio.itau.service.TransacaoService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/transacao")
@RestController
public class TransacaoController {

    private final TransacaoService service;

    public TransacaoController (TransacaoService service){
        this.service = service;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void salvar(@RequestBody TransacaoRequest request){
        service.salvar(request);
    }
}
