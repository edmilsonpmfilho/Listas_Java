package lista1_arrumar;

import java.util.Scanner;

public class List_34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor de x: ");
        int x = sc.nextInt();
        System.out.println("Informe o valor de y: ");
        int y = sc.nextInt();
        sc.close();
        while (x <= y) {
            for (int i = 0; i < 2; i++) {
                System.out.print(x + " ");
                x++;
            }
            System.out.println(x);
            x++;
        }
        sc.close();
    }
}
