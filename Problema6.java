import java.util.Scanner;

public class Problema6  {
    //Problema 6
    //Escribe un programa que dado un vector de números reales (se puede consultar su atributo
    //length) y un valor real v, determine si este valor aparece o no en el vector.

    public static void main(String[] args) {

        int[] array = {5,86,23,41,81};
        Scanner sc = new Scanner(System.in);
        int valor;
        boolean ok = false;


        System.out.println("Indica valor: ");
        valor = sc.nextInt();

        for (int i = 0; i < array.length ; i++) {
           if(valor == array[i]){
                 ok=true;
             }
           }

        if(ok){
            System.out.println("El valor indicado esta en la lista");
        }else {
            System.out.println("El valor indicado NO esta en la lista");
        }
    }
}
