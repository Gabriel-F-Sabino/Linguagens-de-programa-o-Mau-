//Feito
import java.util.Scanner;
public class Ex14 {
    public static void main(String[] args) {
        float a = 0;
        float b = 0;
        float c = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a: ");
        a = sc.nextFloat();
        System.out.print("Digite b: ");
        b = sc.nextFloat(); 
        System.out.print("Digite c: ");
        c = sc.nextFloat();      
        float resultado = 2 * ((a - c) / 8) - b * 5;
        System.out.println("A expressão x = 2 * ( ( a - c ) / 8 ) - b * 5 tem como resultado: " + resultado);
        sc.close();
    }
}