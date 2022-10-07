package lista1;

import java.util.Scanner;

public class List_14 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("Escreva um numero: ");
        num=sc.nextInt();
        for(int i=num;i<=(num+12);i++){
            if(i%2==1){
                System.out.println(i);
            }
        }
        sc.close();

    }
    
    
    
    
    
}
