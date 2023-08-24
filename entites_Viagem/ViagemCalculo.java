package entites_Viagem;

public class ViagemCalculo {
	public double tempo;
	public int velocidade_media;
	public int km_por_litro;
	
	public double valor_tot_combustivel() {
		double km_percorrido = tempo * velocidade_media;
		return  km_percorrido/km_por_litro;
	}

	
}
