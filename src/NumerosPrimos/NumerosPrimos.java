package NumerosPrimos;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author
 */
public class NumerosPrimos {

    /**
     * @param args the command line arguments
     */
    //Codificado por: sAfOrAs
    //LIstar los numeros según el numero de digitos indicado
    //Considero solo hasta numeros menores a 100000 (5 digitos), 
    //por el hecho de k buscar numeros primos a partir de 6 digitos, el proceso se hace muy lento.
    public static boolean esPrimo = false;
    static Scanner sc1 = new Scanner(System.in);

    public static void main(String arg[]) {
        int numDigitos = 0;
        int ndigitos = 0;
        numDigitos = pedirNumDigitos();
        if (numDigitos <= 0) {
            System.out.println("Ingrese como parámetro, un numero de digitos correcto (mayor que 0): ");
        }

        for (int contadorNumeros = 1; contadorNumeros <= 99999; contadorNumeros++) {
            int divisionEntera = contadorNumeros;

            int contador = 0;

            while (divisionEntera != 0) {
                divisionEntera = divisionEntera / 10;
                contador++;
            }
            ndigitos = contador;

            if (ndigitos == numDigitos) {
                if (contadorNumeros < 4) {
                    esPrimo = true;
                } else if (contadorNumeros % 2 == 0) {
                    esPrimo = false;
                } else {
                    int contador1 = 0;
                    int i1 = 1;
                    int limite = (contadorNumeros - 1) / 2;
                    if (limite % 2 == 0) {
                        limite--;
                    }

                    while (i1 <= limite) {
                        if (contadorNumeros % i1 == 0) {
                            contador1++;
                        }
                        i1 += 2;
                        if (contador1 == 2) {
                            i1 = limite + 1;
                        }
                    }

                    if (contador1 == 1) {
                        esPrimo = true;
                    }
                }

                if (esPrimo == true) {
                    System.out.println(contadorNumeros);
                }
            }
        }
    }

    public static int pedirNumDigitos() {
        int digit = 0;
        System.out.println("Introduce el numero de digitos");
        while (digit <= 0 || digit > 5) {
            
            try {
                
                digit = sc1.nextInt();
            } catch (Exception e) {
                
                
            System.out.println("Introduce un numero");                    
            while (sc1.hasNextInt()==false){
            
            sc1.next();
            }
            }
            
            
            
        
        }
        System.out.println("???");
        return digit;
    }

}
