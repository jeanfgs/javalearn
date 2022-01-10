package fundamentos;

//Importações devem ficar fora das classes
//Usar CTRL + Espaço faz com que os imports necessários ocorram automaticamente

import java.util.Date;

//import javax.swing.JButton;

public class Import {
	public static void main(String[] args) {
		String s = "Bom dia!";
		
		// Para usar o Date, precisei importar
		Date d = new Date();
		System.out.println(d + " Essa é a data atual tenha um " + s);
		
		// Importou automaticamente por ser bem básico e aparece em todas as classes
//		JButton botao = new JButton();
	}
}
