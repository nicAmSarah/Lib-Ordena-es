package br.edu.fateczl.calc;

public class MergeSort {

    	public int[] sort(int[] vet) {
    		
        return mergeSort(vet, 0, vet.length - 1);
    }
    

    private int[] mergeSort(int[] vet, int inicio, int fim) {

        if (inicio < fim) {

            int meio = (inicio + fim) / 2;

            mergeSort(vet, inicio, meio);

            mergeSort(vet, meio + 1, fim);

            intercala(vet, inicio, meio, fim);
        }

        return vet;
    }

    private void intercala(int[] vet, int inicio, int meio, int fim) {

        int tamanho = vet.length;
        int[] aux = new int[tamanho];

        for (int i = inicio; i <= fim; i++) {
        	aux[i] = vet[i];
        }

        int esquerda = inicio;
        int direita = meio + 1;

        for (int cont = inicio; cont <= fim; cont++) {

            if (esquerda > meio) {
            	vet[cont] = aux[direita];
                direita++;

            } else if (direita > fim) {
            	vet[cont] = aux[esquerda];
                esquerda++;

            } else if (aux[esquerda] <= aux[direita]) {
            	vet[cont] = aux[esquerda];
                esquerda++;

            } else {
            	vet[cont] = aux[direita];
                direita++;
            }
        }
    }
}