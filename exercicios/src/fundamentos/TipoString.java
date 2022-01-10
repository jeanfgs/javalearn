package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Olá pessoal".charAt(4));

		String s = "Boa tarde";
		// Concatena a variável com algo
		System.out.println(s.concat("ljkahwd"));
		// Outra forma de concatenar
		System.out.println(s + "ljkahwd");
		// Indica se começa com "Boa" (retorna boolean)
		System.out.println(s.startsWith("Boa"));
		// Altera pra caixa alta e vê se começa com "BOA"(retorna boolean)
		System.out.println(s.toUpperCase().startsWith("BOA"));
		// Altera pra caixa alta e vê se termina com "BOA"(retorna boolean)
		System.out.println(s.toUpperCase().endsWith("BOA"));
		// Indica a posição no range de "oa"(retorna boolean)
		System.out.println(s.indexOf("oa"));
		// Verifica se é igual a "Boa tarde"
		System.out.println(s.equals("Boa tarde"));
		// Verifica se é igual a "Boa tarde" independente do case
		System.out.println(s.equalsIgnoreCase("bOa TarDe"));
		// Verifica se é vazio
		System.out.println(s.isEmpty());
		// Cria uma substring da string das posições 2 a 5
		System.out.println(s.substring(2, 6));
		// Repete a string 50 vezes
		System.out.println(s.repeat(50));
		
		// Abaixo vemos a inferência de tipos, que vem a partir do JAVA 11
		var nome = "Jean Carlos";
		var sobrenome = "Fragoso";
		var salario = 132.87;

		// Aqui com printf, uso atalhos para ficar mais fácil citar as variáveis
		System.out.printf("O senhor %s %s recebe R$%.2f de salário mensalmente.", nome, sobrenome, salario);
	}
}
