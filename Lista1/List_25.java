package lista1_arrumar;

import java.util.Scanner;

public class List_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe os 5 números dos requisitos do trabalho: ");
        String trabalho = sc.nextLine();
        boolean c1 = ((trabalho.charAt(0) == '1') || (trabalho.charAt(1) == '1'));
        boolean c2 = ((trabalho.charAt(2) == '1') || (trabalho.charAt(3) == '1'));
        boolean c3 = ((trabalho.charAt(4) == '1'));
        if  (c1 && c2 && c3) System.out.println("AVALIADO");
        else System.out.println("0 (ZERO)");

        sc.close();
    }
}
