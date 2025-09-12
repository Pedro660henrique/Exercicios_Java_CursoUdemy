package exercicio;

import java.util.Locale;
import java.util.Scanner;

/*Se n % 2 == 0, o número é par.
Se n % 2 != 0, o número é ímpar.*/

public class Ex_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in).useLocale(Locale.US);

		int x;
		
		System.out.println("Verificador de numeros pares ou impares");

		System.out.println("Digite o numero abaixo: ");
		x = sc.nextInt();
		
		if(x % 2 == 0) {
			System.out.println("O numero é Par");
		}
		else{
			System.out.println("O numero é Impar");
		}
		
		sc.close();

	}

}
