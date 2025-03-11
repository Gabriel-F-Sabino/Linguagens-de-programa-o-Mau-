//Feito
import java.util.Scanner;
public class Ex18 {
    public static void main(String[] args) {
        float base = 0;
        float altura = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a altura do triângulo: ");
        altura = sc.nextFloat();
        System.out.print("Digite a base do triângulo: ");
        base = sc.nextFloat();        
        float area = base * altura / 2;
        System.out.println("A área do triângulo é " + area + " unidades de área.");
        sc.close();
    }
}