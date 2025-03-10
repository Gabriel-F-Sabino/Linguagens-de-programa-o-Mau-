import javax.swing.*; // biblioteca para entrada e saída de dados em java
public class EX6 {
    public static void main(String[] args){
        // Crie e teste, em Java, um algoritmo que leia 10 (dez) caracteres, um a um, e imprima, de uma só vez, a palavra formada pela união deles.

        String s1 = JOptionPane.showInputDialog("Digite o primeiro caractere: "); // chama uma caixa de texto para digitar e armazena o valor
        String s2 = JOptionPane.showInputDialog("Digite o segundo caractere: ");
        String s3 = JOptionPane.showInputDialog("Digite o terceiro caractere: ");
        String s4 = JOptionPane.showInputDialog("Digite o quarto caractere: ");
        String s5 = JOptionPane.showInputDialog("Digite o quinto caractere: ");
        String s6 = JOptionPane.showInputDialog("Digite o sexto caractere: ");
        String s7 = JOptionPane.showInputDialog("Digite o sétimo caractere: ");
        String s8 = JOptionPane.showInputDialog("Digite o oitavo caractere: ");
        String s9 = JOptionPane.showInputDialog("Digite o nono caractere: ");
        String s10 = JOptionPane.showInputDialog("Digite o décimo caractere: ");
        char c1 = s1.charAt(0); // converte a string em char
        char c2 = s2.charAt(0);
        char c3 = s3.charAt(0);
        char c4 = s4.charAt(0);
        char c5 = s5.charAt(0);
        char c6 = s6.charAt(0);
        char c7 = s7.charAt(0);
        char c8 = s8.charAt(0);
        char c9 = s9.charAt(0);
        char c10 = s10.charAt(0);
        JOptionPane.showMessageDialog(null, "A união dos 10 caracteres formam a seguinte palavra: " + c1+c2+c3+c4+c5+c6+c7+c8+c9+c10); // chama uma caixa de texto que mostra o número digitado
    }
}
