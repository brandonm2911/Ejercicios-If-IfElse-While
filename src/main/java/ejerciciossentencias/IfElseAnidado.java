package ejerciciossentencias;

import java.util.Scanner;


public class IfElseAnidado {
    
 public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int Calificacionestudiante ;
        Calificacionestudiante = sc.nextInt ( );
        
        if (Calificacionestudiante >= 90 )
            System.out.println("A");
        
        else
            if (Calificacionestudiante >= 80 )
                System.out.println("B");
        
        else
            if (Calificacionestudiante >= 70 )
                System.out.println("C");
        
        else
            if (Calificacionestudiante >= 60 )
                System.out.println("D");
        
        else
                System.out.println("F");
    
            
            }
 }
