/*Receba o número de voltas, a extensão do circuito (em metros) e o tempo de 
duração (minutos). Calcule e mostre a velocidade média em km/h.
*/
import javax.swing.JOptionPane;
public class Ex_27 {
	static double nvoltas, metros , tdur, vm;
	public static void main(String args[]) {
	nvoltas = Double.parseDouble(JOptionPane.showInputDialog("Digite o numero de voltas"));
	metros = Double.parseDouble(JOptionPane.showInputDialog("Digite a extenção do circuito"));
	tdur = Double.parseDouble(JOptionPane.showInputDialog("Digite o tempo de duração"));
	ProcedureVM();
	System.out.println("A velocidade media = "+vm);
	}
static void ProcedureVM() {
	vm= (nvoltas * metros)/(tdur / 60);
}
}
