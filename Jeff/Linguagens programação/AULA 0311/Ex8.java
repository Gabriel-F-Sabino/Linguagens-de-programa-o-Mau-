//Feito
import java.util.Scanner;
public class Ex8 {
    public static void main(String[] args) {
        float angulo = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o ângulo em gruas: ");
        angulo = sc.nextFloat();
        float radiano = (float) Math.toRadians(angulo);
        
        System.out.printf("Seno de %f°: %.2f\n", angulo, Math.sin(radiano));
        System.out.printf("Cosseno de %f°: %.2f\n", angulo, Math.cos(radiano));
        System.out.printf("Tangente de %f°: %.2f\n", angulo, Math.tan(radiano));
        System.out.printf("Cossencante de %f°: %.2f\n", angulo, 1/Math.sin(radiano));
        System.out.printf("Secante de %f°: %.2f\n", angulo, 1/Math.cos(radiano));
        System.out.printf("Cotangente de %f°: %.2f\n", angulo, 1/Math.tan(radiano));
        sc.close();
    }
}