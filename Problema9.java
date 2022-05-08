import java.util.Scanner;

public class Problema9 {
    //Problema 9
    //Un polinomio de grado N se puede representar como una tabla unidimensional (un vector) de
    //N+1 componentes, de tal manera que en cada componente se almacene un coeficiente (el
    //coeficiente de grado cero se almacena en la posición 0, el de grado 1 se almacena en la posición
    //1, etc.) Construir un programa que dados los coeficientes de un polinomio P(x) de grado G y un
    //valor real a, calcule el valor de P(a). Nota: primero se dará el valor de G, después los G+1
    //coeficientes del polinomio (en orden creciente de grado) y, finalmente, el valor a.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Grado de polinomio: ");
        int gradoPolinomio = sc.nextInt();

        int array [] = new int[gradoPolinomio+1];
        for (int i = 0; i < gradoPolinomio + 1  ; i++) {
            System.out.println("Coeficiente del numero " +i + " : ");
            array[i] = sc.nextInt();

        }

        System.out.println("Introduce el valor de a: ");
        int a = sc.nextInt();
        int Pa= 0;

        for (int i = 0; i < gradoPolinomio +1  ; i++) {
            Pa = (int) (Pa + Math.pow(a,i)*array[i]);
        }
        System.out.println("Valor polinomio en X = " + a + " es: "+ Pa);
    }
}
