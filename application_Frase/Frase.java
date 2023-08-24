package application_Frase;

import java.util.Scanner;

import entites_Frase.CounterFrase;

public class Frase {

	public static void main(String[] args) {
		/*Faça um programa que leia uma frase, calcule e mostre o número de vogais existentes.*/
		Scanner sc = new Scanner(System.in);
		CounterFrase counterFrase = new CounterFrase();
		System.out.print("Digite a frase: ");
		counterFrase.frase = sc.nextLine();
		
		System.out.printf("O numero de vogais digitados frase eh: "+ counterFrase.contadorDeVogaisFrase() );
		
		
		sc.close();
	}

}
