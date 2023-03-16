/*Receba 2 valores inteiros. Calcule e mostre o resultado da diferença do 
maior pelo menos valor.
*/
import javax.swing.JOptionPane;
public class Ex_18 
{
	static int x,y,dif;
	public static void main (String args[]) 
	{
	x=Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de x"));
	y=Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de y"));
	ProcedureDif();
	System.out.println("A diferenca ="+dif);
	}
	static void ProcedureDif() 
	{
		if(x>y) {
			dif = (x-y);
		}else {
			dif = (y-x);
		}
	}
}
