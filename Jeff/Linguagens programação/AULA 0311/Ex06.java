//Feito
import java.util.Scanner;
public class Ex06 {
    public static void main(String[] args) {
        float ValorInicial = 0;
        float ValorFinal = 0;
        float juros = 0;
        int N = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor inicial em R$: ");
        ValorInicial = sc.nextFloat();
        System.out.print("Digite o valor do juros em %: ");
        juros = sc.nextFloat();
        System.out.print("Digite o número de meses: ");
        N = sc.nextInt();        
        ValorFinal = ValorInicial * (float) Math.pow(1 + juros/100, N);
        System.out.printf("O valor final a ser pago com juros é: R$ %.2f",ValorFinal);
        sc.close();
    }
}