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



        Aluno aluno1 = new Aluno(1,"AlunoA" );
        Aluno aluno2 = new Aluno(2,"AlunoB" );
        Aluno aluno3 = new Aluno(3,"AlunoC" );
        Aluno aluno4 = new Aluno(4,"Amanda" );
        Aluno aluno5 = new Aluno(5,"AlunoE" );
        Aluno aluno6 = new Aluno(5,"Lucas" );

        List<Aluno> alunoCursoA = Arrays.asList(aluno5, aluno2, aluno6);
        List<Aluno> alunoCursoB = Arrays.asList(aluno4, aluno3, aluno6);
        List<Aluno> alunoCursoC = Arrays.asList(aluno1, aluno2, aluno6);

        Curso cursoTeste = new Curso("CursoA", alunoCursoA);
        Curso cursoTeste2 = new Curso("CursoB", alunoCursoB);
        Curso cursoTeste3 = new Curso("CursoC", alunoCursoC);

        Set<Aluno> cursoA = new HashSet<>(cursoTeste.getAlunos());
        Set<Aluno> cursoB = new HashSet<>(cursoTeste2.getAlunos());
        Set<Aluno> cursoC = new HashSet<>(cursoTeste3.getAlunos());


//        cursoB.add(aluno2);
//        cursoB.add(aluno3);
//
//        cursoC.add(aluno2);
//        cursoC.add(aluno4);

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
