package lista1_arrumar;

import java.util.ArrayList;
import java.util.Scanner;





public class List_44 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int somaim=0;
        int diferenca=0;

        ArrayList<Integer> todos = new ArrayList<>();
        ArrayList<Integer> par = new ArrayList<>();
        ArrayList<Integer> impar = new ArrayList<>();

        for(int i=0; i<5;i++){
            System.out.println("Digite um numero:");
            int num= sc.nextInt();

            if(num%2 == 0){
                todos.add(num);
                par.add(num);
            }else{
                todos.add(num);
                impar.add(num);
            }
            

        }

        for(int i=0;i<impar.size();i++){
            somaim += impar.get(i);

        }
        int mediaim = somaim/impar.size();

        

        diferenca = todos.get(todos.size()-1) - todos.get(0);


            System.out.println(todos);
            System.out.println(par);
            System.out.println(impar);


            System.out.println("A media dos numeros impares é: " + mediaim);
            System.out.println("Maior número PAR: " + par.get(par.size()-1));
            System.out.println("A diferença é: " + diferenca);



        sc.close();
    }
}
