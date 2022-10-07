package lista1;

import java.util.Scanner;

public class list_1 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       double A = 3.5;
       double B = 7.5;
       double media, soma;

       System.out.println("Escreva a primeira nota do aluno: ");
        double nota1= sc.nextDouble();
        System.out.println("Escreva a segunda nota do aluno: ");
        double nota2= sc.nextDouble();

        soma = nota1+nota2;
        System.out.println("A soma das notas é: " + soma);

        media = ((nota1*A)+(nota2*B))/(A+B);
        
        System.out.printf("A media do aluno é: "+"%.5f",media);
        sc.close();

    }
    
}
