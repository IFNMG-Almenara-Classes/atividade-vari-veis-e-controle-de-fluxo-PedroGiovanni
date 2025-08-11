package Atividade14;

import java.util.Scanner;

public class Atividade14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tipo;
        double valor;

        System.out.println("Digite qual o seu tipo de cliente: \n1- Comum\n2- Vip\n3- Funcionário ");
        tipo = sc.nextInt();
        System.out.println("Digite o valor da pizza: ");
        valor = sc.nextDouble();
        if (tipo == 1) {
            System.out.println("O valor a ser pago é: R$" + valor);
        }
        else if (tipo == 2) {
            System.out.println("O valor a ser pago é: R$" + (valor-(valor*0.05)));
        }
        else {
            System.out.println("O valor a ser pago é: R$" + (valor-(valor*0.1)));
        }
    }
}
