/*1- Faça um programa que possua um vetor denominado A que armazene 6 números inteiros. O programa deve executar os seguintes passos: 
(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. 
(b) Armazene em uma variável inteira (simples) a soma entre os valores das posições A[0], A[1] e A[5] do vetor e mostre na tela esta soma. 
 */


package Lista4;

public class Atividade_1 {

	public static void main(String[] args) {

		int [] vetor = new int [6];
		int x, soma=0;

		//Armazenar nos vetores
		vetor [0]=1;
		vetor [1]=0;
		vetor [2]=5;
		vetor [3]=-2;
		vetor [4]=-5;
		vetor [5]=7;

		soma= vetor [0] + vetor [1] + vetor [5];

		System.out.println("A soma é: "+soma);

		vetor [4]=100;
		
		System.out.println("\n O vetor é: ");
		for (x=0; x<6; x++) {
			
			System.out.println("\n"+vetor[x]);
		}
	}

}
