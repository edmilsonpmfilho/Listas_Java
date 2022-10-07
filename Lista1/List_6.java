package lista1;

import java.util.Scanner;


public class List_6 {
    public static void main(String[] args){
        double X,Y;
        double kmL;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite quantos quilometros foram percorridos: ");
        X= sc.nextDouble();
        System.out.println("Digite quantos litros de combustivel foram gastos: ");
        Y= sc.nextDouble();

        kmL= X/Y;

        System.out.printf("%.3f%s",kmL," km/l");
        sc.close();
    }
    
}
