import javax.swing.*; // biblioteca para entrada e saída de dados em java
public class EX1 {
    public static void main(String[] args){
        // Crie e teste, em Java, um algoritmo que leia 3 (três) palavras, uma a uma, separadamente, e as apresente e tela, na mesma
        // ordem em que foram digitadas, numa única linha, separadas por espaços.

        String p1 = JOptionPane.showInputDialog("Digite a primeira palavra: "); // chama uma caixa de texto para digitar e armazena o valor
        String p2 = JOptionPane.showInputDialog("Digite a segunda palavra: ");
        String p3 = JOptionPane.showInputDialog("Digite a terceira palavra: ");
        JOptionPane.showMessageDialog(null, p1 + " " + p2 + " " + p3); // chama uma caixa de texto que mostra as palavras na ordem que foram digitadas separadas por espaço
    }
}
