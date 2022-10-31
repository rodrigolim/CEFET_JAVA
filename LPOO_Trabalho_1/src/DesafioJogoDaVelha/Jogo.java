package DesafioJogoDaVelha;

import java.util.Scanner;

public class Jogo {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		Controle c = new Controle();
		String posicao;
		int valida = 0,jogadas = 0;

		System.out.println("\n");
		System.out.println("JOGADOR-1:|X| JOGADOR-2:|O|");
		System.out.println("\n");
		System.out.println("        _1_|_2_|_3_       ");
		System.out.println("        _4_|_5_|_6_       ");
		System.out.println("         7 | 8 | 9        ");
		System.out.println("\n");

		while (true) {

			do {
				System.out.println("Jogador 1,com base no tabuleiro apresentado,informe a posicao que deseja:");
				posicao = scanf.next();
				while (!c.Confere(posicao)) {
					System.out.println("jogada invalida!\nTente novamente.");
					System.out.println("Jogador 1,com base no tabuleiro apresentado,informe a posicao que deseja:");
					posicao = scanf.next();
					valida = 0;
				}
				c.Jogada(posicao, "x");
				valida = 1;

			} while (valida == 0);
			jogadas++;
			valida = 0;
			c.Exibir();
			if (!c.Vencedor(jogadas).equals("null")) {
				break;
			}
			do {
				System.out.println("Jogador 2,com base no tabuleiro apresentado,informe a posicao que deseja:");
				posicao = scanf.next();
				while (!c.Confere(posicao)) {
					System.out.println("jogada invalida!\nTente novamente.");
					System.out.println("Jogador 2,com base no tabuleiro apresentado,informe a posicao que deseja:");
					posicao = scanf.next();
					valida = 0;
				}
				c.Jogada(posicao, "o");
				valida = 1;

			} while (valida == 0);
			jogadas++;
			valida = 0;
			c.Exibir();
			if (!c.Vencedor(jogadas).equals("null")) {
				break;

			}

		}
		System.out.println("Fim de jogo! Resultado: " + c.Vencedor(jogadas));
	}

}