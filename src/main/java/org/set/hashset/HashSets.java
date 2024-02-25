package org.set.hashset;

import org.exercise.entities.Product;
import org.set.hashset.entities.Products;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSets {

    public static void main(String[] args) {

//        Set<String> set = new HashSet<>(); //não mantem a ordem
//        Set<String> set = new TreeSet<>(); //orderna
//        Set<String> set = new LinkedHashSet<>(); //Mantem a ordem em que foram inseridos
//
//        set.add("TV");
//        set.add("Tablet");
//        set.add("Notebook");

//        System.out.println(set.contains("Notebook"));
//        set.remove("Tablet");
//        set.removeIf(x -> x.charAt(0) == 'T');
//
//        for (String p : set) {
//            System.out.println(p);
//        }

        /*
        * União, interseção e diferença usando 2 arrays númericos
        * */

//        Set<Integer> a = new TreeSet<>(Arrays.asList(0,2,4,5,6,8,10));
//        Set<Integer> b = new TreeSet<>(Arrays.asList(5,6,7,8,9,10));
//
//        //union
//        Set<Integer> c = new TreeSet<>(a); // copia de a
//        c.addAll(b);
//        System.out.println(c);
//
//        //intersection
//        Set<Integer> d = new TreeSet<>(a);
//        d.retainAll(b);
//        System.out.println(d);
//
//        //difference
//        Set<Integer> e = new TreeSet<>(a);
//        e.removeAll(b);
//        System.out.println(e);


        /*
         * Testando igualdade com Set primeiro sem a sobrescrita do equals e hash code e depois com  a sobrescrita
         * */

        Set<Products> set = new HashSet<>();

        set.add(new Products("TV", 900.0));
        set.add(new Products("Notebook", 1200.0));
        set.add(new Products("Tablet", 400.0));

        var prod = new Products("Notebook", 1200.0);

        System.out.println(set.contains(prod));




    }
}
