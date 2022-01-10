package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
	System.out.print ("DIGITE SEU NOME: ");
	String nome = entrada.nextLine();
	
	System.out.print ("DIGITE SEU SOBRENOME: ");
	String sobrenome = entrada.nextLine();
	
	System.out.print ("DIGITE SE ENDEREÇO: ");
	String endereco = entrada.nextLine();
	
	System.out.print ("DIGITE SEU TELEFONE: ");
	String telefone = entrada.nextLine();
	
	System.out.print ("DIGITE SEU SALÁRIO: ");
	double salario = entrada.nextDouble();
	
	System.out.print ("DIGITE SUA IDADE: ");
	int idade = entrada.nextInt();
	int anonascimento = 2021-idade;
	
	
	System.out.printf("%n%n*** Bem vindo ao sistema senhor %s %s!%n%n*** Pelo que identifiquei, o senhor tem %d anos (ou seja, nasceu em %d).%n%n*** Reside em %s.%n%n*** E pelo que vi aqui, ganha %.2f reais, muito bom.%n%n*** Pra finalizar seu telefone é %s não é mesmo?%n%n", nome,sobrenome,idade,anonascimento,endereco,salario,telefone);
	
	entrada.close();
	}

}
