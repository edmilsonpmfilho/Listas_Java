package lista1_arrumar;

import java.text.DecimalFormat;
import java.util.Scanner;

public class List_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        double contaAgua = 0;

        System.out.println("Informe o consumo da sua conta de água (em metros cúbicos): ");
        int consumoAgua = sc.nextInt();
       

        if (consumoAgua <= 10) {
            contaAgua = 7;
            System.out.println("Valor em reais: " + df.format(contaAgua));
        }
        else if (consumoAgua <= 30) {
            contaAgua = 7 + (consumoAgua-10);
            System.out.println("Valor em reais: " + df.format(contaAgua) + "(7 + "+ (consumoAgua-10)+ "x1)");
        }
        else if (consumoAgua <= 100) {
            contaAgua = 7 + 20 + ((consumoAgua-30)*2);
            System.out.println("Valor em reais: " + df.format(contaAgua) + "(7 + "+"20x1 + " + (consumoAgua-30)+ "x2)");
        }
        else {
            contaAgua = 7 + 20 + 140 + ((consumoAgua-100)*5);
            System.out.println("Valor em reais: " + df.format(contaAgua) + "(7 + "+"20x1 + 70x2 + " + (consumoAgua-100) + "x5)");
        }
        sc.close();
    }
}
