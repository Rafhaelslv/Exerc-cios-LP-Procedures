/*Receba o preço atual e a média mensal de um produto. Calcule e mostre o 
novo preço sabendo que:
Venda Mensal Preço Atual Preço Novo
< 500 < 30 + 10%
>= 500 e < 1000 >= 30 e < 80 +15%
>= 1000 >= 80 - 5%
Obs.: para outras condições, preço novo será igual ao preço atual
*/


import javax.swing.JOptionPane;
public class Ex_28 {
	static double pa, mm, pn;
	public static void main(String args[]) {
	pa = Double.parseDouble(JOptionPane.showInputDialog("Digite o preco atual"));
	mm = Double.parseDouble(JOptionPane.showInputDialog("Digite a media mensal"));
	ProcedurePrecoNV();
	System.out.println("Preço novo = "+pn);
	}
	
	static void ProcedurePrecoNV() {
		double vm;
		vm = (mm*30);
		if((vm < 500) && (pa < 30)){
			pn = (pa+(pa*0.1));
		}else {
			if((vm >= 500 && vm < 1000) && (pa < 30)){
				pn = (pa+(pa*0.15));
			}else {
				if((vm >= 1000) && (pa >= 80)){
					pn = (pa-(pa*0.05));
				}else {
					pn = pa;
				}
			}	
		}
	}
}

