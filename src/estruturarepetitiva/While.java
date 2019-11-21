package estruturarepetitiva;

import java.util.Scanner;

public class While {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int condicao;
		System.out.println("Digite um valor para condição: ");
		condicao = scan.nextInt();
		
		while(condicao < 10) {
			System.out.println("condição menor que 10");
			System.out.println("digite um novo valor para condição: ");
			condicao = scan.nextInt();
		}
		scan.close();
	}
}
