package lista1;

import java.util.Scanner;

public class List_8 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        double RH,RM,RC;//Renda Homem e Renda Mulher
        System.out.println("Informe a renda do homem: ");
        RH = sc.nextInt();
        System.out.println("Infomre a renda da mulher: ");
        RM = sc.nextInt();

        RC= RH+RM;
        

        if(RC<=900){
            System.out.printf("Renda Conjunta: "+"%.2f",RC);
            System.out.println("");
            System.out.println("Aliquota Atualizada: Isento ");
            System.out.println("Imposto de Renda: - ");
            System.out.printf("Renda Liquida: "+"%.2f",RC);
        }else if(RC>900&&RC<=1500){
            System.out.printf("Renda Conjunta: "+"%.2f",RC);
            System.out.println("");
            System.out.println("Aliquota Atualizada: 10% ");
            System.out.printf("Imposto de Renda: "+ "%.2f",(RC*0.1));
            System.out.println("");
            System.out.printf("Renda Liquida: "+"%.2f",(RC-(RC*0.1)));
        }else if(RC<1500&&RC>=2500){
            System.out.printf("Renda Conjunta: "+"%.2f",RC);
            System.out.println("");
            System.out.println("Aliquota Atualizada: 15% ");
            System.out.printf("Imposto de Renda: "+ "%.2f",(RC*0.15));
            System.out.println("");
            System.out.printf("Renda Liquida: "+"%.2f",(RC-(RC*0.15)));
        }else{
            System.out.printf("Renda Conjunta: "+"%.2f",RC);
            System.out.println("");
            System.out.println("Aliquota Atualizada: 25% ");
            System.out.printf("Imposto de Renda: "+ "%.2f",(RC*0.25));
            System.out.println("");
            System.out.printf("Renda Liquida: "+"%.2f",(RC-(RC*0.25)));
        }

        
        
        sc.close();

    }
    
}
