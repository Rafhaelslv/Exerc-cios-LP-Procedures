/*Receba 3 valores obrigatoriamente em ordem crescente e um 4º valor não 
necessariamente em ordem. Mostre os 4 números em ordem crescente.
*/
import javax.swing.JOptionPane;
public class Ex_23 {
	static int n1, n2 , n3, n4;
	public static void main(String args[]) {
	n1 = Integer.parseInt(JOptionPane.showInputDialog("digite o primeiro valor"));
	n2 = Integer.parseInt(JOptionPane.showInputDialog("digite o segundo valor"));
	n3 = Integer.parseInt(JOptionPane.showInputDialog("digite o terceiro valor"));
	n4 = Integer.parseInt(JOptionPane.showInputDialog("digite o quarto valor"));
	ProcedureValor();
	System.out.println(+n1+"-"+n2+"-"+n3+"-"+n4);
	}
static void ProcedureValor() {
	int aux;
	if(n1>n4) {
		aux = n4;
		n4 = n3;
		n3 = n2;
		n2 = n1;
		n1 = aux;
	}
}
}
