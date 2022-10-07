package lista1_arrumar;

import java.util.Scanner;

public class List_7 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int valor;
        int div;
        System.out.println("Informe um valor entre 0 e 1000000: ");
        valor = sc.nextInt();
        int[] notas = {100, 50, 20, 10, 5, 2, 1};
        

        for (int count = 0; count < (notas.length); count++ ) {
            if ((valor / notas[count]) >= 1) {
                div = valor / notas[count];
                valor = valor -  (div*notas[count]);
                System.out.println(div + " notas de R$ " + notas[count] + ",00");

            }
        }
        sc.close();
    }
    
}
