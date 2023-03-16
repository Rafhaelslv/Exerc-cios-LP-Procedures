/*Receba 3 coeficientes A, B, e C de uma equação do 2º grau da fórmula 
AX²+BX+C=0. Verifique e mostre a existência de raízes reais e se caso 
exista, calcule e mostre.
*/

import javax.swing.JOptionPane;
public class Ex_20{
	static int A, B ,C;
	static double Delta,Raiz1,Raiz2;
	public static void main (String args [ ]){
       A = Integer.parseInt(JOptionPane.showInputDialog("Digite o coeficiente A"));
       B = Integer.parseInt(JOptionPane.showInputDialog("Digite o coeficiente B"));
       C = Integer.parseInt(JOptionPane.showInputDialog("Digite o coeficiente C"));
       ProcedureDelta();
       System.out.println("Raiz1 =  "+Raiz1+" Raiz2 = "+Raiz2);
	}
	static void ProcedureDelta() {
       Delta=(Math.pow(B,2))-4*A*C;
       if (Delta<0) 
         {
           System.out.println("Delta Negativo");
          }
       else
       {
           Delta=Math.sqrt(Delta);
           Raiz1=(-B+Delta)/(2*A);
           Raiz2=(-B-Delta)/(2*A);
       }
    } 
} 