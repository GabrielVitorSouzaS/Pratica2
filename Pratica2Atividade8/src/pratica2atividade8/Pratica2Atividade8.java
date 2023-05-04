/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pratica2atividade8;
import javax.swing.JOptionPane;


/**
 *
 * @author gabriel
 */
public class Pratica2Atividade8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        StringBuilder mensagem = new StringBuilder();
        
        int n1, cond;
        
        do{ 
            
            n1 = Integer.parseInt(JOptionPane.showInputDialog("Insira um codigo de 1 a 5 para pesquisarmos um produto"));
            if(n1==1){
                mensagem.append("\n\nCodigo     Produto     Valor\n       1       Sapato      R$99,99");
                JOptionPane.showMessageDialog(null, mensagem);     
                
            }else  if(n1==2){
                mensagem.append("\n\nCodigo     Produto     Valor\n       2       Bolsa      R$103,89");
                JOptionPane.showMessageDialog(null, mensagem);   
                
            }else  if(n1==3){
                mensagem.append("\n\nCodigo     Produto     Valor\n       3       Camisa      R$49,98");
                JOptionPane.showMessageDialog(null, mensagem);
                
            }else  if(n1==4){
                mensagem.append("\n\nCodigo     Produto     Valor\n       4       Calça      R$89,72");
                JOptionPane.showMessageDialog(null, mensagem);   
                
            }else  if(n1==5){
                mensagem.append("\n\nCodigo     Produto     Valor\n       5       BLusa      R$97,35");
                JOptionPane.showMessageDialog(null, mensagem);
                
            }else if(n1>5){
            mensagem.append("\nPor favor insira um numero dentre 1 e 5");
                JOptionPane.showMessageDialog(null, mensagem); 
            }
            
            cond = Integer.parseInt(JOptionPane.showInputDialog("Voce quer pesquisar mais um produto?\n 1) SIm 2) Nao"));
        }while(cond == 1);
     
    
    }

}
