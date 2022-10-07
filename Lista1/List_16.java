package lista1_arrumar;

import java.util.Scanner;

public class List_16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int anos = 0;
        double paisA , paisB;
        

        System.out.println("Informe o tamanho da população atual do país A: ");
        paisA = sc.nextDouble();
        System.out.println("Informe o tamanho da população atual do país B: ");
        paisB = sc.nextDouble();
        

        while (paisA < paisB) {
            paisA *= 1.03;
            paisB *= 1.015;
            anos ++;
        }
        System.out.println(anos + " anos.");
        sc.close();
    }
    
}
