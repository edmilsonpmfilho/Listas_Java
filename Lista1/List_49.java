package lista1;

import java.util.Scanner;

public class List_49 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        double peso, altura, IMC;

        System.out.println("Qual o seu peso: ");
        peso= sc.nextDouble();
        System.out.println("Qual a sua altura: ");
        altura= sc.nextDouble();

        IMC=peso/(altura*altura);

        if(IMC<=20){ 
            System.out.println("IMC = "+IMC+" Abaixo do peso");
        }else if(IMC>=20.1 && IMC<=25){
            System.out.println("IMC = "+IMC+" Peso Normal");
        }else if(IMC>=25.1 &&IMC<=30 ){
            System.out.println("IMC = "+IMC+" Sobrepeso");
        }else if(IMC>=30.1 && IMC<=40 ){
            System.out.println("IMC = "+IMC+" Obeso");
        }else{
            System.out.println("IMC = "+IMC+" Obeso Morbido");
        }

    sc.close();
    }  
}
