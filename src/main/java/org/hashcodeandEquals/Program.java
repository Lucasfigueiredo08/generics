package org.hashcodeandEquals;

import org.hashcodeandEquals.entities.Client;

public class Program {

    public static void main(String[] args) {


//        String a = "maria";


//        String b = "maria";
//        String b = "alex";
//
//        System.out.println(a.hashCode());
//        System.out.println(b.hashCode());
        Client c1 = new Client("Maria", "maria@gmail.com.br");
        Client c2 = new Client("Maria", "maria@gmail.com.br");

        String s1 = "Test";
        String s2 = "Test";

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));
        System.out.println(c1 == c2);
        System.out.println(s1 == s2);


    }
}
