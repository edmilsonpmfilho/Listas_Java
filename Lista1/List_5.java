package lista1;

import java.util.Arrays;
import java.util.Scanner;

public class List_5 {
    public static void main(String[] args){
        int[] valores = new int[3];
        Scanner sc=new Scanner(System.in);

        for(int i=0;i<valores.length;i++){
            System.out.println("Escreva um numero inteiro: ");
            valores[i] = sc.nextInt();
           
        }
        Arrays.sort(valores);
        System.out.println(Arrays.toString(valores));
        sc.close();
    }
    
}
