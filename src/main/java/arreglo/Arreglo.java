/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglo;

/**
 *
 * @author AN7
 */
public class Arreglo {
    
    public static void main(String[] args) {
        
        int[] numeros = new int[6];
        
        numeros[0]= 12;
        numeros[1]= 13;
        numeros[2]= 17;
        numeros[3]= 14;
        numeros[4]= 17;
        numeros[5]= 19;
        
        
      //  System.out.println("El numeros de mi arreglo es:"+numeros[0]);
        
      //El arreglo siempre va de la mano con los bucles
      
      //numeros.length--puedes utilizar tambien
      
        for (int i = 0; i < 5; i++) {
            
            System.out.println("El numeros de mi arreglo es:"+numeros[i]);
            
        }
        
        
    }
    
}
