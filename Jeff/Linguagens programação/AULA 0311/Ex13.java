//Feito
import java.util.Scanner;
public class Ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a data no formato dd/mm/aa: ");
        String data = sc.nextLine();
        String dia = data.substring(0, 2);
        String mes = data.substring(3, 5);
        String ano = data.substring(6, 8);
        System.out.println("Dia: " + dia + ", Mês: " + mes + ", Ano: " + ano);
        sc.close();
    }
}