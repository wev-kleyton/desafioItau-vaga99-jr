package com.br.desafio.itau.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.annotation.processing.Generated;
import java.time.OffsetDateTime;

@Getter
@Setter
@AllArgsConstructor
public class Transacao {

    private Double valor;

    private OffsetDateTime dataHora;
}
