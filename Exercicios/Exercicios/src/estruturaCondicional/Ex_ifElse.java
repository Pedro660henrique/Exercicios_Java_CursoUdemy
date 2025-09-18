package estruturaCondicional;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Date;
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
	

	/*Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
	Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
	ordem crescente ou decrescente.*/
	public static void Ex3() {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		int a, b;
		
		System.out.print("Insira o primeiro valor: ");
		a = sc.nextInt();
		System.out.print("Insira o segundo valor:: ");
		b = sc.nextInt();
		
		if(a % b == 0 || b % a ==0) {
			System.out.print("Sao Multiplos");
		}else {
			System.out.print("Nao sao Multiplos");
		}
		
		sc.close();
	}
	
	/*Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
	começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.*/
	public static void Ex4() {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.print("Digite o horario inicial (HH:mm): ");
		LocalTime horaInicial = LocalTime.parse(sc.nextLine());
		
		System.out.print("Digite o horario Final (HH:mm): ");
		LocalTime horaFinal = LocalTime.parse(sc.nextLine());
		
		
		// Se o horário final for antes do inicial, soma 24h
		if (horaFinal.isBefore(horaInicial)) {
		    horaFinal = horaFinal.plusHours(24); 
		}	
		
		//calcula a duração
		Duration duracao = Duration.between(horaInicial, horaFinal);
		
		
		
		long horas = duracao.toHours();
		long minutos = duracao.toMinutesPart();
		
		System.out.printf("Diferença:  %d:%02d%n", horas, minutos);
		
		sc.close();
	}

	public static void main(String[] args) {
		Ex4();
	}
	
}
