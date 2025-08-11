package Atividade4;
import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String senha = "1234";
        String senhaDigitada;

        System.out.println("Digite sua senha: ");
        senhaDigitada = sc.nextLine();

        if (senha.equals(senhaDigitada)){
            System.out.println("Acesso permitido!");
        }
        else{
            System.out.println("Acesso negado!");
        }
    }
}
