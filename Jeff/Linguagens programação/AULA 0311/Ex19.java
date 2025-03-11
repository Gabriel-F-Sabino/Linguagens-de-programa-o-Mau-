import java.util.Scanner;
public class Ex19 {
    public static void main(String[] args) {
        float base = 0;
        float altura = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a altura do retângulo: ");
        altura = sc.nextFloat();
        System.out.print("Digite a base do retângulo: ");
        base = sc.nextFloat();        
        float area = base * altura;
        System.out.println("A área do retângulo é " + area + " unidades de área.");
        sc.close();
    }
}