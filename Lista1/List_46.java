package lista1_arrumar;

import java.util.Scanner;

public class List_46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M, N;
        long fat1 = 1, fat2 = 1;

        System.out.println("Informe o valor de M: ");
        M = sc.nextInt();
        System.out.println("Informe o valor de N");
        N = sc.nextInt();

        if (M > 1) {
            for (int i = M; i > 1; i--) {
                fat1 *= i;
            }
        }

        if (N > 1) {
            for (int i = N; i > 1; i--) {
                fat2 *= i;
            }
        }

        System.out.println(fat2+fat1);
        sc.close();
    }
    
}
