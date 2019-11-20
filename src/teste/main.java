package teste;
//import bibli de localização
import java.util.Locale;
// import bib de leitura;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		System.out.println("hello word");
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		int x, y, soma;
		
		System.out.println("Digite o valor de X: ");
		x = scan.nextInt();
		
		System.out.println("Diite o valr de Y: ");
		y = scan.nextInt();
		
		soma = x + y;
		
		System.out.printf("Soma = %d\n", soma);
	}

}