package Atividade12;

import java.util.Scanner;

public class Atividade12{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        int qtdPares = 0;
        int soma = 0;
        int qtdNumeros = 0;

        System.out.println("Digite números inteiros (0 para encerrar):");

        while (true) {
            numero = sc.nextInt();

            if (numero == 0) {
                break;
            }


            if (numero % 2 == 0) {
                qtdPares++;
            }


            soma += numero;
            qtdNumeros++;
        }

        if (qtdNumeros > 0) {
            double media = (double) soma / qtdNumeros;
            System.out.println("Quantidade de números pares: " + qtdPares);
            System.out.println("Média dos números digitados: " + media);
        } else {
            System.out.println("Nenhum número foi digitado.");
        }

        sc.close();
    }
}

