/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pratica2atividade3;

import javax.swing.JOptionPane;



/**
 *
 * @author gabriel
 */
public class Pratica2Atividade3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    //Atributos
        
    StringBuilder mensagem = new StringBuilder();
        StringBuilder mensagemreprovado = new StringBuilder();
        StringBuilder mensagemaprovado = new StringBuilder();
        StringBuilder mensagemexame = new StringBuilder();
        StringBuilder mediamsg = new StringBuilder();
        
        
        int media;
    
        //Calculos e mensagens
        
        int n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira sua primeira nota \nentre 0 e 10:" + "\n"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a segunda nota" + "\n")); 
        int n3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira sua terceira nota:" + "\n"));
                                                                
                
                //Calculo das notas maiores que 10
                
            if(n1>10 | n2>10 | n3> 10){
        
        mensagem.append("Nota invalida, digite um numero de 0 a 10\n ");
        JOptionPane.showMessageDialog(null, mensagem);
        System.exit(0);
        
        
        // Teste logico da condição
        
                }else{
                
                    media = (n1+n2+n3)/3; 
                    mediamsg.append(" Sua média é: ").append(media).append("\n");
                    JOptionPane.showMessageDialog(null, mediamsg);
                
                        if(media<3){

                            mensagemreprovado.append(" Você esta REPROVADO");
                            JOptionPane.showMessageDialog(null, mensagemreprovado);
                            System.exit(0);

                                }else if(media>=3 & media<7){

                                    mensagemexame.append(" Você esta em EXAME");
                                    JOptionPane.showMessageDialog(null, mensagemexame);
                                    System.exit(0);

                                       }else 

                                           mensagemaprovado.append(" Você esta APROVADO");
                                           JOptionPane.showMessageDialog(null, mensagemaprovado);
                                           System.exit(0);
                
            }
    }    
}
