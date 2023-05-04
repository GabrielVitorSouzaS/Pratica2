/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratica2atividade2;

import java.util.Scanner;

/**
 *
 * @author gabriel
 */
public class Atividade02Sc {
    
    public static void Sc(String[] args) {
    
    Scanner leitor = new Scanner(System.in);
    int n1, n2, n3;
    
 System.out.print("Escreva o primeiro lado do trinagulo\n");
 n1 = leitor.nextInt();
 
 System.out.print("Escreva o primeiro lado do trinagulo\n");
 n2 = leitor.nextInt();
 
 System.out.print("Escreva o primeiro lado do trinagulo\n");
 n3 = leitor.nextInt();
 
   if(n1==n2 && n1==n3){
            
           System.out.println("Seu triangulo é Equílátero");

            }else if(n1==n2 && n1!=n3){
                
              System.out.println("Seu triangulo é Isósceles");

            }else {
                
               System.out.println("Seu triangulo é Escaleno");
                
            }
 System.exit(0);
}
    
    }
