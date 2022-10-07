package lista1_arrumar;

import java.util.Scanner;

public class List_48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idade;
        double peso;
        int X;
        System.out.println("Informe a idade do paciente: ");
        idade= sc.nextInt();

        System.out.println("Infome o peso do paciente: ");
        peso=sc.nextDouble();

    

        if(idade>=12&&peso>=60){
            System.out.println("40 gotas");

        }else if(idade >=12 && peso<60){

            System.out.println("35 gotas");

        }else if(idade<12 && (peso>=5 && peso<=9)){
            X=(125*2)/50;
            System.out.println(X + " gotas");

        }else if(idade<12 && (peso>=9.1 && peso<=16)){
            X=(250*2)/50;
            System.out.println(X + " gotas");
        }else if(idade<12 && (peso>=16.1 && peso<=24)){
            X=(375*2)/50;
            System.out.println(X + " gotas");
        }else if(idade<12 && (peso>=24.1 && peso<=30)){
            X=(500*2)/50;
            System.out.println(X + " gotas");
        }else if(idade<12 && peso>=30.1){
            X=(750*2)/50;
            System.out.println(X + " gotas");
        }else{
            System.out.println("Valores errados!");
        }


       
    sc.close();
    }
}
