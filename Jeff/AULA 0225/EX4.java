import javax.swing.*; // biblioteca para entrada e saída de dados em java
public class EX4 {
    public static void main(String[] args){
        // Crie e teste, em Java, um algoritmo que leia 3 (três) números, separadamente, que representem uma data,
        // respectivamente, dia, mês e ano, e depois apresente a tela:
        // ➢ “A data digitada foi <DD>/<MM>/<AAAA>”

        String s1 = JOptionPane.showInputDialog("Digite um dia em número: "); // chama uma caixa de texto para digitar e armazena o valor
        String s2 = JOptionPane.showInputDialog("Digite um mês em número: ");
        String s3 = JOptionPane.showInputDialog("Digite um ano em número: ");
        int dia = Integer.parseInt(s1); // converte a string em int
        int mes = Integer.parseInt(s2);
        int ano = Integer.parseInt(s3);
        JOptionPane.showMessageDialog(null, "A data digitada foi " + dia + "/" + mes + "/" + ano); // chama uma caixa de texto que mostra o número digitado
    }
}
