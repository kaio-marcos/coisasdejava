package bitwise;

import java.util.Scanner;

public class bitwise {
	public static void main(String[] args) {
		// o bitwise compara bit a bit
		//  no exemplo ele comparou todos os bits dos valores
		// e no sexto bit encontrou valores diferente de 0
		Scanner sc = new Scanner(System.in);
		
		int mask = 0b100000;
		
		int n = sc.nextInt();
		
		if ((n & mask) != 0) {
			System.out.println("6th bit is true!");
		} else {
			System.out.println("6th bit is false");
		}
		sc.close();
	}
}
