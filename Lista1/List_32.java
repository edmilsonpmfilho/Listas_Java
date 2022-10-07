package lista1;

import java.util.Scanner;

public class List_32 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double l,lA=0,lG=0,lD=0;
        int qtdA=0,qtdG=0,qtdD=0;
        int type;

        for(int i=1;i<=5;i++){
        System.out.println("Qual o tipo do combustivel: ");
        type = sc.nextInt();
        System.out.println("Quantos litros foram colocados:");
        l= sc.nextInt();
        switch(type){
            case 1 :
            qtdA=qtdA+1;
            lA=l+lA;
            break;
            case 2 :
            qtdG=qtdG+1;
            lG=l+lG;
            break;
            case 3 :
            qtdD=qtdD+1;
            lD=l+lD;
            break;
           
            }  
        }
        System.out.println("1. Álcool: "+ qtdA+ "- Qtd Litros: "+ lA); 
        System.out.println("2. Gasolina: "+ qtdG+ "- Qtd Litros: "+ lG); 
        System.out.println("3. Diesel: "+ qtdD+ "- Qtd Litros: "+ lD); 

        sc.close();

    }
}
