import javax.swing.*; // biblioteca para entrada e saída de dados em java
public class EX7 {
    public static void main(String[] args){
        // Crie e teste, em Java, um algoritmo que leia 4 (quatro) números inteiros, um a um, de um único dígito cada,
        // representando, na ordem, milhar, centena, dezena e unidade. Use o tipo caractere, para garantir que não seja digitado mais
        // de um número por vez. Após a concatenação desses números, armazene-os em uma variável do tipo String. Apresente em
        // tela o valor final dessa String.

        String s1 = JOptionPane.showInputDialog("Digite a unidade de milhar: "); // chama uma caixa de texto para digitar e armazena o valor
        String s2 = JOptionPane.showInputDialog("Digite a centena: ");
        String s3 = JOptionPane.showInputDialog("Digite a dezena: ");
        String s4 = JOptionPane.showInputDialog("Digite a unidade: ");
        char c1 = s1.charAt(0); // converte a string em char
        char c2 = s2.charAt(0);
        char c3 = s3.charAt(0);
        char c4 = s4.charAt(0);
        String n = "" + c1 + c2 + c3 + c4;
        JOptionPane.showMessageDialog(null, "O número digitado foi: " + n); // chama uma caixa de texto que mostra o número digitado
    }
}
