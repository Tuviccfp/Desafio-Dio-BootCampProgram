package org.example.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
public class Curso extends Conteudo {

    private int workload;

    @Override
    public double calcularXp() {
        return XP_VALUE * workload;
    }

    public Curso() {
    }

    @Override
    public String toString() {
        return "Curso { " +
                "titulo=" + getTittle() + '\'' +
                ", descrição=" + getDescription() + '\'' +
                ", carga horária=" + getWorkload() + " } ";

    }
}
