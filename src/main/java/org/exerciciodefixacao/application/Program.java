package org.exerciciodefixacao.application;

import org.exerciciodefixacao.entities.Aluno;
import org.exerciciodefixacao.entities.Curso;
import org.exerciciodefixacao.entities.Instrutor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Program
{
    public static void main(String[] args) {
        Set<Aluno> cursoA = new HashSet<>();
        Set<Aluno> cursoB = new HashSet<>();
        Set<Aluno> cursoC = new HashSet<>();

        Aluno aluno1 = new Aluno(1,"AlunoA" );
        Aluno aluno2 = new Aluno(2,"AlunoB" );
        Aluno aluno3 = new Aluno(3,"AlunoC" );
        Aluno aluno4 = new Aluno(4,"AlunoD" );
        Aluno aluno5 = new Aluno(5,"AlunoE" );


        cursoA.add(aluno1);
        cursoA.add(aluno2);
        cursoA.add(aluno3);

        cursoB.add(aluno2);
        cursoB.add(aluno3);

        cursoC.add(aluno2);
        cursoC.add(aluno4);
//        cursoC.add(aluno5);

        Set<Aluno> total = new HashSet<>(cursoA);

        total.addAll(cursoB);
        total.addAll(cursoC);

        System.out.println("Total de alunos: " + total.size());

        System.out.println("Alunos de Alex");
        for (var a : total) {
            System.out.println(a.getNome());
        }




    }
}
