package lista1;

import java.util.Scanner;

public class List_11 {
        public static void main (String []args){
            Scanner sc = new Scanner (System.in);

            int horaI, horaF;
            int horaJ = 0;
            System.out.println("Informe a hora inicial do jogo: ");
            horaI = sc.nextInt();
            
            System.out.println("Informe a hora final do jogo: ");
            horaF = sc.nextInt();

            if((horaI < 12 && horaI > 1) && horaI < 24){
                horaJ = horaF  - horaI;
                System.out.println("O jogo durou " + horaJ +" horas");
                }else if(horaI == 0 && horaF == 0){
                    System.out.println("O jogo durou 24 horas");
                }else{
                    horaF = (24 - horaI) + horaF;
                    System.out.println("o jogo durou " + horaF + "horas");

                }
                        sc.close();






        }
}
