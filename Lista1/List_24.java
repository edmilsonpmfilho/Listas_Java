package lista1_arrumar;

import java.util.Scanner;

public class List_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch;
        String palindromoReverse = "";


        System.out.println("Informe o valor: ");
        int numero = sc.nextInt();
      

        String palindromo = Integer.toString(numero);

        for (int i = palindromo.length() - 1; i >= 0; i--) {
            ch = palindromo.charAt(i);
            palindromoReverse = palindromoReverse + ch;
        }

        if (palindromo.equals(palindromoReverse)) System.out.println("S"); else System.out.println("N"); 
        
        sc.close();
    }
}
