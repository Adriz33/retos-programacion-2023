/*
 * Escribe un programa que reciba un texto y transforme lenguaje natural a
 * "lenguaje hacker" (conocido realmente como "leet" o "1337"). Este lenguaje
 *  se caracteriza por sustituir caracteres alfanuméricos.
 * - Utiliza esta tabla (https://www.gamehouse.com/blog/leet-speak-cheat-sheet/) 
 *   con el alfabeto y los números en "leet".
 *   (Usa la primera opción de cada transformación. Por ejemplo "4" para la "a")
 */

import java.util.HashMap;
import java.util.Scanner;

public class lenguajehacker {

    public static void main(String[]args){

        HashMap<Character, String> letra = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Traduce aquí: ");

        String reto = sc.nextLine();

      // Letras
        letra.put('a', "4"); letra.put('b', "I3"); letra.put('c', "[");
        letra.put('d', ")"); letra.put('e', "3"); letra.put('f', "|=");
        letra.put('g', "&"); letra.put('h', "#"); letra.put('i', "1");
        letra.put('j', ",_|"); letra.put('k', ">|"); letra.put('l', "1");
        letra.put('m', "/\\/\\"); letra.put('n', "^/");
        letra.put('o', "0");
        letra.put('p', "|*"); letra.put('q', "(_,)"); 
        letra.put('r', "I2");
        letra.put('s', "5"); letra.put('t', "7"); letra.put('u', "(_)");
        letra.put('v', "\\/"); letra.put('w', "\\/\\/");
        letra.put('x', "><"); letra.put('y', "j"); letra.put('z', "2");
   
        // Números
        letra.put('0', "o"); letra.put('1', "L"); letra.put('2', "R");
        letra.put('3', "E"); letra.put('4', "A"); letra.put('5', "S");
        letra.put('6', "b"); letra.put('7', "T"); letra.put('8', "B");
        letra.put('9', "g");
        
        reto = reto.toLowerCase();

        System.out.print("Tu texto traducido: "); 
        
        for(int i = 0; i < reto.length(); i++ ){

            char caracter = reto.charAt(i);
            String traduccion = letra.get(caracter);
            
            if(traduccion == null){
                System.out.print(caracter);
            }else System.out.print(traduccion);

        }

        System.out.println();
        
        sc.close();
    }
    
}
