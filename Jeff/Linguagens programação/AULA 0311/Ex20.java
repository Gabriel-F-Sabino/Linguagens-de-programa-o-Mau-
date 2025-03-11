//Feito
import java.util.Scanner;
public class Ex20 {
    public static void main(String[] args) {
        float lado1 = 0;
        float lado2 = 0;
        float angulo = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor do pimeiro lado: ");
        lado1 = sc.nextFloat();
        System.out.print("Digite o valor do segundo lado: ");
        lado2 = sc.nextFloat(); 
        System.out.print("Digite o valor do ângulo entre os lados em °: ");
        angulo = (float) Math.toRadians(sc.nextFloat());        
        float lado3 = (float) Math.sqrt(Math.pow(lado1, 2) + Math.pow(lado2, 2) - 2 * lado1 * lado2 * Math.cos(angulo));
        System.out.println("O valor do terceiro lado é: " + lado3);
        sc.close();
    }
}