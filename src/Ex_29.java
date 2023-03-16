/*Receba o tipo de investimento (1 = poupança e 2 = renda fixa) e o valor do 
investimento. Calcule e mostre o valor corrigido em 30 dias sabendo que a 
poupança = 3% e a renda fixa = 5%. Demais tipos não serão considerados.
*/
import javax.swing.JOptionPane;
public class Ex_29 {
	static double ti, vi, vc;
	public static void main (String args[]) {
		ti = Double.parseDouble(JOptionPane.showInputDialog("Digite o tipo de investimento"));
		vi = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do investimento"));
		ProcedureInvest();
		System.out.println("Valor corrigido = "+vc);
	}
	static void ProcedureInvest() {
		if(ti==1) {
			vc = (vi+(vi*0.03));
		}else {
			vc = (vi+(vi*0.05));
		}
	}
}
