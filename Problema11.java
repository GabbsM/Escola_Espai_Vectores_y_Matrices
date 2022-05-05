public class Problema11 {

    //Problema 11
    //Igual que el problema anterior pero cambiando f por c y calculando los valores que componen la
    //c-esima columna de la matriz

    public static void main(String[] args) {

        int[][] matriz = {
                {20, 12, 77},
                {50, 12, 89},
                {10, 44, 15},
        };

        System.out.println("La matriz es: ");
        imprimirMatriz(matriz);
        System.out.println("Suma de columnas:");
        sumaColumnas(matriz);



    }

    static void imprimirMatriz(int[][] matriz) {
        for (int y = 0; y < matriz.length; y++) {
            for (int x = 0; x < matriz[y].length; x++) {
                System.out.printf("%d ", matriz[y][x]);
            }
            System.out.println();
        }
    }

    static void sumaColumnas(int[][] matriz) {
        // Imprimir la matriz normalmente
        imprimirMatriz(matriz);
        // Debajo de ella imprimir una línea divisora
        for (int x = 0; x < matriz[0].length; x++) {
            System.out.print("___");
        }
        System.out.println();
        // Luego recorrer por columna y sumar
        for (int x = 0; x < matriz[0].length; x++) {
            int suma = 0;
            for (int y = 0; y < matriz.length; y++) {
                suma += matriz[y][x];
            }
            System.out.printf("%d ", suma);
        }
        System.out.println();
    }
}
