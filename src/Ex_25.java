/*Receba a hora de início e de final de um jogo (HH,MM) sabendo que o 
tempo máximo é de 24 horas e pode começar num dia e terminar no outro.
*/
import javax.swing.JOptionPane;
public class Ex_25 {
	static int  horaIni,minutoIni,horaFim,minutoFim,horasDec,minutosDec;  
public static void main (String args [ ]) {
	horaIni = Integer.parseInt(JOptionPane.showInputDialog("Hora inicial"));
    minutoIni = Integer.parseInt(JOptionPane.showInputDialog("Minuto inicial"));
    horaFim = Integer.parseInt(JOptionPane.showInputDialog("Hora final"));
    minutoFim = Integer.parseInt(JOptionPane.showInputDialog("Minuto final"));
    ProcedureJogo();
    System.out.println ("Foram decorridos "+horasDec+" hora(s) e "+minutosDec+" minuto(s)");
}
static void ProcedureJogo() {
   if (horaIni==horaFim)
        if (minutoIni==minutoFim)
        {
            horasDec=24;
            minutosDec = 0;
        } 
        else
            if (minutoIni<minutoFim)
            {
                horasDec=0;
                minutosDec = minutoFim - minutoIni;
            } 
            else
            {
                horasDec=23;
                minutosDec = (60 - minutoIni) + minutoFim;
            }
   else
        if (horaIni<horaFim) {
            horasDec=horaFim-horaIni;
          if (minutoIni==minutoFim)
          {
            minutosDec = 0;
          } 
          else
            if (minutoIni<minutoFim)
            {
                minutosDec = minutoFim - minutoIni;
            } 
            else
            {
                horasDec=horasDec - 1;
                minutosDec = (60 - minutoIni) + minutoFim;
            }
        }
        else
        {    
            horasDec=(24 - horaIni)+horaFim;
            if (minutoIni==minutoFim)
            {
              minutosDec = 0;
            } 
            else
             if (minutoIni<minutoFim)
             {
                minutosDec = minutoFim - minutoIni;
             } 
             else
             {
                horasDec=horasDec - 1;
                minutosDec = (60 - minutoIni) + minutoFim;
             }
        }
   } 
}