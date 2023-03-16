/*Receba 2 valores reais. Calcule e mostre o maior deles.

 */
import javax.swing.JOptionPane;
public class Ex_19 {
	static double x, y, maior;
	public static void main(String args[])
	{
		x = Double.parseDouble(JOptionPane.showInputDialog("digite o valor de x"));
		y = Double.parseDouble(JOptionPane.showInputDialog("digite o valor de y"));
		ProcedureMaior();
		System.out.println("maior = " +maior);
	}
	static void ProcedureMaior() {
		if(x>y) {
			maior = x;
		}else {
			maior = y;
		}
	}
}
