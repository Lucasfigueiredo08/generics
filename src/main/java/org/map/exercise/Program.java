package org.map.exercise;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import java.util.TreeMap;

public class Program {

    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in); // entrada do path do arquivo

        Map<String, Integer> candidatos = new LinkedHashMap<>();

        System.out.println("Informe o caminho do arquivo: ");
        String path = sc.nextLine();





        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();

            while (line != null) {

                String[] fields = line.split(",");
                String name = fields[0];
                int votes = Integer.parseInt(fields[1]);

                if (candidatos.containsKey(name)) {
                    int votesSoFar = candidatos.get(name);
                    candidatos.put(name, votes + votesSoFar);
                } else {
                    candidatos.put(name, votes);
                }


//                candidatos.put(name, votes);

                line = br.readLine();
            }

            for (String key : candidatos.keySet()) {
                System.out.println(key + ": " + candidatos.get(key));
            }

        }  catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

//        for (String key : candidatos.keySet()) {
//            System.out.println(key + ": " + candidatos.get(key));
//        }

        sc.close();

    }


}
