package lista1_arrumar;

import java.util.Scanner;

public class List_43 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        int N, M,troco;
        int[] notas = {2,5,10,20,50,100};
        boolean possivel = false;

        System.out.println("Qual o valor da conta do cliente: ");
        N=sc.nextInt();

        System.out.println("Quanto o cliente pagou: ");
        M=sc.nextInt();

        troco=M-N;

        System.out.println("O troco deve ser de: " + troco);

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (troco - notas[j] == notas[i]) possivel = true;
            }
        }

        if(possivel){
        System.out.println("possivel");
        }else{
            System.out.println("Impossivel");
        }

        sc.close();
   
   
    }

}
