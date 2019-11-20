package teste;
import java.util.Scanner;
import java.util.Locale;

public class EntradaDeDados {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		String s1,s2,s3;
		
		// fará a leitura até a quebra de linha
		s1 = scan.nextLine();
		s2 = scan.nextLine();
		s3 = scan.nextLine();
		
		System.out.println("Valores digitados:");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		scan.close();
		
		//Quando você usa um comando de leitura
//		diferente do nextLine() e dá alguma quebra de
//		linha, essa quebra de linha fica "pendente"
//		na entrada padrão
//		ex: x = scan.nextInt();
//			s1 = scan.nextLine();
//		então se fizer um nextLine(), aquela quebra
//		de linha pendente será absorvida pelo nextLine()
//		ex: x = scan.nextInt();
//		scan.nextLine();
//		s1 = scan.nextLine();
	}

}
