//Feito
import java.util.Scanner;
public class Ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a primeira string: ");
        String str1 = sc.nextLine();
        String str1_1 = str1.substring(0, str1.length()/2);
        String str1_2 = str1.substring(str1.length()/2, str1.length());
        System.out.print("Digite a segunda string: ");
        String str2 = sc.nextLine();
        String str2_1 = str2.substring(0, str2.length()/2);
        String str2_2 = str2.substring(str2.length()/2, str2.length());
        System.out.print("Digite a terceira string: ");
        String str3 = sc.nextLine();
        String str3_1 = str3.substring(0, str3.length()/2);
        String str3_2 = str3.substring(str3.length()/2, str3.length());
        System.out.println(str1 + " " + str2 + " " + str3);
        System.out.println(str2_1 + str3_2 + str2_2 + str1_1 + str3_1 + str1_2);
        sc.close();
    }
}