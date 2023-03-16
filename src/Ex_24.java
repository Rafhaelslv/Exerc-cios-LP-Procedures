/*Receba um valor inteiro. Verifique e mostre se é divisível por 2 e 3.
*/
import javax.swing.JOptionPane;
public class Ex_24 {
	static int x;
	public static void main (String args[]) {
		x = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
		ProcedureDivi();
	}
	static void ProcedureDivi() {
		if (((x % 2) == 0) && (( x % 3)==0))
                    {
			System.out.println("e divisivel por 2 e 3");
		    }
                else {
			System.out.println("nao e divisivel por 2 e 3");
		    }
	}
}