package lista1;

import java.util.Scanner;

public class List_4 {
    static int maior(int A,int B, int C){
        
       
        if(A>B && A>C){
            return A;
        }else if(B >A && B>C){
            return B;

        }else{return C;} 
    
    }
    static int menor(int A,int B, int C){
    
       
        if(A<B && A<C){
            return A;
        }else if(B <A && B<C){
            return B;

        }else{return C;} 
    
    }
    public static void main(String[] args){
        int A,B,C, xMaior,xMenor;
        Scanner sc= new Scanner(System.in);
        System.out.println("Escreva o primeiro valor: ");
        A= sc.nextInt();
        System.out.println("Escreva o segundo valor: ");
        B= sc.nextInt();
        System.out.println("Escreva o terceiro valor: ");
        C= sc.nextInt();
        xMaior = maior(A,B,C);
        xMenor = menor(A,B,C);
        System.out.println("Maior = " + xMaior);
        System.out.println("Menor = " + xMenor);
        sc.close();
    }
}


