package br.edu.fateczl.calc;

public class BubbleSort {
	
	public int[] sort(int[] vetor) {

	        int tamanho = vetor.length;
	        boolean houveTroca;

	        for (int i = 0; i < tamanho - 1; i++) {

	            houveTroca = false;

	            for (int j = 0; j < tamanho - 1 - i; j++) {

	                if (vetor[j] > vetor[j + 1]) {

	                    int auxiliar = vetor[j];
	                    vetor[j] = vetor[j + 1];
	                    vetor[j + 1] = auxiliar;

	                    houveTroca = true;
	                }
	            }

	            if (!houveTroca) {
	                break;
	            }
	        }

	        return vetor;
	
}
}
