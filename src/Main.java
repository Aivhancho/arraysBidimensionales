import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //al final se hace primero filas y luego columnas (5 filas(arrays) y 4 columnas(datos))
        int numeros[][] = new int[/*5*/][/*4*/]{{1,2,3,4}, {1,2,3,4}, {1,2,3,4}, {1,2,3,4}, {1,2,3,4}};
        Scanner sc = new Scanner(System.in);
        //int edades[][] = {{1,3,4},{1,2,5}};
        for(int i=0; i < 5; i++){//eje X
            //se repetirá el for de debajo hasta que el eje X sea 4
            for(int columna=0; columna < 4; columna++){//eje Y
                System.out.println("Introduce los números");
                numeros[i][columna] = sc.nextInt();
            }
            //En un for, se inicializa una variable, esa que después dentro de él se iterará
            //será después lo que le diga hasta cuando se ejecutará
        }
    }

}