/*
 * ALGED - Lista Ex - 1o Sem - Ex30
 *
 *	C�lculo de S�rie (Somat�ria de 1/2^n) - Recursivo
 */
import	javax.swing.*;

public class ALGED_Lista_Ex_1o_Sem_Ex30
{
	public static void main(String Args[])
	{
		String	sIO;
		int		iT;

		JOptionPane.showMessageDialog(null,"C�lculo da S�rie\nSomat�ria de 1/2^n onde\no termo digitado T � n+1","ALGED-Ex30",JOptionPane.PLAIN_MESSAGE);
		do
		{
			iT=Integer.parseInt(JOptionPane.showInputDialog(null,"Termo T (T>=0) da S�rie, onde T=n+1: ","Digite",JOptionPane.QUESTION_MESSAGE));
		}while(iT<0);

		sIO="O valor S da s�rie (recursiva) com "+iT+" elementos vale "+serie_1(iT)+".";
		JOptionPane.showMessageDialog(null,sIO,"Resultado",JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}

	public static double serie_1(int iT)
	{
		if(iT>0)
		{
			return	1/Math.pow(2,iT-1)+serie_1(iT-1);
		}
		else	return	0;
	}
}
