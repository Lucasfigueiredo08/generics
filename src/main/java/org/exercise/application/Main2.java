package org.exercise.application;

import org.exercise.entities.Product;
import org.exercise.services.CalculationService;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main2 {
    public static void main(String[] args) throws FileNotFoundException {

        Locale.setDefault(Locale.US);

        List<Product> list = new ArrayList<>();

        String path = "C:\\temp\\product.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))){

            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                list.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }

            Product x = CalculationService.max(list);
            System.out.println("Most expensiveclear" +
                    ":");
            System.out.println(x);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}