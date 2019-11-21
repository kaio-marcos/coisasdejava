package estruturaCondicional;

public class CondicaoTernaria {
//	Estrutura opcional ao if-else quando se deseja decidir um VALOR com base em uma
//	condição.
//	Sintaxe:
//	( condição ) ? valor_se_verdadeiro : valor_se_falso
	public static void main(String[] args) {
		
		// com if else
		double preco = 34.5;
		double desconto;
		if (preco < 20.0) {
			desconto = preco * 0.1;
		} else {
			desconto = preco * 0.05;
		}
		System.out.println("com if else:" + preco);
		System.out.println("com if else" + desconto);
		
		tern(preco, desconto);
	}
	
	public static void tern(Double preco, Double desconto) {
		 preco = 34.5;
		 desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
		 
		 System.out.println(preco);
		 System.out.println(desconto);
	}
}
