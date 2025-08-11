package Atividade16;

import java.util.Scanner;

public class Atividade16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.println("Digite um numero: ");
        numero = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero+"*"+i+"="+(numero*i));
        }
        for (int i = 1; i <= 10; i++) {
            double resultado = (double)numero/i;
            System.out.printf("%d / %d%.2f\n", numero, i, resultado);
        }
    }
}
