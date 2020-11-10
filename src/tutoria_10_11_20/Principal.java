// https://github.com/rda656/Tutoria_03_10_20
package tutoria_10_11_20;

import java.util.Scanner;

/**
 * 
 * @author Antonio Ramos
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int opcion;
        do{
            System.out.print("Menú:\n"
                    + "-----\n"
                    + "1. Tabla de multiplicar.\n"
                    + "2. Adivina el número.\n"
                    + "0. Salir del programa.\n"
                    + "Elija una opción: ");
            opcion = teclado.nextInt();
            switch(opcion){
                case 0:
                    System.out.println("Saliendo....");
                    break;
                case 1:
                    /*System.out.print("Introduzca un número entre 0 y 10: ");
                    int n = ES.leerEntero(0, 10);
                    tablaMultiplicar(n);
                    */
                    /*
                    System.out.print("Introduzca un número entre 0 y 10: ");
                    tablaMultiplicar(ES.leerEntero(0, 10));
                    */
                    tablaMultiplicar(ES.leerEntero(0, 10, "Introduzca un número entre 0 y 10: "));
                    break;
                case 2:
                    adivinarNumero();
                    break;
                default:
                    System.err.println("Error. La opción introducida no es válida.");
                    break;
            }
        }while(opcion != 0);
    }

    public static void tablaMultiplicar(int numero){
        int resultado;
                
        System.out.println("Tabla de multiplicar.");
        System.out.println("---------------------");   
        System.out.println("La tabla de multiplicar del " + numero + " es la siguiente:");
       
        for(int i = 0; i <= 10; i++){ // i++, i = i+1
            resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }
    
    public static void adivinarNumero(){
        int numeroBuscado, numeroLeido;
        
        // Vamos a crear un número aleatorio entre 0 y 100
        numeroBuscado = (int) (Math.random()*100);
        
        System.out.println("Adivinar un número.");
        System.out.println("-------------------");
        System.out.println("Adivine el número secreto. Está comprendido entre 0 y 100.");
        do{
            /*
            System.out.print("Introduzca un número: ");
            numeroLeido = ES.leerEntero();
            */
            numeroLeido = ES.leerEntero("Introduzca un número: ");
            
            if(numeroLeido > numeroBuscado)
                System.out.println("El número que tiene que adivinar es más pequeño.");
            else if(numeroLeido < numeroBuscado)
                System.out.println("El número que tiene que adivinar es más grande.");
        }while (numeroLeido != numeroBuscado);
        System.out.println("¡Muy bien! Ha encontrado el número.");
    }
}
