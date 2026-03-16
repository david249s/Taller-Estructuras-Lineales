package matrices;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio15 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Random azar = new Random();
 
        System.out.println("Ingrese las filas: ");
        int numFilas = scanner.nextInt();

        System.out.println("Ingrese las columnas:");
        int numColum = scanner.nextInt();

        int[][] matriz = new int[numFilas][numColum];

        for(int i=0;i<numFilas;i++)
            for(int j=0;j<numColum;j++)
                matriz[i][j]=azar.nextInt(50);
        if(numFilas >1){
        int[] temp = matriz[0];
        matriz[0]=matriz[1];
        matriz[1]=temp;
        }
        for(int i=0;i<numFilas;i++){

            for(int j=0;j<numColum;j++)
                System.out.print(matriz[i][j]+" ");
            System.out.println();
        }
    }
}
