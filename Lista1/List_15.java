package lista1_arrumar;

import java.util.InputMismatchException;
import java.util.Scanner;

public class List_15 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int qtdTermos, t1 = 0, t2 = 1, t3, cont = 2;
		
		while(true) {
			System.out.println("Digite quantos termos deseja ver: ");
			try {
				qtdTermos = sc.nextInt();
				break;
			} catch (InputMismatchException e) {
				sc.next();
				System.err.println("Digite apenas valore númericos inteiros!");
			}
		}
		
		System.out.print(t1 + "  " + t2 + "  " );
		
		while(cont < qtdTermos) {
			t3 = t1 + t2;
			System.out.print(t3 + "  ");
			t1 = t2;
			t2 = t3;
			cont++;
		}

		sc.close();
	}
    
}
