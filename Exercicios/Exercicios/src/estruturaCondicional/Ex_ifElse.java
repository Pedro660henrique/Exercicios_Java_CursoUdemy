package estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Ex_ifElse {
	
	
	//Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
	public static void Ex1() {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		int n1;
		
		System.out.print("Digite um numero: ");
		n1 = sc.nextInt();
		
		if(n1 >= 0) {
			System.out.println("Numero Positivo");
		}
		else {
			System.out.println("Numero Negativo");
		}
		sc.close();
	}
	
	//Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
	public static void Ex2() {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		int n1;
		
		System.out.print("Digite um numero: ");
		n1 = sc.nextInt();
		
		if(n1 % 2 == 0) {
			System.out.println("Par");
		}
		else {
			System.out.println("Impar");
		}
		sc.close();
	}
	

	public static void main(String[] args) {
		Ex2();
	}
	
}
