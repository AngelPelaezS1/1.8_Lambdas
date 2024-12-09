package Nivel1.Exercici2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


    public class Main {
        public static void main(String[] args) {
            List<String> names = Arrays.asList("Fernando", "Eduardo", "Leo", "Angel", "Anna", "Salvador");


            List<String> filteredCountries = names.stream()
                    .filter(n -> n.contains("o"))
                    .filter(n -> n.length() > 5)
                    .collect(Collectors.toList());

            System.out.println(filteredCountries);
        }
    }
