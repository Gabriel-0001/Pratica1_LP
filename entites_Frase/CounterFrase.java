package entites_Frase;

public class CounterFrase {
	public String frase;
	
	public int contadorDeVogaisFrase() {
		int contadorDeVogais = 0;
		frase = frase.toUpperCase();
		for (char l: frase.toCharArray()) {
			if (l == 'A' || l == 'E' || l == 'I' || l == 'O' || l == 'U') {
				contadorDeVogais +=1;
			}
		}
		return contadorDeVogais;
	}

}
