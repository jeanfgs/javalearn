package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		// Informa��es do funcion�rio
		
		// Num�ricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 33354212;
		long pontosAcumulados= 2_134_321_223;
		
		// Num�ricos Reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_414_465.01;
		
		// Boolean
		boolean estaDeFerias = false;
		
		//Tipo caractere
		char status = 'a';
		
		//Dias de empresa
		System.out.println("S�o " + anosDeEmpresa * 365 + " anos de empresa");
		
		//N�mero de viagens
		System.out.println("Um total de " + numeroDeVoos/2 + " viagens");
		
		//Pontos por real
		System.out.println(pontosAcumulados/vendasAcumuladas + " foi a quantia de pontos ganhos por real vendido");

		//Sal�rio do funcion�rio
		System.out.println("O funcion�rio " + id + " recebe o valor de: " + salario);

		// Est� de f�rias?
		System.out.println("Est� de f�rias?: " + estaDeFerias);

	    // Status do cadastro
		System.out.println("Status do cadastro: " + "[" + status + "]");

	}
}
