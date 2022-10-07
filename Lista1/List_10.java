package lista1;

import java.util.Scanner;

public class List_10 {
    
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        int ano,mes,dia;
        int dias;

        System.out.println("Informe quantos dias de vida você tem: ");
        dias = sc.nextInt();

        ano= dias/365;
        mes=(dias-(ano*365))/30;
        dia= (dias - (ano*365)-(mes*30));

        System.out.println(ano + " Ano(s)");
        System.out.println(mes + " Mês(es)");
        System.out.println(dia + " Dia(s)");
        sc.close();
    }
}
