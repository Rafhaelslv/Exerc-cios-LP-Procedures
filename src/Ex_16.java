/*
   Receba a quantidade de horas trabalhadas, o valor por hora, o percentual 
de desconto e o número de descendentes. Calcule o salário que serão as 
horas trabalhadas x o valor por hora. Calcule o salário líquido (= Salário 
Bruto – desconto). A cada dependente será acrescido R$ 100 no Salário 
Líquido. Exiba o salário a receber.
*/
	import javax.swing.JOptionPane;
	public class Ex_16 {
	    static double hor_tra, val_hora, pec, n_dependentes, salario, perc;
	    public static void main (String args[]){
	    hor_tra = Double.parseDouble(JOptionPane.showInputDialog("Digite as horas trabalhadas"));
	    val_hora = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor por hora"));
	    perc = Double.parseDouble(JOptionPane.showInputDialog("Digite o percentual de desconto"));    	
	    n_dependentes = Double.parseDouble(JOptionPane.showInputDialog("Digite o numero de dependentes"));
	    ProcedureSalario();
	    System.out.println("Salario a receber = " +salario);
	    }
	    
	    static void ProcedureSalario() {
	    	double sal_bruto;
	    	sal_bruto = ((hor_tra*val_hora)-(perc/100));
	    	salario = (sal_bruto + (n_dependentes*100));
	    }
	}