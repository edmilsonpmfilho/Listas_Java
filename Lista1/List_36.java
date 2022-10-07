package lista1;

import java.util.Scanner;

public class List_36 {
    public static void main(String[] args) {
        int N;
        Scanner sc =new Scanner(System.in);
        System.out.println("Informe o numero sorteado: ");
        N= sc.nextInt();
        for(int i = 0; i <= N; i++) {
            String result = new String(new char[i]).replace("\0", "HO");
            System.out.println(result + "!");

        }
        
        sc.close();
}
}

