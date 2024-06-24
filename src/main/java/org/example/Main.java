package org.example;

import org.example.entities.Bootcamp;
import org.example.entities.Curso;
import org.example.entities.Dev;
import org.example.entities.Mentoria;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTittle("Curso ruby on rails");
        curso1.setDescription("Descrição do curso de ruby on rails");
        curso1.setWorkload(10);

        Curso curso2 = new Curso();
        curso2.setTittle("Curso python");
        curso2.setDescription("Descrição do curso de python");
        curso2.setWorkload(6);

        Mentoria mentoria = new Mentoria();
        mentoria.setTittle("Mentoria de Ruby on Rails");
        mentoria.setDescription("Descrição da mentoria de Ruby on Rails");
        mentoria.setDate(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Bootcamp de Ruby on Rails");
        bootcamp.getContent().add(curso1);
        bootcamp.getContent().add(curso2);
        bootcamp.getContent().add(mentoria);

        Dev devVictor = new Dev();
        devVictor.setNameDev("Victor Cordeiro");
        devVictor.subscribeBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos pelo Victor: " + devVictor.getContentSubscribe());
        devVictor.toProgress();
        System.out.println("---");
        System.out.println("Conteúdos inscritos Victor: " + devVictor.getContentSubscribe());
        System.out.println("Conteúdos concluídos Victor: " + devVictor.getContentConcluded());
        System.out.println("XP: " + devVictor.calculateXpTotal());
    }
}
