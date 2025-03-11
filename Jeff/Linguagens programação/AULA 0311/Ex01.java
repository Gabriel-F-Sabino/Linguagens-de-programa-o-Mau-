//Feito
import java.util.Scanner;
public class Ex01 {
    public static void main(String[] args) {
        int diasAno = 365;
        int idade = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a sua idade em anos: ");
        idade = sc.nextInt();
        int diasVivo = idade * diasAno; // Aproximação de dias em um ano
        System.out.println("Você viveu aproximadamente " + diasVivo + " dias.");
        sc.close();
    }
}