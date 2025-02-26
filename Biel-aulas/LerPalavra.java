import javax.swing.JOptionPane;

public class LerPalavra {
    public static void main (String[] args)
    {
        String a = JOptionPane.showInputDialog("Digite a primeira palavra ");
        String b = JOptionPane.showInputDialog("Digite a segunda palavra ");
        String c = JOptionPane.showInputDialog("Digite a terceira palavra ");

        JOptionPane.showMessageDialog(null, a + " " + b + " " + c);
        
    }
    
}
