package conversorMoeda;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;



public class Principal {
	
	static Funcao moeda = new Funcao();
	       
	
	//caixa de input
	public static void main(String[] args) {
		
		String opcao = JOptionPane.showInputDialog(null, "Escolha uma opção", "Conversor",JOptionPane.PLAIN_MESSAGE,
				null, new Object[] {"Conversor de Moeda"},"Escolha").toString();
				
		
			switch(opcao) {
			case "Conversor de Moeda":
				String input = JOptionPane.showInputDialog("Insira um valor");
				//converter string em numero double
				
				Pattern p = Pattern.compile("[A-Z, a-z, &%$#@()*^]");
				Matcher m = p.matcher(input);
				if (m.find()) {
					JOptionPane.showMessageDialog(null, "SOMENTE NÚMEROS", "Alert", JOptionPane.ERROR_MESSAGE);
				}
				double valorInserido = Double.parseDouble(input);
				moeda.Converter(valorInserido);
				
				int resposta = JOptionPane.showConfirmDialog(null,"Deseja continuar?");
				if (JOptionPane.OK_OPTION == resposta) {
					System.out.println("Escolha Yes");
				} else {
					JOptionPane.showMessageDialog(null, "Programa Finalizado!");
				}
			}
	 
   }
}
