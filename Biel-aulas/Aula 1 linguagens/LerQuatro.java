import javax.swing.JOptionPane;

public class LerQuatro {
    public static void main(String[] args){

        char a = JOptionPane.showInputDialog("Digite um milhar ").charAt(0);
        char b = JOptionPane.showInputDialog("Digite um centena ").charAt(0);
        char c = JOptionPane.showInputDialog("Digite um dezena ").charAt(0);
        char d = JOptionPane.showInputDialog("Digite um unidade ").charAt(0);

        JOptionPane.showMessageDialog(null, ""+a+b+c+d);

    }
}
