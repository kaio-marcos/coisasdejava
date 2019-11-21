package funcStrings;

public class Main {
//	• Formatar: toLowerCase(paraminusculo), toUpperCase(masiusculo), trim(remove espaços do inicio e fim)
	
//	• Recortar: substring(inicio), substring(inicio, fim)
	
//	• Substituir: Replace(char, char), Replace(string, string)
				
//	• Buscar: IndexOf, LastIndexOf
	
//	• str.Split(" ")
	public static void main(String[] args) {
		String text = "abcd FHGIJ AASBs s as abc SSSS D" + "-       ";
		
		String format01 = text.toLowerCase();
		String format02 = text.toUpperCase();
		String format03 = text.trim();
		String format04 = text.substring(2);
		// utilizando strings somente do caracter 2 em diante
		
		String format05 = text.substring(2, 9);
		/// nesse modelo ele faz o recorte a partir do char 2 e um antes do char 9
	
		String format06 = text.replace("a", "Y");
		
		String format07 = text.replace("abc", "yY");
		// nesse formato ele substitui uma sequencia de string (substring)
		
		int i = text.indexOf("bc");
		// busca a primeira ocorrencia com a substring bc
		int j = text.lastIndexOf("bc");
		// busca a ultima ocorrencia com a substring bc
		
		System.out.println("lower case: " + format01);
		System.out.println("upper case: " + format02);
		System.out.println("trim: " + format03);
		System.out.println("substring(2): " + format04);
		System.out.println("substring(2, 9): " + format05);
		System.out.println("replace: " + format06);
		System.out.println("replace sequenc: " + format07);
		System.out.println("Index of: " + i);
		System.out.println("Last of index: " + j);
		
		// Split
		
		String s = "banana batata maça abobrinha";
		
		String[] vext = s.split(" ");
		String word1 = vext[0];
		String word2 = vext[1];
		String word3 = vext[2];
		
		System.out.println(vext[0]);
		System.out.println(word1);
		System.out.println(word2);
		System.out.println(word3);
		
	}
}
