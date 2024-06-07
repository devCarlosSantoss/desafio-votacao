package com.devcarlossantos.coopvote.models.enums;

import lombok.Getter;

@Getter
public enum VoteType {
    YES("Sim"),
    NO("Não");

    // Método getter para obter o valor do name
    private final String name;

    // Construtor para o enum
    VoteType(String name) {
        this.name = name;
    }

}
