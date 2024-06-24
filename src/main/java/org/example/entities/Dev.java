package org.example.entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

@Getter
@Setter
@EqualsAndHashCode
public class Dev {
    private String nameDev;
    private Set<Conteudo> contentSubscribe = new LinkedHashSet<>();
    private Set<Conteudo> contentConcluded = new LinkedHashSet<>();

    public void subscribeBootcamp(Bootcamp bootcamp) {
        this.contentSubscribe.addAll(bootcamp.getContent());
        bootcamp.getDevsSubscribe().add(this);
    }

    public void toProgress() {
        Optional<Conteudo> contentOptional = this.contentSubscribe.stream().findFirst();
        contentOptional.ifPresent(conteudo -> {
            this.contentConcluded.add(conteudo);
            this.contentSubscribe.remove(conteudo);
        });
    }

    public double calculateXpTotal() {
        Iterator<Conteudo> iterator = this.contentConcluded.iterator();
        double sum = 0;
        while (iterator.hasNext()) {
            double next = iterator.next().calcularXp();
            sum += next;
        }
        return sum;
    }
}
