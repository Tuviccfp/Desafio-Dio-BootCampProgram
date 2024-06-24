package org.example.entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@EqualsAndHashCode
public class Bootcamp {
    private String name;
    private String description;
    private final LocalDate localDate = LocalDate.now();
    private final LocalDate finalDate = localDate.plusDays(45);
    private Set<Dev> devsSubscribe = new HashSet<>();
    private Set<Conteudo> content =  new HashSet<>();
}
