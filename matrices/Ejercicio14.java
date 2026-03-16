package matrices;

public class Ejercicio14 {
    
    public static void main(String[] args) {
        
        int[][] matriz = {
            {4,8,22},
            {0,5,5}
        };

        int[][] transpuesta = new int[3][2];

        for(int i=0;i<2;i++)
            for(int j=0;j<3;j++)
                transpuesta[j][i]=matriz[i][j];
        System.out.println("Transpuesta:");
        for(int i=0;i<3;i++){

            for(int j=0;j<2;j++)
                System.out.print(transpuesta[i][j]+" ");
            System.out.println();
        }
    }
}
