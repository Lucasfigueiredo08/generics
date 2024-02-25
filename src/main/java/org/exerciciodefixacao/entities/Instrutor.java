package org.exerciciodefixacao.entities;

import java.util.List;
import java.util.Set;

public class Instrutor {

    private String nome;

    private List<Curso> cursos;

    public Instrutor(String nome, List<Curso> cursos) {
        this.nome = nome;
        this.cursos = cursos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }
}
