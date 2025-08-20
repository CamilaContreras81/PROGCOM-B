import java.util.*;  
import java.lang.*;  
import java.io.*;  

public class Main {
    public static void main(String[] args) {
        
        int numero = 5;
        
        //operador ternario
        String mensaje = (numero > 0) ? "El número es positivo" : "El número no es positivo";
        System.out.println(mensaje);
        
        //if else
        String mensaje2 = "";
        if (numero > 0) {
            mensaje2 = "El número es positivo";
        } else {
            mensaje2 = "El número no es positivo";
        }
        System.out.println(mensaje2);
        
        //if else if 
        String mensaje3 = "";
        if (numero > 0) {
            mensaje3 = "El número es positivo";
        } else if (numero <= 0) {
            mensaje3 = "El número no es positivo";
        }
        System.out.println(mensaje3);
        
        //switch
        switch (Integer.signum(numero)) {
            case 1: 
                System.out.println("El número es positivo");
                break;
            default:
                System.out.println("El número no es positivo");
                break;
        }
    }
}
