/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pratica2atividade7;
import javax.swing.JOptionPane;

/**
 *
 * @author gabriel
 */
public class Pratica2Atividade7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    StringBuilder mensagem = new StringBuilder();
    
 double a, b, c, delta, calculo, x1, x2, raiz;
 
 a = Integer.parseInt(JOptionPane.showInputDialog("Qual o valor de A?"));
 b = Integer.parseInt(JOptionPane.showInputDialog("Qual o valor de B?"));    
 c = Integer.parseInt(JOptionPane.showInputDialog("Qual o valor de C?"));       

 delta = (b*b) - (4*(a*c));
 
if(a== 0 && a==b && b==c){

    mensagem.append("Igualdade confirmada 0 = 0");    
JOptionPane.showMessageDialog(null, mensagem);
System.exit(0);

}  else if(a==0 && a==b && b!=c){
    
    mensagem.append("Coeficientes informador incorretamentes");    
JOptionPane.showMessageDialog(null, mensagem);
System.exit(0);

}  else if(a==0 && a!=b){
    
    calculo = -c /b;
    mensagem.append("Esta e uma equaço do primeiro grau !\n(x = ").append(c).append(" / ").append(b).append(")\n E o valor da raiz : ").append(calculo);    
JOptionPane.showMessageDialog(null, mensagem);
System.exit(0);

} else if(a!=0){
   
    mensagem.append("Esta  uma equaço de segundo grau");    
JOptionPane.showMessageDialog(null, mensagem);
    if(delta<0){
        
       mensagem.append("\nEsta  equaçao nao possui raizes\n Delta: ").append(delta);    
JOptionPane.showMessageDialog(null, mensagem);  
System.exit(0);

    } else if(delta ==0){
        
        calculo =(-b)/(2*a);
        mensagem.append("Esta  equaçao possui duas raizes reais  iguais\n(x = ").append(b).append( " /2 *").append(a).append(")\nE o resultado e: ").append(calculo);    
JOptionPane.showMessageDialog(null, mensagem);  
System.exit(0);

    } else if(delta >0){
        
        calculo = (b*b) - (4*(a*c));
        raiz = Math.sqrt(calculo);
        x1 = (-b + raiz) / (2*a);
        x2 = (-b -raiz) / (2*a);
        mensagem.append("Esta  equaçao no possui duas raizes reais diferentes\nDelta: ").append(delta).append("\nx1: ").append(x1).append("\nx2: ").append(x2);    
JOptionPane.showMessageDialog(null, mensagem); 
System.exit(0);

    }
System.exit(0);
}
    
    }
    
}
