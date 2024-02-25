package org.set.hashset;

import org.exercise.entities.Product;
import org.set.hashset.entities.Products;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSets {
    /*
    * Usando comparação do treeSet
    * */

    public static void main(String[] args) {
        Set<Products> set = new TreeSet<>();

        set.add(new Products("TV", 900.0));
        set.add(new Products("Notebook", 1200.0));
        set.add(new Products("Tablet", 400.0));

        for (Products p : set) {
            System.out.println(p);
        }

    }
}
