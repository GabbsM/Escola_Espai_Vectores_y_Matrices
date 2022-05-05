import java.util.ArrayList;
import java.util.Scanner;
//Problema 4
//Escribe un programa que dados dos vectores de componentes reales y longitud N, calcule el
//producto escalar. Recordad que el producto escalar de (x1, x2, xn) y (y1, y2,..., yn) es x1y1+
//x2y2+...+ xnyn (suma de los productos de las componentes).
//Notas: primero pedir los valores de las componentes del primer vector y después las del
//segundo vector. Las componentes serán introducidas de manera ordenada.
//Reflexionad sobre la necesidad de utilizar vectores para resolver este problema. Si no se nos
//pidiera que primero se obtuvieran las componentes del primer vector y después las del
//segundo, y lo pudiésemos hacer de otra manera, ¿sería necesario utilizar tablas?

public class Problema4 {

    public static void main(String[] args) {

        //Declaramos las listas y la variable n
        ArrayList<Integer> array1 = new ArrayList<>();
        ArrayList<Integer> array2 = new ArrayList<>();
        int n,productoEscalar;

        //Preguntamos cuantos valores tendran nuestras listas
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuanto valores tendran los arrays?: ");
        n= sc.nextInt();

        //Completamos array 1
        System.out.println("Valores de array 1: ");
        for (int i = 1; i < n ; i++) {
            System.out.println("Indica valor " + i + ":");
            int valor = sc.nextInt();
            array1.add(valor);
        }

        //Completamos array 2
        System.out.println("Valores de array 2: " );
        for (int i = 1; i < n ; i++) {
            System.out.println("Indica valor " + i+ ":");
            int valor = sc.nextInt();
            array2.add(valor);


        }
        //Comprobamos que los arrays se han llenado correctamente
        System.out.println(array1);
        System.out.println(array2);
        System.out.println();

       // Calculo de producto escalar:

         // multiplicamos los valores de array1
         int res1 = array1.stream().mapToInt(x -> x).reduce(1,Math::multiplyExact);
         System.out.println("El resultado de la multiplicacion es: ");
         System.out.println(res1);

         // Sumamos los valores de array2
         int res2 = array2.stream().reduce(0,Integer::sum);
         System.out.println("El resultado de la suma es: ");
         System.out.println(res2);


         // Sumamos ambos valores y el resultado es el producto escalar

         productoEscalar = res1+res2;
         System.out.println("El producto escalar es: ");
         System.out.println(productoEscalar);




    }
}
