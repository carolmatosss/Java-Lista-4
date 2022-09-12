/*3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.*/

package Lista4;

import java.util.Scanner;

public class Atividade_3 {

	public static void main(String[] args) {
		float [][] A = new float [3][3];
		float [][] B = new float [3][3];
		int i, j, cont=0;

		Scanner leia = new Scanner (System.in);

		for (i=0; i<3; i++) {
			for (j=0; j<3; j++) {
				System.out.println ("Insira um número: ");
				A [i][j] = leia.nextFloat();

				if(A[i][j]>10) {
					B [i][j] = A [i][j];
				}

			}
		}

		System.out.println ("Os números maiores que 10 são: ");

		for (i=0;i<3;i++) {
			for (j=0; j<3; j++) {
				if(B [i][j] != 0) {
					cont ++;
					System.out.println("\n"+ B[i][j]);

				}
			}


		}

		System.out.println("Totalizando "+cont+" números maiores que 10.");
	}

}
