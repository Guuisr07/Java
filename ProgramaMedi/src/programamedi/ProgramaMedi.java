/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programamedi;

import java.util.Scanner;

/**
 *
 * @author Guilherme
 */
public class ProgramaMedi {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in); //utilizando um "Scanf"
        System.out.print("Digite a primeira nota:");
        float n1 = teclado.nextFloat(); //Para receber os dados em N1
        System.out.print("Digite a segunda nota:");
        float n2 = teclado.nextFloat(); //Para recebr os dados em N2
        float m = (n1+n2)/2; 
        System.out.println("Sua média foi:" +m);
        if (m>9){
            System.out.println("Parabens pela média "+m);
        };
       
        
        
    }
    
}
