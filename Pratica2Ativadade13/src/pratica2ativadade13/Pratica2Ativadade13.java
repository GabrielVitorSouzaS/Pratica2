/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pratica2ativadade13;
import javax.swing.JOptionPane;
/**
 *
 * @author gabriel
 */
public class Pratica2Ativadade13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StringBuilder mensagem = new StringBuilder();
     
        int diarias, calculo,apt;
        
        
        apt = Integer.parseInt(JOptionPane.showInputDialog("Qual apartamento voce esta usando:\n 1)Apartamento simples\n2)Apartamento duplo"));
        diarias = Integer.parseInt(JOptionPane.showInputDialog("Qual o numero de diarias"));

if(apt==1){
        
        if(diarias <10){
  
    calculo = diarias *100;
    mensagem.append("O total gasto e R$:").append(calculo);
    JOptionPane.showMessageDialog(null, mensagem);
    System.exit(0);
    
}else if(diarias >=10 && diarias <16){
  
    calculo= diarias *90;
        mensagem.append("O total gasto e R$:").append(calculo);
    JOptionPane.showMessageDialog(null, mensagem);
    System.exit(0);

}else if(diarias >15){
    
    calculo = diarias*80;
        mensagem.append("O total gasto e R$:").append(calculo);
    JOptionPane.showMessageDialog(null, mensagem);
    System.exit(0);
}

}else if(apt==2){
    
        if(diarias <10){
  
    calculo = diarias *140;
    mensagem.append("O total gasto e: R$:").append(calculo);
    JOptionPane.showMessageDialog(null, mensagem);
    System.exit(0);
    
}else if(diarias >=10 && diarias <16){
  
    calculo= diarias *120;
        mensagem.append("O total gasto e R$:").append(calculo);
    JOptionPane.showMessageDialog(null, mensagem);
    System.exit(0);

}else if(diarias >15){
    
    calculo = diarias*100;
        mensagem.append("O total gasto e: R$:").append(calculo);
    JOptionPane.showMessageDialog(null, mensagem);
    System.exit(0);
}
    
    
}else {
        mensagem.append("Insira um apt valido");
    JOptionPane.showMessageDialog(null, mensagem);
    System.exit(0);    
    
}
    
    
    }
    
}
