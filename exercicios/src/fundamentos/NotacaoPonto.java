package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		// Colocando ponto na frente de um tipo n�o primitivo, temos acesso � op��es;
		String s = "Bom dia X";
		// A vari�vel precisa ser adicionada � op��o.
		s = s.replace("X", "Senhora");
		s = s.concat(" Aeeeeeehoooo  " + "\n");
		s = s.toUpperCase();
		s = s.repeat(98);

		System.out.println(s);

		// Desse modo tamb�m temos acesso �s nota��es ponto
		String x = "Jean".toUpperCase();
		System.out.println(x);

		// Essa � uma boa forma de identar diversas nota��es ponto
		String y = "Bom dia cara".replace("cara", "Jean Carlos").concat(" Fragoso").toUpperCase();

		System.out.println(y);
	}
}
