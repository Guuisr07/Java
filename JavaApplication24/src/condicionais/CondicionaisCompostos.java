/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionais;

import java.util.Scanner;

/**
 *
 * @author Guilherme
 */
public class CondicionaisCompostos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in); 
        System.out.print("Digite o ano do seu nascimento:");
        int nasc = teclado.nextInt(); 
        int idade = 2019 - nasc; 
        if (idade>=18){
            System.out.println("Maior de Idade");
        } else { 
            System.out.println("Menor de idade");
        }
    }
    
}
