package ativ;


import java.util.Scanner;

public class Potencia {

    
    public static int potencia(int base, int expoente) {
        if (expoente == 0) {
            return 1;
        }

        return base * potencia(base, expoente - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a base: ");
        int base = sc.nextInt();

        System.out.print("Digite o expoente: ");
        int expoente = sc.nextInt();

        if (expoente < 0) {
            System.out.println("Digite um expoente nao negativo.");
        } else {
            System.out.println("Resultado: " + potencia(base, expoente));
        }

        sc.close();
    }
}