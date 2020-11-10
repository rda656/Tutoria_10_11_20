package Utilidades;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Clase Entrada-Salida que se encarga de realizar lecturas desde teclado y mostrar los datos por pantalla.
 * @author Antonio Ramos
 * @version 1.0
 */
public class ES {

    /**
     * Método que se encarga de realizar la lectura de un número entero desde teclado.
     * @return el valor entero leído desde teclado.
     */
    public static int leerEntero() {
        Scanner teclado = new Scanner(System.in);
                
        do{
            try {
                return teclado.nextInt();
            }
            catch(InputMismatchException e){
                System.err.println("Error. No ha introducido un número entero");
                System.out.print("Introduzca un nuevo valor: ");
                teclado.next();
            }
        }while(true);
    }
    
    /**
     * Método que se encarga de realizar la lectura de un número entero desde teclado.
     * @param mensaje texto que se quiere mostrar por pantalla.
     * @return el valor entero leído desde teclado.
     */
    public static int leerEntero(String mensaje) {
        System.out.print(mensaje);
        //int n = leerEntero();
        //return n;
        return leerEntero();
    }
    
    public static int leerEntero(int minimo,int maximo){
        int numero;
        do{
            numero = leerEntero();
            if(numero < minimo || numero > maximo)
                System.out.format("Error. El número debe estar comprendido entre %d y %d (ambos inclusive). Introduzca nuevamente un valor: ", minimo, maximo);
        }while(numero < minimo || numero > maximo);
        
        return numero;
    }
    
    public static int leerEntero(int minimo,int maximo, String mensaje){
        System.out.print(mensaje);
        return leerEntero(minimo, maximo);
    }
    
    public static void escribir(String mensaje){
        System.out.print(mensaje);
    }
}
