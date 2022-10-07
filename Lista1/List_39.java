package lista1;

import java.util.Scanner;

public class List_39 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int num,mult;
        System.out.println("Qual o numero vc deseja saber");
        num=sc.nextInt();

        for(int i=0;i<=10;i++){
            mult=i*num;
            
            System.out.println(num +" x " + i + " = " + mult);
          
        }
        sc.close();
    }
}
