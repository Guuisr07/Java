/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoresaritimeticos;

/**
 *
 * @author Guilherme
 */
public class OperadoresAritimeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*int n1 = 3; 
        int n2 = 5; 
        float m = (n1 + n2)/2;
        
        System.out.println("A média é igual a " +m);*/
        
        /*float v = 5.7f;
        int arredondado = (int) Math.floor(v); //floor utilizado para arredondar para baixo  
        System.out.println(arredondado);*/
        
        /*float v = 5.9f;
        int ar = (int) Math.ceil(v); //é usado cel para arredondar para cima
        System.out.println(ar);*/
        
        /*float v = 5.3f;
        int ar = (int) Math.round(v); //É usado round para arredondar aritimeticamente
        System.out.println(ar);*/
        
        
        /*double ale = Math.random(); // Para gerar numeros aleatorios de 0.0 ate 1.0
        System.out.println(ale);*/
        
        double ale = Math.random();
        int n =  (int) ( 5 + ale * (10 -5)); // gerando numero aleatorios de 5 até 10 , sempre que limita o random entre dois numeros deve ser feito essa matematica
        System.out.println(n);
        
        
        
             
        
        
        
        
                
        
        
        
        
        
    }
    
}
