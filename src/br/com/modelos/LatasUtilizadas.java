package br.com.modelos;

public class LatasUtilizadas {

	private Double litrosUsados; //Litros que a aplicação irá fornecer.
	private Integer litros18; //Quantidade de latas que o usuário irá precisar e que serão fornecidas pela aplicação.
	private Integer litros3; //Quantidade de latas que o usuário irá precisar e que serão fornecidas pela aplicação.
	private Integer litros2; //Quantidade de latas que o usuário irá precisar e que serão fornecidas pela aplicação.
	private Integer litros0; //Quantidade de latas que o usuário irá precisar e que serão fornecidas pela aplicação.
	
	
	//Método que retorna os detalhes de cada tinta que ele irá precisar.
	public void mostrarDetalhes() {
		System.out.println("Serão necessárias estas quantidades de latas de tinta: ");
		System.out.println("Ao todo será preciso " + litrosUsados + " litros de tinta, entre eles: ");
		System.out.println("Lata de 18L: " + litros18);
		System.out.println("Lata de 3.6L: " + litros3);
		System.out.println("Lata de 2.5L: " + litros2);
		System.out.println("Lata de 0.5: " + litros0);
	}
	
	
	//Método para definir os litros necessários.
	public void setLitrosUsados(Double litrosUsados) {
		this.litrosUsados = litrosUsados;
	}
	
	//Método para definir quantas latas de tinta  de 18L serão necessárias
	public void setLitros18(Integer litros18) {
		this.litros18 = litros18;
	}

	//Método para definir quantas latas de tinta  de 3.6L serão necessárias
	public void setLitros3(Integer litros3) {
		this.litros3 = litros3;
	}

	//Método para definir quantas latas de tinta  de 2.5L serão necessárias
	public void setLitros2(Integer litros2) {
		this.litros2 = litros2;
	}

	//Método para definir quantas latas de tinta  de 0.5L serão necessárias
	public void setLitros0(Integer litros0) {
		this.litros0 = litros0;
	}
	
}
