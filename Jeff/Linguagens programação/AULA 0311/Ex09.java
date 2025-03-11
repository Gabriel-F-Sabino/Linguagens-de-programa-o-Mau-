//Feito
import java.util.Scanner;
public class Ex09 {
    public static void main(String[] args) {
        int numero = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número: ");
        numero = sc.nextInt();
        System.out.println("Seu logaritmo na base 10 é: " + Math.log10(numero));
        sc.close();
    }
}