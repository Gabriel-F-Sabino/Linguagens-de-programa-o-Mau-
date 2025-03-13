import javax.swing.JOptionPane;

public class LerNumero 
{
    public static void main(String[] args)
    {
        String a = JOptionPane.showInputDialog("Digite um número inteiro");
        
        int b = Integer.parseInt(a);

        JOptionPane.showMessageDialog(null, "O valor do número digitado é: " + b );
    }
    
}
