package estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Ex_ifElse {
	
	public static void Ex1() {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		int n1;
		
		System.out.print("Digite um numero: ");
		n1 = sc.nextInt();
		
		if(n1 >= 0) {
			System.out.println("Numero Positivo");
		}else {
			System.out.println("Numero Negativo");
		}
		
	}

	public static void main(String[] args) {
		Ex1();
	}

}
