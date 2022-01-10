package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Ol� pessoal".charAt(4));

		String s = "Boa tarde";
		// Concatena a vari�vel com algo
		System.out.println(s.concat("ljkahwd"));
		// Outra forma de concatenar
		System.out.println(s + "ljkahwd");
		// Indica se come�a com "Boa" (retorna boolean)
		System.out.println(s.startsWith("Boa"));
		// Altera pra caixa alta e v� se come�a com "BOA"(retorna boolean)
		System.out.println(s.toUpperCase().startsWith("BOA"));
		// Altera pra caixa alta e v� se termina com "BOA"(retorna boolean)
		System.out.println(s.toUpperCase().endsWith("BOA"));
		// Indica a posi��o no range de "oa"(retorna boolean)
		System.out.println(s.indexOf("oa"));
		// Verifica se � igual a "Boa tarde"
		System.out.println(s.equals("Boa tarde"));
		// Verifica se � igual a "Boa tarde" independente do case
		System.out.println(s.equalsIgnoreCase("bOa TarDe"));
		// Verifica se � vazio
		System.out.println(s.isEmpty());
		// Cria uma substring da string das posi��es 2 a 5
		System.out.println(s.substring(2, 6));
		// Repete a string 50 vezes
		System.out.println(s.repeat(50));
		
		// Abaixo vemos a infer�ncia de tipos, que vem a partir do JAVA 11
		var nome = "Jean Carlos";
		var sobrenome = "Fragoso";
		var salario = 132.87;

		// Aqui com printf, uso atalhos para ficar mais f�cil citar as vari�veis
		System.out.printf("O senhor %s %s recebe R$%.2f de sal�rio mensalmente.", nome, sobrenome, salario);
	}
}
