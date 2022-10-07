package lista1;

import java.util.Scanner;

public class List_31 {
    public static void main(String[] args){

        double n1,n2;
        double media;
        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva a primeira nota do aluno: ");
        n1=sc.nextDouble();
        System.out.println("Escreva a segundanota do aluno: ");
        n2=sc.nextDouble();

        if((n1>=0&&n1<=10)&&(n2>=0&&n2<=10)){
            media = (n1+n2)/2;
            System.out.println("MEDIA: "+media);
        }else{
            System.out.println("Nota Invalida");
        }
        sc.close();

    }
    
}
