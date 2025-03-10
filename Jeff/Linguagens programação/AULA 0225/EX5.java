import javax.swing.*; // biblioteca para entrada e saída de dados em java
public class EX5 {
    public static void main(String[] args){
        // Crie e teste, em Java, um algoritmo que leia, no formato real, o peso e a altura do usuário, e depois apresente a tela:
        // ➢ “Seus dados digitados foram: <peso>kg e <altura>m”.

        String s1 = JOptionPane.showInputDialog("Digite o seu peso em Kg: "); // chama uma caixa de texto para digitar e armazena o valor
        String s2 = JOptionPane.showInputDialog("Digite a sua altura em metros (utilize ponto para separar o decimal): ");
        double peso = Double.parseDouble(s1); // converte a string em double
        double altura = Double.parseDouble(s2);
        JOptionPane.showMessageDialog(null, "Seus dados digitados foram: " + peso + "kg e " + altura + "m"); // chama uma caixa de texto que mostra o número digitado
    }
}
