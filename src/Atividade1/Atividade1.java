package Atividade1;
import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1;
        int n2;

        System.out.println("Digite o primeiro número: ");
        n1 = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        n2 = sc.nextInt();

        if (n1 > n2) {
            System.out.println(n1+" é maior que "+n2);
        }
        else{
            System.out.println(n2+" é maior que "+n1);
        }
    }
}
