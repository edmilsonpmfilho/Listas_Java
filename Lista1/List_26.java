package lista1_part2;

import java.util.Scanner;

public class List_26 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a altura da pessoa (em cm): ");
        float altura = sc.nextFloat();
        System.out.println("Informe a idade da pessoa: ");
        int idade = sc.nextInt();
        sc.close();

        int count = 0;

        if (idade >= 12 && altura >= 1.5) count++;
        if (idade >= 14 && altura >= 1.4) count++;
        if (idade >= 16 && altura >= 1.7)  count++;

        System.out.println(count);

    }
    
}
