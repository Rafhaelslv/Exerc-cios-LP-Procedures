/*Calcule a quantidade de litros gastos em uma viagem, sabendo que o 
automóvel faz 12 km/l. Receber o tempo de percurso e a velocidade média
*/
import javax.swing.JOptionPane;
public class Ex_17 {
	static double tp,vm,lg;
	public static void main(String args[] ){
		  tp=Double.parseDouble(JOptionPane.showInputDialog("digite o tempo de percurso"));
		  vm=Double.parseDouble(JOptionPane.showInputDialog("digite a velocidade media"));
		  ProcedureLG();
		  System.out.println("Litros gastos="+lg);
	}
	
	static void ProcedureLG() {
		double dist;
		dist=(tp*vm);
		lg=(dist/12);
	}

}
