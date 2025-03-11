//Feito
import java.util.Scanner;
public class Ex12 {
    public static void main(String[] args) {
        int data = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma data no formato ddmmaa: ");
        data = sc.nextInt();
        String dataStr = String.valueOf(data);
        String dia = dataStr.substring(0, 2);
        String mes = dataStr.substring(2, 4);
        String ano = dataStr.substring(4, 6);
        System.out.println("Dia: " + dia + ", Mês: " + mes + ", Ano: " + ano);
        sc.close();
    }
}