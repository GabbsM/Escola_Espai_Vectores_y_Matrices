import java.util.ArrayList;
import java.util.Arrays;

public class Problema8 {
    //Problema 8
    //Escribe un programa que dados dos vectores de enteros de la misma longitud y totalmente
    //llenos determine si son o no idénticos.
    public static void main(String[] args) {

        int[] array1 = {67,32,87,22};
        int[] array2 = {67,32,87,22};
        //int[] array2 = {43,88,13,53};

        if (Arrays.equals(array1, array2)) {
            System.out.println("Los arrays son iguales");
        }else {
            System.out.println("Los arrays son diferentes");
        }

        }

    }
