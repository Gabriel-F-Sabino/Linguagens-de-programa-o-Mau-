import java.util.Scanner;

public class ex3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int num = sc.nextInt();

        double num2 = Math.pow(num,2);

        System.out.println("Seu número ao quadrado é: " + num2);
        sc.close();   

    }
}
