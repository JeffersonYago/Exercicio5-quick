package controller;

import quickSort.library.Quicksort;

public class ResController {

	public ResController() {
		super();
	}
	public void Res(int[] vet) {
		Quicksort qck = new Quicksort();
		int tamanho = vet.length;
		qck.QuickSort(vet, 0, tamanho-1);
		for(int i = 0; i < tamanho; i++) {
			System.out.print(" "+vet[i]+" ");
		}
		System.out.println("");
	}
}
