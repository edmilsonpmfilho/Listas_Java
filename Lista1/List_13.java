package lista1;

import java.util.Scanner;

public class List_13 {
    public static void main(String[] args){
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um nnumero inteiro: ");
        num = sc.nextInt();

        for(int i=1;i<=num;i++){
            if(i%2==0){
                System.out.print(i+", ");
            }
        }
        sc.close();

    }
    
}
