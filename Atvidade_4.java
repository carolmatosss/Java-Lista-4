/*4- Faça um programa que leia duas matrizes 2 x 2 com valores reais. Ofereça ao usuário um menu de opções:
(1) somar as duas matrizes 
(2) subtrair a primeira matriz da segunda 
(3) adicionar uma constante as duas matrizes
(4) imprimir as matrizes 
Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada. Na terceira opção o valor da constante deve ser lido e o resultado da adição da constante deve ser armazenado na própria matriz.
 */

package Lista4;

import java.util.Scanner;

public class Atvidade_4 {

	public static void main(String[] args) {

		float[][] A = new float [2][2];
		float[][] B = new float [2][2];
		float[][] C = new float [2][2];
		float[][] D = new float [2][2];
		float constante= 2;
		int i, j, op; 

		Scanner leia= new Scanner (System.in);

		for(i=0; i<2; i++) {
			for (j=0;j<2;j++) {
				System.out.print("Insira um valor para a matriz A:");
				A [i][j] = leia.nextFloat();
			}
		}

		for(i=0; i<2; i++) {
			for (j=0;j<2;j++) {
				System.out.print("Insira um valor para a matriz B:");
				B [i][j] = leia.nextFloat();
			}
		}


		System.out.println("Escolha uma opção: ");
		System.out.println("1- Somar as duas matrizes");
		System.out.println("2- Subtrair as duas matrizes");
		System.out.println("3- Adicionar constante as matrizes.");
		System.out.println("4- Imprimir matrizes");
		op = leia.nextInt();

		if(op==1) {
			for(i=0; i<2; i++) {
				for (j=0; j<2; j++) {
					C[i][j] = A[i][j] + B[i][j];
				}
			}

			System.out.println ("A soma das matrizes é: ");
			for(i=0; i<2; i++) {
				for (j=0;j<2;j++) {
					System.out.println("\n"+C[i][j]);
				}
			}
		}
		
		if(op==2) {
			for(i=0; i<2; i++) {
				for (j=0; j<2; j++) {
					C[i][j] = B[i][j] - A[i][j] ;
				}
			}

			System.out.println ("A subtração das matrizes é: ");
			for(i=0; i<2; i++) {
				for (j=0;j<2;j++) {
					System.out.println("\n"+C[i][j]);
				}
			}
		}
		
		if(op==3) {
			for(i=0; i<2; i++) {
				for (j=0; j<2; j++) {
					C [i][j]= A[i][j] + constante ;
					D[i][j]= B[i][j] + constante;
				}
			}

			System.out.println ("A matriz A com a constante é: ");
			for(i=0; i<2; i++) {
				for (j=0;j<2;j++) {
					System.out.println("\n"+C[i][j]);
				}
			}
			System.out.println ("A matriz B com a constante é: ");
			for(i=0; i<2; i++) {
				for (j=0;j<2;j++) {
					System.out.println("\n"+D[i][j]);
				}
			}
		}
		
		if(op==4) {
			
			System.out.println ("A matriz A é: ");
			for(i=0; i<2; i++) {
				for (j=0;j<2;j++) {
					System.out.println("\n"+A[i][j]);
				}
			}
			System.out.println ("A matriz B com a constante é: ");
			for(i=0; i<2; i++) {
				for (j=0;j<2;j++) {
					System.out.println("\n"+B[i][j]);
				}
			}
		}
		
	}




}


