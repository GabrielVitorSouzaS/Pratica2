/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pratica2atividade6;

import javax.swing.JOptionPane;

/**
 *
 * @author gabriel
 */
public class Pratica2Atividade6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StringBuilder mensagem = new StringBuilder();
        
        int a, b, c, c1, c2;
        
        a = Integer.parseInt(JOptionPane.showInputDialog("Insira o numero de A"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Insira o numero de B")); 
        c = Integer.parseInt(JOptionPane.showInputDialog("Insira o numero de C"));
      
        if(b-c <a && a< b+c && a-c < b && b<a+c && a-b <c && c <a+b){
            mensagem.append("Os tres lados informados podem sim ser lados de um triangulo");
            JOptionPane.showMessageDialog(null, mensagem);
            System.exit(0);
        }else {
             mensagem.append("Os tres lados informados NAO podem sim ser lados de um triangulo");
            JOptionPane.showMessageDialog(null, mensagem);
            System.exit(0);
            
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
