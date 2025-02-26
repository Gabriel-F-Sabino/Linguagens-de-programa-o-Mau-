import javax.swing.*; // biblioteca para entrada e saída de dados em java
public class EX3 {
    public static void main(String[] args){
        // Crie e teste, em Java, um algoritmo que leia 1 (um) número inteiro, armazene-o em uma variável do tipo inteiro, e depois apresente em tela:
        // ➢ “O valor do número digitado é: <número digitado>”.

        String s1 = JOptionPane.showInputDialog("Digite um número inteiro: "); // chama uma caixa de texto para digitar e armazena o valor
        int n = Integer.parseInt(s1); // converte a string em int
        JOptionPane.showMessageDialog(null, "O valor do número digitado é: " + n); // chama uma caixa de texto que mostra o número digitado
    }
}
