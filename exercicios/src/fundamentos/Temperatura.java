package fundamentos;
/**
 * Desafio de convers�o de medidas de temperatura
 * @author Jean
 */
public class Temperatura {
	
	public static void main(String[] args) {
//		Informo o valor em farenheit
		double farenheit = 200;
//		Esse � o ajuste pra diminuir 32
		final double AJUSTE = 32;
//		Esse fator � a segunda parte da conta
		final double FATOR = 5.0/9;
//		O valor final � calculado aqui
		double celsius = (farenheit - AJUSTE) * FATOR;
//		A concatena��o final exibir� o resultado da convers�o
		System.out.println("A temperatura de " + farenheit + " graus Farenheit, corresponde � " + celsius + " graus celsius");
	}
}
