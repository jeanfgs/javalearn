package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		// Informações do funcionário
		
		// Numéricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 33354212;
		long pontosAcumulados= 2_134_321_223;
		
		// Numéricos Reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_414_465.01;
		
		// Boolean
		boolean estaDeFerias = false;
		
		//Tipo caractere
		char status = 'a';
		
		//Dias de empresa
		System.out.println("São " + anosDeEmpresa * 365 + " anos de empresa");
		
		//Número de viagens
		System.out.println("Um total de " + numeroDeVoos/2 + " viagens");
		
		//Pontos por real
		System.out.println(pontosAcumulados/vendasAcumuladas + " foi a quantia de pontos ganhos por real vendido");

		//Salário do funcionário
		System.out.println("O funcionário " + id + " recebe o valor de: " + salario);

		// Está de férias?
		System.out.println("Está de férias?: " + estaDeFerias);

	    // Status do cadastro
		System.out.println("Status do cadastro: " + "[" + status + "]");

	}
}
