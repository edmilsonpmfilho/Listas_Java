package lista1;

import java.util.Scanner;

public class List_41 {

    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    double peso, altura,ema,engor;

    System.out.println("Qual sua altura: ");
    altura=sc.nextDouble();
    System.out.println("Qual seu peso: ");
    peso=sc.nextDouble();

    if(altura<=1.50 && peso==50){
        System.out.println("Peso Ideal");
    }else if(altura<=1.50 && peso>50){
       ema= peso-50;
       System.out.println("Emagreça: " + ema + " Kg");
    }else if (altura<=1.50 && peso<50){
        engor =50-peso;
        System.out.println("Engorde: " + engor+ " Kg");
    
    }else if(altura>=1.51&& altura <=1.90 && peso==70){
        System.out.println("Peso Ideal");
    }else if(altura>=1.51&& altura <=1.90 && peso>70){
        ema= peso-70;
        System.out.println("Emagreça: " + ema+ " Kg");
    }else if (altura>=1.51&& altura <=1.90 && peso<70) {
        engor =70-peso;
        
         System.out.println("Engorde: " + engor+ " Kg");
    
    }else if(altura>1.91 && peso==100){
        System.out.println("Peso Ideal");
    }else if(altura>1.91 && peso>100){
        ema= peso-100;
        System.out.println("Emagreça: " + ema+ " Kg");
    }else if (altura>1.91 && peso<100){
        engor =100-peso;
        
         System.out.println("Engorde: " + engor+ " Kg");
    }else{
        System.out.println("Valores invalidos");
    }
     sc.close();
    }
    
}
