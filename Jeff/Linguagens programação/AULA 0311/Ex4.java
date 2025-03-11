//Feito
import java.util.Scanner;
public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a primeira string: ");
        String str1 = sc.nextLine();
        System.out.print("Digite a segunda string: ");
        String str2 = sc.nextLine();
        System.out.print("Digite a terceira string: ");
        String str3 = sc.nextLine();
        int tamanho = str1.length() + str2.length() + str3.length();
        System.out.println("O tamanho total das strings é " + tamanho + ".");
        sc.close();
    }
}