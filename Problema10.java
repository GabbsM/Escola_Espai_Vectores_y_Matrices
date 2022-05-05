public class Problema10 {
    //Problema 10
    //Escribe una función que dada una matriz cuadrada y de componentes enteros, un número entero
    //N que indica la dimensión de la tabla (será NxN) y un valor entero f, calcula la suma de los
    //valores que componen la f-esima fila de la matriz

    public static void main(String[] args) {

        int[][] matriz = {
                {20, 12, 77},
                {50, 12, 89},
                {10, 44, 15},
        };

        System.out.println("La matriz es: ");
        imprimirMatriz(matriz);
        System.out.println("Suma de filas:");
        sumaFilas(matriz);

    }

    static void imprimirMatriz(int[][] matriz) {
        for (int y = 0; y < matriz.length; y++) {
            for (int x = 0; x < matriz[y].length; x++) {
                System.out.printf("%d ", matriz[y][x]);
            }
            System.out.println();
        }
    }

    static void sumaFilas(int[][] matriz) {
        for (int y = 0; y < matriz.length; y++) {
            int suma = 0;
            for (int x = 0; x < matriz[y].length; x++) {
                System.out.printf("%d ", matriz[y][x]);
                suma += matriz[y][x];
            }
            System.out.printf("= %d\n", suma);
        }
    }
}
