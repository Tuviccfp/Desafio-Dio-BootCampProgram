package org.example.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Conteudo {

    protected static final double XP_VALUE = 10d;

    private String tittle;
    private String description;

    public abstract double calcularXp();


}
