package lista1;

import java.util.Scanner;

public class List_3 {
    public static void main(String[] args){
        String nomeFunc;
        double salFixo, totalVendas, salTotal;
        Scanner sc= new Scanner(System.in);

        System.out.println("Informe o nome do funcionario: ");
        nomeFunc= sc.nextLine();
        System.out.println("Informe o salario fixo do funcionario: ");
        salFixo= sc.nextDouble();
        System.out.println("Informe o total das vendas do funcionario: ");
        totalVendas= sc.nextDouble();
        
        salTotal= salFixo+(totalVendas*0.15);
        
        System.out.printf("O funcionario: " +nomeFunc+" tem o total = R$ "+"%.2f",salTotal);
        sc.close();
    }
}
