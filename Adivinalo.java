
package PracticandoCasa;

import java.util.Random;
import java.util.Scanner;

public class Adivinalo {
    
    public static void main(String[] args) {
        
        //clase random para acceder a metodos que generen numeros aleatorios
        Random adivinar = new Random();
        
        //Scanner
        Scanner sc = new Scanner(System.in);
        
        //variable vidas
        int vidas = 3;
        
        //mi numero
        int numero;
        
        while (vidas!=0){
            
            //metodo nextInt(limite maximo) = retornara de 0 a 10
            //ESTRUCTURA: variable que almacene nuemro aleatorio = instancia Random.nextInt(limite maximo de numero posible)
            int aleatorio = adivinar.nextInt(11);
            
            System.out.println("ELIGE UN NUMERO DE 0 A 20: ");
            numero = sc.nextInt();
            
            //contador
            vidas--;
            
            if (aleatorio == numero){
                
                System.out.println("Numero escogido: " + numero);
                System.out.println("Numero de PC: " + aleatorio);
                break;
            } else {
                System.out.println("Sigue intentando: ");
                System.out.println("Numero escogido: " + numero);
                System.out.println("Numero de PC: " + aleatorio);
            }
            
            
        }
        
       
        
    }
}
