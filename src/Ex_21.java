/*
 * Receba 4 notas bimestrais de um aluno. Calcule e mostre a média aritmética. 
Mostre a mensagem de acordo com a média:
a. Se a média for >= 6,0 exibir “APROVADO”;
b. Se a média for >= 3,0 ou < 6,0 exibir “EXAME”;
c. Se a média for < 3,0 exibir “RETIDO”.
 */
import javax.swing.JOptionPane;
public class Ex_21 {
	static double n1, n2, n3, n4, media;
	static String situacao;
	public static void main (String args[]) {
		n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota"));
		n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota"));
		n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota"));
		n4 = Double.parseDouble(JOptionPane.showInputDialog("Digite a quarta nota"));
		ProcedureMedia();
		System.out.println("A media = " +media+ "  situacao:  " +situacao);
	}
	static void ProcedureMedia() {
		media = ((n1+n2+n3+n4)/4);
		if(media>=6) {
			situacao = "aprovado";
		}else{
			if(media>=3 || media <6) {
				situacao = "exame";
			}else {
				situacao = "retido";
				
			}
		}
	}
}
