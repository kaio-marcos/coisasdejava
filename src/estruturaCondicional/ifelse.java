package estruturaCondicional;
import java.util.Scanner;
import java.util.Locale;

public class ifelse {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner (System.in);
		
		int a,b;
		System.out.println("Digite um valor: ");
		a = scan.nextInt();
		System.out.println("Digite outro valor: ");
		b = scan.nextInt();
		scan.close();
		
		if(a > b ) {
			System.out.println("veja como a estrutura condicional funciona"
					+ "ela depente de que uma expressão seja verdadeira, e executa determinado bloco");
		}
		else {
			System.out.println("Caso contrário, ele irá executar outro bloco de comando");
		}
	}
}
