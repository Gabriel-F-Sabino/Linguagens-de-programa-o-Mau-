//Feito
import java.util.Scanner;
public class Ex7 {
    public static void main(String[] args) {
        String numero = "";
        String dezena = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número com 5 algarismos: ");
        numero = sc.nextLine();
        dezena = numero.substring(numero.length() - 2 , numero.length() - 1);
        System.out.println("O algarismo da dezena é: " + dezena);
        sc.close();
    }
}