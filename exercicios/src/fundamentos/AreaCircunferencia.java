package fundamentos;

public class AreaCircunferencia {
	
	//� obrigat�rio sempre come�ar pelo MAIN
	public static void main(String[] args) {
		//Para declarar uma vari�vel o padr�o � [tipo nome =valor;]
		//int � para n�mero inteiro
		//double � para n�mero quebrado
		//final na frente indica CONSTANTE, que deve ser mai�scula
		double raio = 3.4;
		final double PI = 3.14159;
		double area = (PI * (raio * raio));
		
		System.out.println(area);
		
		//Aqui j� usando uma vari�vel previamente
		raio = 10;
		area = (PI * raio * raio);
		
		//Usando "+" para concatenar string com vari�vel
		System.out.println("A �rea da circunfer�ncia � " + area + " metros quadrados!");
	}
}
