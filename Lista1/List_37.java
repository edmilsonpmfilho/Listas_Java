package lista1;


import java.util.Scanner;

public class List_37 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1,n2,soma;
        String play1,play2,escolha1,escolha2,resultado;
        
        System.out.println("Qual o nome do jogador 1");
        play1=sc.nextLine();
        System.out.println("Qual a escolha jogador 1");
        escolha1=sc.nextLine();
        System.out.println("Qual o numero jogador 1");
        n1=sc.nextInt();
        
        System.out.println("Qual o nome do jogador 2");
        play2=sc.nextLine();
        System.out.println("Qual a escolha jogador 2");
        escolha2=sc.nextLine();
        System.out.println("Qual o numero jogador 2");
        n2=sc.nextInt();     
       
          
        

        soma=n1+n2;
        
        System.out.println("A soma dos valores é: "+soma);
        if(soma%2==0){
            resultado="Par";
        }else{
            resultado="Impar";
        }

        System.out.println(resultado);

        if(escolha1.equalsIgnoreCase("Par")&&resultado=="Par"){
            System.out.println("Vencedor é: "+ play1);
        }else if(escolha1.equalsIgnoreCase("Impar")&&resultado=="Impar"){
            System.out.println("Vencedor é: "+ play1);
        }else{
            System.out.println("Vencedor é: "+ play2);
        }
        sc.close();

        

        
        


    }
    
}
