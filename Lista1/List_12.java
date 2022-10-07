package lista1;

import java.util.Scanner;

public class List_12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("O animal é Vertebrado ou Invertebrado?");
        String vetInvet=sc.nextLine();
        if(vetInvet.equalsIgnoreCase("Vertebrado")){
            System.out.println("Digite se o Vertebrado é Ave ou Mamifero:");
            String aveMami=sc.nextLine();
            if(aveMami.equalsIgnoreCase("Ave")){
                System.out.println("A ave é Carnivoro ou Onivoro:");
                String carnOni= sc.nextLine();
                if(carnOni.equalsIgnoreCase("Carnivoro")){
                    System.out.println("Águia");
                }else if(carnOni.equalsIgnoreCase("Onivoro")){
                    System.out.println("Pomba");
                }
            }else if(aveMami.equalsIgnoreCase("Mamifero")){
                System.out.println("O mamifero é Onivoro ou Herbivoro");
                String oniHerb= sc.nextLine();
                if(oniHerb.equalsIgnoreCase("Onivoro")){
                    System.out.println("Homem");
                }else if(oniHerb.equalsIgnoreCase("Herbivoro")){
                    System.out.println("Vaca");
                }
            }else{
                System.out.println("Alguma palavra foi digitada errada!");
            }
            

        }else if(vetInvet.equalsIgnoreCase("Invertebrado")){
            System.out.println("O invertebrado é um Inseto ou Anelideo");
            String insAne=sc.nextLine();
            if(insAne.equalsIgnoreCase("Inseto")){
                System.out.println("O Inseto é Hematofago ou Herbivoro");
                String hemaHerb=sc.nextLine();
                if(hemaHerb.equalsIgnoreCase("Hematofago")){
                    System.out.println("Pulga");
                }else if(hemaHerb.equalsIgnoreCase("Herbivoro")){
                    System.out.println("Lagarta");
                }
            }else if(insAne.equalsIgnoreCase("Anelideo")){
                System.out.println("O Inseto é Hematofago ou Onivoro");
                String hemaOni=sc.nextLine();
                if(hemaOni.equalsIgnoreCase("Hematofago")){
                    System.out.println("Sanguessuga");
                }else if(hemaOni.equalsIgnoreCase("Onivoro")){
                    System.out.println("Minhoca");
                }
            }else{
                System.out.println("Alguma palavra foi escrita errada!");
            }

        }else{
            System.out.println("Palavra escrita errada!");
        }
    sc.close();
    }
}
