//Feito
import java.util.Scanner;
public class Ex15 {
    public static void main(String[] args) {
        float raio = 0;
        float pi = 3.14159f;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor do raio: ");
        raio = sc.nextFloat();    
        float area = pi * raio * raio;
        System.out.println("A área do círculo é " + area + " unidades de área.");
        sc.close();
    }
}