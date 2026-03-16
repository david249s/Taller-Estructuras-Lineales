package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio7 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();
        for (int i = 2; i <= 40; i += 2) lista.add(i);
        
        System.out.println("Inicial: " + lista);
        
        System.out.print("Ingrese numero para insertar ordenadamente: ");
        int nuevo = scanner.nextInt();
        int pos = 0;
        while (pos < lista.size() && lista.get(pos) < nuevo) pos++;
        lista.add(pos, nuevo);
        System.out.println("Tras insertar: " + lista);
        
        System.out.print("Ingrese numero para borrar: ");
        int borrar = scanner.nextInt();
        lista.remove(Integer.valueOf(borrar));
        System.out.println("Tras borrar: " + lista);     
    }
}
