
package encuentro_4;

import java.util.Scanner;

public class Encuentro_4 {

    public static void main(String[] args) {
        
        // EJERCICIO 1
        
        /*
        
        Scanner lectura = new Scanner (System.in);
        
        System.out.println("Ingrese un numero: ");
        
        int numero = lectura.nextInt();
        
        if ( numero % 2 == 0 ) {
        
            System.out.println("El numero ingresado es par");
            
        } else {
            
            System.out.println("El numero ingresado es impar");
            
        }
        
        */
        
        // EJERCICIO 2
        
        /*
        
        Scanner lectura = new Scanner (System.in);
        
        System.out.println("Ingrese una frase: ");
        
        String frase = lectura.nextLine();
        
        if ( frase.equalsIgnoreCase("eureka") == true ) {
        
            System.out.println("La frase ingresada es correcta");
            
        } else {
            
            System.out.println("La frase ingresada es incorrecta");
            
        }
        
        */
        
        //EJERCICIO 3
        
        /*
        
        Scanner lectura = new Scanner (System.in);
        
        System.out.println("Ingrese una frase: ");
        
        String frase = lectura.nextLine();
        
        if ( frase.length() == 8 ) {
        
            System.out.println("La frase ingresada es correcta");
            
        } else {
            
            System.out.println("La frase ingresada es incorrecta");
            
        }

        */
        
        //EJERCICIO 4
        
        /*
        
        Scanner lectura = new Scanner (System.in);
        
        System.out.println("Ingrese una frase: ");
        
        String frase = lectura.nextLine();
        
        String letra = "A";
                
        if ( letra.equals(frase.substring(0,1)) == true ) {
        
            System.out.println("La frase ingresada es correcta");
            
        } else {
            
            System.out.println("La frase ingresada es incorrecta");
            
        }

        */
        
        //EJERCICIO 5
        
        /*
        
        Scanner lectura = new Scanner (System.in);
        
        System.out.println("Ingrese un numero limite: ");
        
        int numero = lectura.nextInt();
        
        int suma = 0;
           
        while ( numero >= suma ) {
        
            System.out.println("Ingrese un numero a sumar: ");
        
            int numero1 = lectura.nextInt();
            
            suma = suma + numero1;
            
            System.out.println("La suma parcial es de: " + suma );
            
        }

        */
        
        //EJERCICIO 6
        
        
        
        Scanner lectura = new Scanner (System.in);
        
        int opcion = 0;
        
        System.out.println("Ingrese un numero positivo: ");
        
        float numero1 = lectura.nextFloat();
        
        System.out.println("Ingrese otro numero positivo: ");
        
        float numero2 = lectura.nextFloat();
        
        do {
            
            System.out.println("Menu de opciones: ");
            
            System.out.println("1 - Suma");
            
            System.out.println("2 - Resta");
            
            System.out.println("3 - Multiplicacion");
            
            System.out.println("4 - Division");
            
            System.out.println("5 - Salir");
            
            System.out.println("Ingrese una opcion: ");
            
            opcion = lectura.nextInt();
            
            switch ( opcion ) {
                
                case 1 :
                    
                    float suma = 0;
                    
                    suma = numero1 + numero2;
                    
                    System.out.println("La suma es de: " + suma);
                    
                    break;
                
                case 2 :
                    
                    float resta = 0;
                    
                    resta = numero1 - numero2;
                    
                    System.out.println("La resta es de: " + resta);
                    
                    break;
                
                case 3 :
                    
                    float multiplicacion = 0;
                    
                    multiplicacion = numero1 * numero2;
                    
                    System.out.println("La multiplicacion es de: " + multiplicacion);
                    
                    break;
                    
                case 4 :
                    
                    float division = 0.00f;
                                        
                    division = numero1 / numero2;
                    
                    System.out.println("La division es de: " + division);
                    
                    break;
                    
                case 5 :
                    
                    System.out.println("Esta seguro que desea salir del programa? (S/N): ");
                    
                    do {  
                        
                    String opcion1 = lectura.nextLine();
                                       
                    if ( opcion1.equals("S") == true ) {
                        
                        break;
                        
                    } else if ( opcion1.equals("N") == true ) {
                        
                        opcion = 0;
                        
                    }
                    
                    } while ( opcion != 0 );
            }
            
        } while ( opcion != 5 );
        
        
        
        //EJERCICIO 7 : 
        
        /*
        
        Scanner lectura = new Scanner(System.in);
                
        System.out.println("Ingrese la secuencia de caracteres: ");
        
        String cadena = "";
        
        do {
            
            cadena = lectura.nextLine();
        
        } while ( ( cadena.substring(0,1) == "X" ) && ( cadena.substring(4,5) == "O" ) );
        
        */
        
    }
    
}
