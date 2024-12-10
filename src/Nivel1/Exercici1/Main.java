package Nivel1.Exercici1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> countries = Arrays.asList("Alemania", "Montenegro", "Croacia", "Noruega", "Canada", "Salvador");


        List<String> filteredCountries = countries.stream()
                .filter(countrie -> countrie.contains("o"))
                .collect(Collectors.toList());

        System.out.println(filteredCountries);
    }
}
