import java.util.ArrayList;

public class Problema5 {
    //Problema 5
    //Escribe un programa que dados dos vectores de componentes reales, de la misma longitud,
    //calcule su producto escalar. Asumid que ambos vectores están completamente llenos y que,
    //por lo tanto, se puede consultar su atributo length para conocer la longitud.

    public static void main(String[] args) {

        ArrayList<Integer> lista1 = new ArrayList<>();
        ArrayList<Integer> lista2 = new ArrayList<>();
        int n = 5,productoEscalar;

        // Llenamos los arrays de forma automatica con numeros random
        for (int i = 0; i < n ; i++) {
            int valor = (int)Math.random()*101;
            lista1.add(valor);

        }

        for (int i = 0; i < n ; i++) {
            int valor = (int)Math.random()*101;
            lista2.add(valor);

        }

        // multiplicamos los valores de array1
        int res1 = lista1.stream().mapToInt(x -> x).reduce(1,Math::multiplyExact);
        System.out.println("El resultado de la multiplicacion es: ");
        System.out.println(res1);

        // Sumamos los valores de array2
        int res2 = lista2.stream().reduce(0,Integer::sum);
        System.out.println("El resultado de la suma es: ");
        System.out.println(res2);

        // Sumamos ambos valores y el resultado es el producto escalar

        productoEscalar = res1+res2;
        System.out.println("El producto escalar es: ");
        System.out.println(productoEscalar);


    }
}
