package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumaValores {

    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {

            String value = scanner.next();
            Integer numero = 0;
            try {
                numero = Integer.valueOf(value);
                if (numero == 0) {
                    Integer suma = numeros.stream().reduce(0, Integer::sum);
                    System.out.println(suma);
                    break;
                } else {
                    numeros.add(numero);
                }
            } catch (Exception e) {
                System.out.println("el numero ingresado es invalido");
            }
        }
    }
}
