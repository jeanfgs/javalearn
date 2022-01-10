package fundamentos;

public class AreaCircunferencia {
	
	//É obrigatório sempre começar pelo MAIN
	public static void main(String[] args) {
		//Para declarar uma variável o padrão é [tipo nome =valor;]
		//int é para número inteiro
		//double é para número quebrado
		//final na frente indica CONSTANTE, que deve ser maiúscula
		double raio = 3.4;
		final double PI = 3.14159;
		double area = (PI * (raio * raio));
		
		System.out.println(area);
		
		//Aqui já usando uma variável previamente
		raio = 10;
		area = (PI * raio * raio);
		
		//Usando "+" para concatenar string com variável
		System.out.println("A área da circunferência é " + area + " metros quadrados!");
	}
}
