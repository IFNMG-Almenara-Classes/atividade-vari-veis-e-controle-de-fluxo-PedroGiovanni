package Atividade5;
import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int qtdLaranjas;

        System.out.println("Digite a quantidade de laranjas: ");
        qtdLaranjas = sc.nextInt();

        if (qtdLaranjas <12){
            System.out.println("O valor total da compra foi: R$ " + (qtdLaranjas*0.5));
        }
        else{
            System.out.println("O valor total da compra foi: R$ "+ (qtdLaranjas*0.3));
        }
    }
}
