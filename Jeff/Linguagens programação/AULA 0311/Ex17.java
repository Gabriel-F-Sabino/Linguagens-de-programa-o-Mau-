//Feito
import java.util.Scanner;
public class Ex17 {
    public static void main(String[] args) {
        float base = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        base = sc.nextFloat();
        System.out.println("O número digitado foi: " + base + " sua raiz quadrada é: " + Math.sqrt(base) + 
        " e seu quadrado é: " + Math.pow(base, 2));
        sc.close();
    }
}