package Atividade11;

import java.util.Scanner;

public class Atividade11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número inteiro e positivo: ");
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            System.out.println(i);
        }
    }
}
