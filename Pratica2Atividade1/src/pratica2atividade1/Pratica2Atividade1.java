/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pratica2atividade1;

import javax.swing.JOptionPane;

/**
 *
 * @author gabriel
 */
public class Pratica2Atividade1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        //Atributos
        
        StringBuilder mensagem = new StringBuilder();
        StringBuilder mensagem2 = new StringBuilder();
        StringBuilder mensagem3 = new StringBuilder();
        
        
        int med;
    
        //Calculos e mensagens
        
        int n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira sua primeira nota:" + "\n"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a segunda nota" + "\n")); 
    
        med = (n1+n2)/2;
        mensagem.append("A média da suas notas é: ").append(med).append("\n");
        JOptionPane.showMessageDialog(null, mensagem);
        
        //Teste Lógico
        
        if(med>=7){
            mensagem2.append("Você foi aprovado \n");
            JOptionPane.showMessageDialog(null, mensagem2);
        }else {
        mensagem3.append("Você foi Reprovado");
        JOptionPane.showMessageDialog(null, mensagem3);
        }
        
        //Saída
        
    System.exit(0);
        
    }
    
}
