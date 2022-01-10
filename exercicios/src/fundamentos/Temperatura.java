package fundamentos;
/**
 * Desafio de conversão de medidas de temperatura
 * @author Jean
 */
public class Temperatura {
	
	public static void main(String[] args) {
//		Informo o valor em farenheit
		double farenheit = 200;
//		Esse é o ajuste pra diminuir 32
		final double AJUSTE = 32;
//		Esse fator é a segunda parte da conta
		final double FATOR = 5.0/9;
//		O valor final é calculado aqui
		double celsius = (farenheit - AJUSTE) * FATOR;
//		A concatenação final exibirá o resultado da conversão
		System.out.println("A temperatura de " + farenheit + " graus Farenheit, corresponde à " + celsius + " graus celsius");
	}
}
