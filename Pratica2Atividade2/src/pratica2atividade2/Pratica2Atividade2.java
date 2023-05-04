/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pratica2atividade2;

import javax.swing.JOptionPane;

/**
 *
 * @author gabriel
 */
public class Pratica2Atividade2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Atributos
        
        StringBuilder mensagem = new StringBuilder();
        StringBuilder mensagem2 = new StringBuilder();
        StringBuilder mensagem3 = new StringBuilder();
        
        //Calculos e mensagens
        
        int n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o primeiro lado do seu triângulo:" + "\n"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o segundo lado do seu triângulo" + "\n")); 
        int n3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o terceiro lado do seu triângulo" + "\n")); 
        
        //Teste logico
        
        if(n1==n2 && n1==n3){
            
            mensagem.append("Seu triangulo é Equílátero");
            JOptionPane.showMessageDialog(null, mensagem);
            
            }else if(n1==n2 && n1!=n3){
                
                mensagem2.append("Seu triangulo é Isósceles");
                JOptionPane.showMessageDialog(null, mensagem2);
                
            }else {
                
                mensagem3.append("Seu triangulo é Escaleno");
                JOptionPane.showMessageDialog(null, mensagem3);
                
            }
        
        //Saída
        
        System.exit(0);
        
    }
    
}
