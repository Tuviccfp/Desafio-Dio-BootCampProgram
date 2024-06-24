package org.example.entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Mentoria extends Conteudo {

    private LocalDate date;

    @Override
    public double calcularXp() {
        return XP_VALUE + 20d;
    }

    public Mentoria() {;
    }

    @Override
    public String toString() {
        return "Mentoria {" +
                "titulo=" + getTittle() + '\'' +
                ", descrição=" + getDescription() + '\'' +
                ", data=" + getDate() + " } ";
    }
}
