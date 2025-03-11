import java.util.Scanner;

public class ex4 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a primeira string: ");
        String st1 = sc.nextLine();

        System.out.print("Digite a segunda string: ");
        String st2 = sc.nextLine();

        System.out.print("Digite a terceira string: ");
        String st3 = sc.nextLine();

        int compTotal = st1.length() + st2.length() + st3.length();

        System.out.println("O comprimento da sua string é de: " + compTotal);
        sc.close();  

    }
    
}
