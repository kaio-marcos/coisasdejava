package funcoes;

import java.util.Scanner;

public class Main {
	// static = para que uma função possa ser chamada idependente de se criar um objeto
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite três numeros: ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		int result = max(a, b, c);
		
		resultadoemtela(result);
				
		scan.close();
	}
	
	public static int max(int a, int b, int c) {
		int maximo = 0;
		if(a > b && a > c) {
			maximo = a;
		}
		else if(b > a && b > c) {
			maximo = b;
		}
		else {
			maximo = c;
		}
		return maximo;
		
	}
	
	public static void resultadoemtela(int result) {
		System.out.println("Maior número: ");
		System.out.println(result);
	}

}
