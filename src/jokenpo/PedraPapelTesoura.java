package jokenpo;

import java.util.Random;
import java.util.Scanner;

public class PedraPapelTesoura {

	public static void main(String[] args) {

		Random sorteio = new Random();
		int numeroSorteado = sorteio.nextInt(3) + 1;

		Scanner leitor = new Scanner(System.in);

		int escolha;
		
		System.out.println("****************************************************************************");
		System.out.println("*************************PEDRA=1**PAPEL=2**TESOURA=3************************");
		System.out.println("****************************************************************************");
		System.out.println();

		System.out.println("Lembre-se, este jogo vale o destino da Terra. Fa�a sua escolha, humano! ");
		escolha = leitor.nextInt();
		leitor.close();

		System.out.println("----------------------------------------------------------------------------");

		// Exibindo a escolha do usu�rio
		if (escolha == 1) {
			System.out.println("Voc� escolheu PEDRA!");

		} else if (escolha == 2) {
			System.out.println("Voc� escolheu PAPEL!");

		} else if (escolha == 3) {
			System.out.println("Voc� escolheu TESOURA!");

		} else {
			System.out.println("Voc� n�o escolheu nenhuma das tr�s op��es!");
		}

		// Exibindo a ecolha da m�quina
		if (numeroSorteado == 1) {
			System.out.println("As m�quinas escolheram PEDRA!");

		} else if (numeroSorteado == 2) {
			System.out.println("As m�quinas escolheram PAPEL!");

		} else {
			System.out.println("As m�quinas escolheram TESOURA!");

		}

		System.out.println();
		System.out.println("*****************************************");

		// Determinando o resultado

		if (escolha == 1 || escolha == 2 || escolha == 3) {

			if (escolha == 1 && numeroSorteado == 3) {
				System.out.println("A humanidade ganhou, mas apenas dessa vez!!");

			} else if (numeroSorteado == 1 && escolha == 3) {
				System.out.println("As m�quinas venceram, hahaha!!");

			} else if (escolha > numeroSorteado) {
				System.out.println("A humanidade ganhou, mas apenas dessa vez!!");

			} else if (numeroSorteado > escolha) {
				System.out.println("As m�quinas venceram, hahaha!!");

			} else {
				System.out.println("Empatamos, grr!");
			}

		} else {
			System.out.println("A humanidade perdeu porque voc� n�o soube escolher!");
		}

	}
}
