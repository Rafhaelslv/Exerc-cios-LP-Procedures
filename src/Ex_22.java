/*Receba 2 valores inteiros e diferentes. Mostre seus valores em ordem 
crescente.
*/

import javax.swing.JOptionPane;
public class Ex_22 {
	static int n1,n2;
	public static void main (String args[] ){
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor"));
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor"));
		ProcedureOrdem();
		System.out.println(+n1+ " - " +n2);
	}
	static void ProcedureOrdem(){
		int aux;
		if(n1>n2) {
			aux = n2;
			n2 = n1;
			n1 = aux;
		}
	}
}
