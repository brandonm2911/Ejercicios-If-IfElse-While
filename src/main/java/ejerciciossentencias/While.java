package ejerciciossentencias;

import java.util.Scanner;


public class While {
    
public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int Producto = 3 ;
        Producto = sc.nextInt ( );
        
        
        while (Producto <= 100)
            Producto = 3 * Producto;
            
    }

}