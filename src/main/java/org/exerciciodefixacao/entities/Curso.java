package org.exerciciodefixacao.entities;

import java.util.List;

public class Curso {

    private String name;

    private List<Aluno> alunos;

    public Curso(String name, List<Aluno> alunos) {
        this.name = name;
        this.alunos = alunos;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "name='" + name + '\'' +
                ", alunos=" + alunos +
                '}';
    }
}
