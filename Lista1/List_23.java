package lista1;

import java.util.Scanner;

public class List_23 {
 public static void main(String[] args){
    int X,Y;
    Scanner sc =new Scanner(System.in);
    System.out.println("Escreva um numero intero para X: ");
    X=sc.nextInt();
    System.out.println("Escreva um numero intero para Y: ");
    Y=sc.nextInt();
    if(X>Y){
        System.out.println("1");
    }else{
        System.out.println("0");
    }
    if(X==Y){
        System.out.println("1");
    }else{
        System.out.println("0");
    }
    if(X<Y){
        System.out.println("1");
    }else{
        System.out.println("0");
    }
    if(X!=Y){
        System.out.println("1");
    }else{
        System.out.println("0");
    }
    if(X>=Y){
        System.out.println("1");
    }else{
        System.out.println("0");
    }
    if(X<=Y){
        System.out.println("1");
    }else{
        System.out.println("0");
    }
    sc.close();
 }   
}
