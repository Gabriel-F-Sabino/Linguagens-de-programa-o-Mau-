//Feito
import java.util.Scanner;
public class Ex10 {
    public static void main(String[] args) {
        int numero = 0;
        int base = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número: ");
        numero = sc.nextInt();
        System.out.print("Digite a base: ");
        base = sc.nextInt();
        System.out.println("Seu logaritmo na base 10 é: " + Math.log(numero)/Math.log(base));
        sc.close();
    }
}