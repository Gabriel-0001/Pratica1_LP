package entites_Carro;

public class CarroOperacoes {
	public int ano_fabricacao;
	public String placa_carro;
	
	public String faixa_estaria_carro() {
		 if (ano_fabricacao <= 2010) {
			return "Carro velho";
		}else if (ano_fabricacao >= 2011 && ano_fabricacao <= 2021) {
			return "Carro semi-novo";
		}else {
			return "Carro novo";
		}
	}
	public String tranforma_placa(){
		placa_carro = placa_carro.toUpperCase();
		StringBuilder novaPlaca = new StringBuilder();
		for (char l: placa_carro.toCharArray()) {
			if(l == 'A' || l == 'E' || l == 'I' || l == 'O' || l == 'U') {
				novaPlaca.append("*");
			}else {
				novaPlaca.append(l);
			}
		}
		return novaPlaca.toString();
	}

}
