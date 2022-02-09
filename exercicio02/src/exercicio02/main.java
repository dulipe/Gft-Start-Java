package exercicio02;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int multiplicando, inicio, fim;
		
		System.out.println("Digite o n�mero do multiplicando: ");
		multiplicando = entrada.nextInt();
		validarNumero(multiplicando);
		
		System.out.println("Digite o n�mero inicio do intervalo: ");
		inicio = entrada.nextInt();
		validarNumero(inicio);
			
		System.out.println("Digite o n�mero do fim do intervalo: ");
		fim = entrada.nextInt();
		validarNumero(fim);
		if(fim <= inicio) {
			System.err.println("Fim do intervalo n�o pode ser menor ou igual ao inicio do intervalo");
			System.exit(0);
		} else if (fim - inicio > 10) {
			System.err.println("Diferen�a do intervalo inicio e fim n�o pode ser maior que 10");
			System.exit(0);
		}
			
		System.out.println("Multiplicando: " + multiplicando);
		System.out.println("Inicio do intervalo: " + inicio);
		System.out.println("Fim do intervalo: " + fim);
		
		for(int i = inicio; i <= fim; i++) {
			System.out.println(multiplicando + " x " + i + " = " + multiplicando * i);
		}
		
	}
	
	 private static void validarNumero(int numero) {
	        if (numero < 0 | numero > 5000) {
	            System.err.println("N�mero n�o pode ser negativo nem maior que 5000");
	            System.exit(0);
	        }
	    }

}
