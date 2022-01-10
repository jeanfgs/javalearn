package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		// Colocando ponto na frente de um tipo não primitivo, temos acesso à opções;
		String s = "Bom dia X";
		// A variável precisa ser adicionada à opção.
		s = s.replace("X", "Senhora");
		s = s.concat(" Aeeeeeehoooo  " + "\n");
		s = s.toUpperCase();
		s = s.repeat(98);

		System.out.println(s);

		// Desse modo também temos acesso às notações ponto
		String x = "Jean".toUpperCase();
		System.out.println(x);

		// Essa é uma boa forma de identar diversas notações ponto
		String y = "Bom dia cara".replace("cara", "Jean Carlos").concat(" Fragoso").toUpperCase();

		System.out.println(y);
	}
}
