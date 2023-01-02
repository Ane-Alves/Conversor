package conversorMoeda;

import javax.swing.JOptionPane;

public class Funcao {
	
	ConverterMoeda moedas = new ConverterMoeda();
	ConverterMoedaAReal moeda = new ConverterMoedaAReal();
	
	
	//converter a moeda com o valor inserido
	public void Converter(double valorInserido) {
		String opcoes = JOptionPane.showInputDialog(null, "Escolha a moeda para qual vai converter", "Moedas",JOptionPane.PLAIN_MESSAGE,
				null, new Object[] {"Real a Dolar", "Real a Euro", "Real a Libra", "Real a Peso Argentino", "Real a Iene","Dolar a Real","Euro a Real","Libra a Real", "Peso Argentino a Real", "Iene a Real"},"Escolha").toString();
		
		//cases para fazer a conversão
		switch(opcoes) {
			case "Real a Dolar" :
				moedas.ConverterRealADolar(valorInserido);
				break;
			case "Real a Euro":
				moedas.ConverterRealAEuro(valorInserido);
				break;
			case "Real a Libra":
				moedas.ConverterRealALibra(valorInserido);
				break;
			case "Real a Peso Argentino":
				moedas.ConverterRealAPesoArgentino(valorInserido);
				break;
			case "Real a Iene":
				moedas.ConverterRealAIene(valorInserido);
				break;
			//moeda para Real
			case "Dolar a Real":
				moeda.DolarAReal(valorInserido);
				break;
			case "Euro a Real":
				moeda.EuroAReal(valorInserido);
				break;
			case "Libra a Real":
				moeda.LibraAReal(valorInserido);
				break;
			case "Peso Argentino a Real":
				moeda.PesoArgentinoAReal(valorInserido);
				break;
			case "Iene a Real":
				moeda.IeneAReal(valorInserido);
				break;
				
			}
	}
}
