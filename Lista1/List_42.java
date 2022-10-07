package lista1;

import java.util.Scanner;

public class List_42 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int ing1,ing2;
        double perc;
        System.out.println("Qual o preço antigo: ");
        ing1=sc.nextInt();
        System.out.println("Qual o novo preço: ");
        ing2=sc.nextInt();
        
        perc=((100*ing2)/ing1)-100;

        System.out.printf("%.2f%s",perc," %");

        sc.close();
        


    }
    
}
