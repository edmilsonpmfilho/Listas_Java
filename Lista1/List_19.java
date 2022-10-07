package lista1;

import java.util.Scanner;

public class List_19 {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        double sal;
        System.out.println("Qual o salario do funcionario: ");
        sal= sc.nextDouble();

        if(sal>=500.01){
            double novoSal=(sal*0.10)+sal;
            System.out.printf("%.2f",novoSal);
        }else if(sal>=300.00 && sal<=500.00){
            double novoSal=(sal*0.07)+sal;
            System.out.printf("%.2f",novoSal);
        }else{
            double novoSal=(sal*0.05)+sal;
            System.out.printf("%.2f",novoSal);
        }
        sc.close();
    }
    
}
