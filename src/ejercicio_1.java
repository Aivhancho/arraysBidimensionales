public class ejercicio_1 {
    public static void main(String[] args) {
        int numeros[][] = new int[4][4];
        int num = 1;
        for (int fila = 0; fila < numeros.length; fila++) {
            for (int columna = 0; columna < numeros[fila].length;
                 columna++) {
                numeros[fila][columna] = num;
                num++;
            }
            for (fila = 0; fila < numeros.length; fila++) {
                for (int columna = 0; columna < numeros[fila].length;
                     columna++) {
                    System.out.print(numeros[fila][columna] + " ");
                }
                System.out.println("");
            }
        }
    }
}