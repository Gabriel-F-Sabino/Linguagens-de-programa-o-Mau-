import java.util.Scanner;

public class ex1 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a sua idade: ");
        int idade = sc.nextInt();

        int dias = idade * 365;

        System.out.println("Sua idade em dias são: " + dias);
        sc.close();
    }

}