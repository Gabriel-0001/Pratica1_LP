package application_Viagem;

import java.util.Locale;
import java.util.Scanner;

import entites_Viagem.ViagemCalculo;

public class Viagem {

	public static void main(String[] args) {
		// Faça um programa que leia o tempo gasto numa viagem (em horas), a velocidade média
		//e o valor km por litro de um veículo. Calcule o consumo final de combustível gasto.
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		ViagemCalculo viagemcalculo = new ViagemCalculo();
		
		System.out.print("Tempo gasto na viagem: ");
		viagemcalculo.tempo = sc.nextDouble();
		System.out.print("Velocidade média: ");
		viagemcalculo.velocidade_media = sc.nextInt();
		System.out.print("Valor (km) por litro: ");
		viagemcalculo.km_por_litro = sc.nextInt();
		
		System.out.printf("Valor total de combustível gasto na viagem em litros foi: %.1f%n ", viagemcalculo.valor_tot_combustivel());
		sc.close();

	}

}
