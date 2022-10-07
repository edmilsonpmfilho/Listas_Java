package lista1_part2;

import java.util.Scanner;

public class List_50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o número do andar: ");
        String andarString = sc.nextLine();
        sc.close();

        int andarInt = Integer.parseInt(andarString);

        while(true) {
            if (andarString.contains("4") || andarString.contains("13")) {
                andarInt++;
                andarString = Integer.toString(andarInt);
            }
            else {
                System.out.println(andarInt);
                break;
            }
        }

    }
}
