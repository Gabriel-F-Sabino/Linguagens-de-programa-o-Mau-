//Feito
import java.util.Scanner;
public class Ex16 {
    public static void main(String[] args) {
        int dividendo = 0;
        int divisor = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o dividendo: ");
        dividendo = sc.nextInt();
        System.out.print("Digite o divisor: ");
        divisor = sc.nextInt();     
        int quociente = dividendo / divisor;
        int resto = dividendo % divisor;
        
        System.out.println("O dividendo da divisão é " + dividendo + " e o divisor é " + divisor);
        System.out.println("O quociente da divisão é " + quociente + " e o resto é " + resto);
        sc.close();
    }
}