package arreglos;

public class Ejercicio2 {
    
    public static void main(String[] args) {
        
        int[] numPares = new int[100];
        for(int i = 0; i < 100; i++){
            
            numPares[i] = (i+1) * 2;
        }
        for(int p : numPares){
            
            System.out.print(p + " ");
        }
        for(int n = 0; n < numPares.length; n++){

            if(n % 10 == 0){
                System.out.print("\nLinea " + (n/10 + 1)+ ": ");
            }
            System.out.print(numPares[n] + " ");
        }
    }
}
