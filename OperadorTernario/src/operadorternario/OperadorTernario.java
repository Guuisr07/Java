/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadorternario;

/**
 *
 * @author Guilherme
 */
public class OperadorTernario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*int n1, n2, r;
        n1 = 4; 
        n2 = 8; 
        r = (n1>n2)?0:1; // Se "N1" for maior que "N2", então R recebe ou 0 ou 1 (Se o resultado de n1>n2 for true recebe 1, senão recebe 0)
        System.out.println(r);*/
        
        int n1, n2, r;
        n1 = 14; 
        n2 = 10; 
        r = (n1>n2)? n1+n2:n1-n2; 
        System.out.println(r);
        
    }
    
}



