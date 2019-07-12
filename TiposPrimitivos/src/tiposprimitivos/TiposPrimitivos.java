/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposprimitivos;

import java.util.Scanner;/*Importação do scanner*/

/**
 *
 * @author Guilherme
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in); /* Para escanear como se fosse um Scanf*/
        System.out.print("Digite o nome do aluno:");
        String nome = teclado.nextLine(); /* Para usar a entrada de dados tipo String*/
        
        System.out.print("Digite a nota de aluno:");
        float nota = teclado.nextFloat(); /*Para entrada de dados tipo Float*/
        
        System.out.printf("A nota de %s é %.2f \n",nome ,nota);
    
        int idade = 30; 
        String valor = Integer.toString(idade); /*Convertendo para String um valor inteiro*/
    
    }
    
}
