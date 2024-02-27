package org.map;

import org.map.entities.Product;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Program {

    public static void main(String[] args) {
//        Map<String, String> cookies = new TreeMap<>();
//
//        cookies.put("username", "Maria");
//        cookies.put("email", "maria@gmail.com");
//        cookies.put("phone", "99771122");
//
//        cookies.remove("email");
//        cookies.put("phone", "99771133");
//
//        System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
//
//        System.out.println("Phone number: " + cookies.get("phone"));
//        System.out.println("Email: " + cookies.get("email"));
//        System.out.println("Size: " + cookies.size());
//
//        System.out.println("ALL COOKIES: ");
//        for (String key : cookies.keySet()) {
//            System.out.println(key + ": " + cookies.get(key));
//        }

        //Exemplo de estoque
        Map<Product, Double> stock = new HashMap<>();

        Product p1 = new Product("TV", 900.0);
        Product p2 = new Product("Notebook", 1200.0);
        Product p3 = new Product("Table", 400.0);

        stock.put(p1, 1000.0);
        stock.put(p2, 2000.0);
        stock.put(p3, 3000.0);

        Product ps = new Product("TV", 900.0);

        System.out.println("Contains 'ps' key: " + stock.containsKey(ps));

    }
}
