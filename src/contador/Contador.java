/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contador;
import java.util.Scanner;
public class Contador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        double[] estaturas = new double[25];

        // Capturar 25 estaturas
        for (int i = 0; i < estaturas.length; i++) {
            System.out.print("Ingrese la estatura del alumno " + (i + 1) + ": ");
            estaturas[i] = scanner.nextDouble();
        }

        // Crear una instancia de la clase AnalizadorEstaturas y pasar el arreglo
        analizadorestaturas  analizador = new analizadorestaturas (estaturas);

        // Determinar y mostrar la estatura mayor y menor
        double mayor = analizador.determinarEstaturaMayor();
        double menor = analizador.determinarEstaturaMenor();

        System.out.println("La estatura mayor es: " + mayor);
        System.out.println("La estatura menor es: " + menor);

    }
    
}
