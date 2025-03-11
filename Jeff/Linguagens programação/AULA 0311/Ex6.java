import java.util.Scanner;
public class Ex6 {
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
/*Crie um algoritmo que calcule o valor de uma dívida,
submetida à juros compostos:
ValorFinal = ValorInicial * (1 + J / 100) ^ N
E seja capaz de responder, se você deve para o cartão de
crédito R$ 100,00, a uma taxa de juros de 10%, quanto deverá
ser pago depois de 8 meses.
Onde:
• J representa os juros (em %); e
• N representa o número de meses.
Variáveis e Operadores
 */