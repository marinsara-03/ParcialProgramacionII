/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parcialprogramacionii;
import java.util.Scanner;
/**
 *
 * @author flaka
 */
public class ParcialProgramacionII {

    public static String[] invertirArray(String[] arrayOriginal) {
        String[] arrayInvertido = new String[arrayOriginal.length];
        int j = 0;
        for (int i = arrayOriginal.length - 1; i >= 0; i--) {
            arrayInvertido[j] = arrayOriginal[i];
            j++;
        }
        return arrayInvertido;
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        int tamañoArray = 0;
        
        System.out.println("Ingrese el tamaño del array: ");
        tamañoArray = read.nextInt();
        read.nextLine();
        
        String[] arrayIn = new String [tamañoArray];
        
        for(int i = 0; i < tamañoArray; i++ ){
            System.out.println("Ingrese un numero: " + (i));
            arrayIn[i] = read.nextLine();
        }System.out.println("Arreglo original: ");
        for (String s : arrayIn) {
            System.out.println(s);
        }
        
        String[] invertido = invertirArray(arrayIn);
        
        System.out.println("Arreglo invertido:");
        for (String s : invertido) {
            System.out.println(s);
        }

    }
    
}
