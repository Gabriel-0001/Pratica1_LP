package application_carro;

import java.util.Scanner;

import entites_Carro.CarroOperacoes;

public class Carro {

	public static void main(String[] args) {
		/*Faça um programa que leia a placa de um carro e o ano de fabricação. Em seguida,
		validar a situação do carro:
		Se o ano for menor que 2010 imprimir: Carro Velho
		Se o ano estiver entre 2011 e 2021 imprimir: Carro Semi novo
		Se o ano for igual a 2022 imprimir: Carro Novo
		O programa deverá substituir as vogais (a, e, i o e u maiúscula e minúscula) da placa
		pelo caractere *, e posteriormente imprimir a placa.*/
		
		Scanner sc = new Scanner(System.in);
		CarroOperacoes carroOperacoes = new CarroOperacoes();
		
		System.out.print("Digite o ano de fabricação do carro: ");
		carroOperacoes.ano_fabricacao = sc.nextInt();
		System.out.print("Digite a placa do carro: ");
		carroOperacoes.placa_carro = sc.nextLine();
		
		System.out.println(carroOperacoes.faixa_estaria_carro());
		System.out.printf("Placa modificada: %S%n", carroOperacoes.tranforma_placa());
		
		sc.close();

	}

}
