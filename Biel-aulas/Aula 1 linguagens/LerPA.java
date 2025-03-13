import javax.swing.JOptionPane;

public class LerPA {
    public static void main(String[] args){

        String a = JOptionPane.showInputDialog("Digite seu peso ");
        String b = JOptionPane.showInputDialog("Digite sua altura ");
        
        double peso = Double.parseDouble (a);
        double altura = Double.parseDouble (b);


        JOptionPane.showMessageDialog(null, + peso + "kg e " + altura + "m" );
    }
    }
    

