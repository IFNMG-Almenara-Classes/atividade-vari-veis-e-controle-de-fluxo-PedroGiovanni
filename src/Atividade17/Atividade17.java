package Atividade17;

import java.util.Scanner;

public class Atividade17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int fatorial = 1;

        System.out.println("Digite um número:");
        n = sc.nextInt();
        for (int i = n; i >=1; i--) {
            fatorial *= i;
        }
        System.out.println(n + "! = " + fatorial);
    }
}
