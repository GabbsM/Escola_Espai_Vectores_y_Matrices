public class Problema12 {
    //Problema 12
    //Escribe una función que dada una matriz cuadrada de componentes enteros, y un número
    //entero N que indica la dimensión de la tabla (será NxN) calcule la suma de los valores de la
    //diagonal principal de esta (la diagonal principal es la que va del rincón superior izquierdo al
    //rincón inferior derecho)

    public static void main(String[] args) {

        int[][] matriz = {
                {10, 5, 12},
                {98, 5, 6},
                {8, 4, 6},
        };
        System.out.println();
        System.out.println("La matriz es:");
        imprimirMatriz(matriz);
        int sumaPrincipal = sumarDiagonal(matriz, "p");
        int sumaSecundaria = sumarDiagonal(matriz, "s");
        System.out.printf("La suma de la diagonal principal es %d y la de la secundaria es %d\n", sumaPrincipal, sumaSecundaria);
    }



    static void imprimirMatriz(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                int numActual = matriz[i][j];
                System.out.printf("%5d",numActual);
            }
            System.out.println();
            
        }
    }

    static int sumarDiagonal(int[][] matriz, String diagonal) {
        int suma = 0;
        // Si es la principal
        if (diagonal.equals("p")) {
            int x = 0, y = 0;
            while (x < matriz.length && y < matriz[0].length) {
                suma += matriz[y][x];
                x++;
                y++;
            }
        } else {
            int x = 0, y = matriz.length - 1;
            while (x < matriz.length && y >= 0) {
                suma += matriz[y][x];
                x++;
                y--;
            }
        }
        return suma;
    }
}
