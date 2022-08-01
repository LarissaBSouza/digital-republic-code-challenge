package br.com.modelos;

public class LatasUtilizadas {

	private Double litrosUsados; // Litros que a aplicação irá fornecer.
	private Integer litros18; // Quantidade de latas que o usuário irá precisar e que serão fornecidas pela
								// aplicação.
	private Integer litros3; // Quantidade de latas que o usuário irá precisar e que serão fornecidas pela
								// aplicação.
	private Integer litros2; // Quantidade de latas que o usuário irá precisar e que serão fornecidas pela
								// aplicação.
	private Integer litros0; // Quantidade de latas que o usuário irá precisar e que serão fornecidas pela
								// aplicação.

	// Método que retorna os detalhes de cada tinta que ele irá precisar.
	public void mostrarDetalhes() {
		System.out.println("Serão necessárias estas quantidades de latas de tinta: ");
		System.out.println("Ao todo será preciso " + litrosUsados + " litros de tinta, entre eles: ");
		System.out.println("Lata de 18L: " + litros18);
		System.out.println("Lata de 3.6L: " + litros3);
		System.out.println("Lata de 2.5L: " + litros2);
		System.out.println("Lata de 0.5: " + litros0);
	}
	
	public void calculoTintas(Double litrosNecessarios) {

		Integer contador18 = 0; // Contador de latas de 18L
		Integer contador3 = 0; // Contador de latas de 3.6L
		Integer contador2 = 0; // Contador de latas de 2.5L
		Integer contador0 = 0; // Contador de latas de 0.5L

		System.out.println("");
		System.out.println("");

		// Instância do meu objeto, onde serão atribuídas as quantidades necessárias de
		// latas.
		LatasUtilizadas latasUtilizadas = new LatasUtilizadas();

		// Setando a quantidade necessária de tinta.
		latasUtilizadas.setLitrosUsados(litrosNecessarios);

		Lata lata1 = new Lata(); // Iniciando uma instâcia de lata.
		lata1.setLitrosLata(18.0); // Definindo os litros dessa lata.

		Lata lata2 = new Lata(); // Iniciando uma instância de lata.
		lata2.setLitrosLata(3.6); // Definindo os litros dessa lata.

		Lata lata3 = new Lata(); // Iniciando uma instância de lata.
		lata3.setLitrosLata(2.5); // Definindo os litros dessa lata.

		Lata lata4 = new Lata(); // Iniciando uma instância de lata.
		lata4.setLitrosLata(0.5); // Definindo os litros dessa lata.

		// Estrutura de repetição que enquanto os litros necessários
		// não forem menor do que a quantidade de litros da maior lata
		// ele continuará subtraindo o valor até que saia desta condição.

		while (litrosNecessarios - lata1.getLitrosLata() >= 0) {
			litrosNecessarios -= lata1.getLitrosLata();
			contador18++;
			latasUtilizadas.setLitros18(contador18);
		}

		while (litrosNecessarios - lata2.getLitrosLata() >= 0) {
			litrosNecessarios -= lata2.getLitrosLata();
			contador3++;
			latasUtilizadas.setLitros3(contador3);
		}

		while (litrosNecessarios - lata3.getLitrosLata() >= 0) {
			litrosNecessarios -= lata3.getLitrosLata();
			contador2++;
			latasUtilizadas.setLitros2(contador2);
		}

		while (litrosNecessarios - lata4.getLitrosLata() >= 0) {
			litrosNecessarios -= lata4.getLitrosLata();
			contador0++;
			latasUtilizadas.setLitros0(contador0);
		}

		// Aqui o programa irá apresentar quantas latas ele
		// irá precisar de cada.
		latasUtilizadas.mostrarDetalhes();

	}
	

	// Método para definir os litros necessários.
	public void setLitrosUsados(Double litrosUsados) {
		this.litrosUsados = litrosUsados;
	}

	// Método para definir quantas latas de tinta de 18L serão necessárias
	public void setLitros18(Integer litros18) {
		this.litros18 = litros18;
	}

	// Método para definir quantas latas de tinta de 3.6L serão necessárias
	public void setLitros3(Integer litros3) {
		this.litros3 = litros3;
	}

	// Método para definir quantas latas de tinta de 2.5L serão necessárias
	public void setLitros2(Integer litros2) {
		this.litros2 = litros2;
	}

	// Método para definir quantas latas de tinta de 0.5L serão necessárias
	public void setLitros0(Integer litros0) {
		this.litros0 = litros0;
	}

	

}
