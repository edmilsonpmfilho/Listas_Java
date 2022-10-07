package lista1;

import java.util.Scanner;

public class List_27 {

    public static void main(String[] args){
        double t1,t2,t3,t4;
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a primeira medição: ");
        t1 = sc.nextDouble();
        System.out.println("Informe a segunda medição: ");
        t2 = sc.nextDouble();
        System.out.println("Informe a terceira medição: ");
        t3 = sc.nextDouble();
        System.out.println("Informe a quarta medição: ");
        t4 = sc.nextDouble();

        if(t1<110){
            System.out.println(t1+" Normal");
        }else if(t1>=110&&t1<=125){
            System.out.println(t1+" Alterada");
        }else{
            System.out.println(t1+" Muito Alta");
        }
        //
        if(t2<110){
            System.out.println(t2+" Normal");
        }else if(t2>=110&&t2<=125){
            System.out.println(t2+" Alterada");
        }else{
            System.out.println(t2+" Muito Alta");
        }
        //
        if(t3<110){
            System.out.println(t3+" Normal");
        }else if(t3>=110&&t3<=125){
            System.out.println(t3+" Alterada");
        }else{
            System.out.println(t3+" Muito Alta");
        }
        //
        if(t4<110){
            System.out.println(t4+" Normal");
        }else if(t4>=110&&t4<=125){
            System.out.println(t4+" Alterada");
        }else{
            System.out.println(t4+" Muito Alta");
        }

        double media=(t1+t2+t3+t4)/4;

        System.out.printf("Media de leitura = " + "%.2f",media);

        sc.close();
    }
    
}
