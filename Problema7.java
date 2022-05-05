import java.util.ArrayList;
import java.util.Arrays;

public class Problema7 {
    //Problema 7
    //Escribe un programa que dado un vector de enteros totalmente lleno (se puede consultar su
    //atributo length) calcule la suma de las componentes que son estrictamente superiores a la
    //última (que ocupa la posición length-1)

    public static void main(String[] args) {

       int[] vector = {82,56,76,3,12,54};
       int suma = 0;

        for (int i = 0; i < vector.length ; i++) {
            if (vector[i] > vector.length-1){
                suma+=vector[i];
            }
        }
        System.out.println("El resultado es: ");
        System.out.println(suma);


    }
}
