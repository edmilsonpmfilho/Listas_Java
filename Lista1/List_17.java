package lista1_arrumar;

import java.util.Scanner;

public class List_17 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num=0, cont=0;
        
        System.out.println("Qual o numero: ");
        num=sc.nextInt();
        for(int i=1;i<=num;i++){
        if(num%i==0){
            cont++;
            }
        }
        if(cont==2){ 
        System.out.println(num + " é Primo");
        }else{
        System.out.println(num + " Não é primo");
        }
       sc.close();
    }
}
