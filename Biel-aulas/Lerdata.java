import javax.swing.JOptionPane;

public class Lerdata {
    public static void main(String[] args){

        String a = JOptionPane.showInputDialog("Digite o dia ");
        String b = JOptionPane.showInputDialog("Digite o mês ");
        String c = JOptionPane.showInputDialog("Digite o ano ");

        int d = Integer.parseInt(a);
        int e = Integer.parseInt(b);
        int f = Integer.parseInt(c);


        JOptionPane.showMessageDialog(null, d + "/" + e + "/" + f);
    }
    
}
