package lista1;

import java.util.Scanner;

public class list_2 {
    public static void main(String[] args){
        int numFunc,hTrab;
        double salHora, salTotal;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escreva o numero do funcionario: ");
        numFunc=sc.nextInt();
        System.out.println("Informe quantos horas o funcionario trabalhou: ");
        hTrab= sc.nextInt();
        System.out.println("Informe qual o valor do salario hora do funcionario: ");
        salHora= sc.nextDouble();

        salTotal=hTrab*salHora;     
       
        System.out.println("O numero do funcionario é: "+numFunc);
    
        System.out.printf("O salario do funcionario é : R$ "+ "%.2f",salTotal);//para poder imprimir as casas decimais
        sc.close();

    }
}
