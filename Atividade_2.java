/*2- Faça um programa que receba 6 números inteiros e mostre: 
• Os números pares digitados;  
• A soma dos números pares digitados; 
• Os números ímpares digitados; 
• A quantidade de números ímpares digitados.
 */

package Lista4;

import java.util.Scanner;

public class Atividade_2 {

	public static void main(String[] args) {
		int [] A = new int [6];
		int [] P= new int [6];
		int [] I= new int [6];
		int x, somapar=0, somaimpar=0, i=0;

		Scanner leia = new Scanner (System.in);

		for (x=0; x<6; x++) {
			System.out.println ("Insira um número: ");
			A [x] = leia.nextInt();

			if (A[x] %2==0) {

				P [x] = A [x];
				somapar += A [x];

			}else {
				I [x] = A [x];
			}
		}
		System.out.println("Os vetores pares digitados foram: ");
		for (x=0;x<6;x++) {
			if (P[x]!= 0) {
				System.out.println("\n"+P[x]);
			}
		}
		System.out.println("\nOs vetores ímpares digitados foram: ");
		for (x=0;x<6;x++) {
			if (I[x]!=0) {
				i ++;
				System.out.println("\n" +I[x]);

			}
		}
		System.out.println("Soma dos pares: "+somapar);
		System.out.println("Quantidade de números ímpares: "+i);	 

	}


}
