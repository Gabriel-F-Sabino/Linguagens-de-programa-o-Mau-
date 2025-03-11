//Feito
import java.util.Scanner;
public class Ex19 {
    public static void main(String[] args) {
        float diagonal_menor = 0;
        float diagonal_maior = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor da diagonal menor: ");
        diagonal_menor = sc.nextFloat();
        System.out.print("Digite o valor da diagonal maior: ");
        diagonal_maior = sc.nextFloat();        
        float area = diagonal_maior * diagonal_menor / 2;
        System.out.println("A área do losanglo é " + area + " unidades de área.");
        sc.close();
    }
}