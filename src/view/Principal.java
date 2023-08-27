package view;

import br.edu.fateczl.ordenacao.bubblesort.BubbleSort;
import br.edu.fateczl.ordenacao.mergesort.MergeSort;

public class Principal {

	public static void main(String[] args) {
		MergeSort ms = new MergeSort();
		BubbleSort bs =  new BubbleSort();
		int [] vetor1 = {74, 20, 74, 87, 81, 16, 25, 99, 44, 58};
		int [] vetor2 = {44, 43, 42, 41, 40, 39, 38};
		int tamanho1 = vetor1.length-1;
		int tamanho2 = vetor2.length-1;
		int [] vetor1sort = bs.bubbleSort(vetor1);
		System.out.println("Vetor 1 Bubble Sort: ");
		for(int i = 0; i < tamanho1; i++){
			System.out.print(vetor1sort[i] + " ");
		}
		System.out.println("\nVetor Ordenado\n");
		vetor1sort = ms.mergeSort(vetor1, 0, tamanho1);
		System.out.println("Vetor 1 Merge Sort: ");
		for(int i = 0; i < tamanho1; i++){
			System.out.print(vetor1sort[i] + " ");
		}
		System.out.println("\nVetor Ordenado\n");
		
		int [] vetor2sort = bs.bubbleSort(vetor2);
		System.out.println("Vetor 2 Bubble Sort: ");
		for(int i = 0; i < tamanho2; i++){
			System.out.print(vetor2sort[i] + " ");
		}
		System.out.println("\nVetor Ordenado\n");
		vetor1sort = ms.mergeSort(vetor2, 0, tamanho2);
		System.out.println("Vetor 2 Merge Sort: ");
		for(int i = 0; i < tamanho2; i++){
			System.out.print(vetor2sort[i] + " ");
		}
		System.out.println("\nVetor Ordenado\n");

	}

}
