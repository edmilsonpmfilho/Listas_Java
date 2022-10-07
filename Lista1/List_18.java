package lista1_arrumar;

import java.util.Scanner;

public class List_18 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String numero,numeroReverse;
        int numeroConvertido;
        
        System.out.println("Digite o número a ser invertido: ");
        numero = sc.nextLine();
        
        
        StringBuilder strb = new StringBuilder(numero);
        numeroReverse = strb.reverse().toString();
        numeroConvertido = Integer.parseInt(numeroReverse);
        
        System.out.println(numeroConvertido);

        sc.close();
    }
    
}
