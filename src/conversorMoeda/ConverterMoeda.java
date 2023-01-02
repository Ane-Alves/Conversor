package conversorMoeda;

import javax.swing.JOptionPane;

public class ConverterMoeda {
	//classe que converte Real para outra moeda
	
		public void ConverterRealADolar(double valor) {
			double moedaDolar = valor / 5.28;
			moedaDolar = (double) Math.round(moedaDolar * 100d) / 100;
			JOptionPane.showMessageDialog(null, "Você tem $ " + moedaDolar + "Dólares" );
			
		}
		
		public void ConverterRealAEuro(double valor) {
			double moedaEuro = valor / 5.63;
			moedaEuro = (double) Math.round(moedaEuro * 100d) / 100;
			JOptionPane.showMessageDialog(null, "Você tem $ " + moedaEuro + "Euros" );
			
		}
		
		public void ConverterRealALibra(double valor) {
			double moedaLibra = valor / 6.39 ;
			moedaLibra =(double)Math.round(moedaLibra * 100d) / 100;
			JOptionPane.showMessageDialog(null, "Você tem $ " + moedaLibra + "Libras");
		}
		
		public void ConverterRealAPesoArgentino(double valor) {
			double moedaPesoArgentino = valor / 33.43;
			moedaPesoArgentino = (double) Math.round(moedaPesoArgentino * 100d) / 100;
			JOptionPane.showMessageDialog(null, "Você tem $ " + moedaPesoArgentino + "Pesos Argentinos" );
			
		}
		
		public void ConverterRealAIene(double valor) {
			double moedaIene = valor / 24.83;
			moedaIene = (double) Math.round(moedaIene * 100d) / 100;
			JOptionPane.showMessageDialog(null, "Você tem $ " + moedaIene + " Ienes" );
			
		}
	
}
