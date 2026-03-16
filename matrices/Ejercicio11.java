package matrices;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        Random azar = new Random();
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[4][4];

        for(int i=0;i<4;i++)
            for(int j=0;j<4;j++)
                matriz[i][j]=azar.nextInt(50);
        System.out.println("Buscar: ");
        int numEntero = scanner.nextInt();
        boolean encontrado=false;
        for(int i=0;i<4;i++){

            for(int j=0;j<4;j++){

                if(matriz[i][j]==numEntero){

                    System.out.println("Encontrado en "+i+" , "+j);
                    encontrado=true;
                    break;
                }
            }
            if(encontrado) break;
        }
        if(!encontrado)
            System.out.println("No encontrado");
    }
}
