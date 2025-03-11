import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args) {
        float numero = 0;
        float quadrado = 2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número a ser elevado ao quadrado: ");
        numero = sc.nextFloat();
        float quadradoNumero = (float) Math.pow(numero, quadrado);
        System.out.println("O quadrado de " + numero + " é " + quadradoNumero + ".");
        sc.close();
    }
}