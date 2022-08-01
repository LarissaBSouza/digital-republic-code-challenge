package br.com.testes;

import java.util.ArrayList;
import java.util.Scanner;

import br.com.modelos.Lata;
import br.com.modelos.LatasUtilizadas;

@SuppressWarnings("unused")
public class App {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		App.inicioPrograma();

	}

	public static void inicioPrograma() {
		
		// INICIALIZAÇÃO DAS VARIÁVEIS LOCAIS.

		// Lista que irá armazenar todas as alturas digitadas pelo usuário
		ArrayList<Double> alturas = new ArrayList<Double>();
		Double altura;

		// Lista que irá armazenar todas as larguras digitadas pelo usuário
		ArrayList<Double> larguras = new ArrayList<Double>();
		Double largura;

		// Lista que irá armazenar as áreas de cada parede já calculadas
		ArrayList<Double> paredes = new ArrayList<Double>();

		Integer portas = 0; // Contador de portas
		Integer janelas = 0; // Contador de janelas

		Double areaTotal; // Área total do cômodo já calculada.

		Double areaAmbiente = 0.0; // Reatribuição da váriavel de área total.

		Integer contador18 = 0; // Contador de latas de 18L
		Integer contador3 = 0; // Contador de latas de 3.6L
		Integer contador2 = 0; // Contador de latas de 2.5L
		Integer contador0 = 0; // Contador de latas de 0.5L
		
		// FIM DAS VARIÁVEIS LOCAIS.
		
		
		
		// INÍCIO DO PROGRAMA

		System.out.println("*******************************");
		System.out.println("*******************************");
		System.out.println("**                           **");
		System.out.println("**                           **");
		System.out.println("**   Calculadora de Tinta    **");
		System.out.println("**                           **");
		System.out.println("**                           **");
		System.out.println("*******************************");
		System.out.println("*******************************");
		System.out.println("");

		// Estrutura de Repetição que irá condicionar o usuário as mesmas perguntas 4
		// vezes, sendo elas
		// a altura, a largura, se possui portas, e se possui janelas.
		for (int i = 1; i < 5; i++) {

			boolean contagemAltura = true; // validação que quando for true, reinicia a aplicação
			boolean contagemLargura = true; // validação que quando for true, reinicia a aplicação

			System.out.println("*******************************");
			
			// Informa o usuário em qual parede se refere as perguntas.
			System.out.println("********* PAREDE " + i + " ************");

			
			// Condicional que irá validar as informações enquanto for false,
			// do contrário, reinicia a aplicação.
			while (contagemAltura && contagemLargura) {

				System.out.println("Digite a altura da parede " + i + ": ");
				
				String alturaStr = sc.next(); // Recebendo os dados como string para diminuição de
				// possíveis erros.
				
				altura = Double.parseDouble(alturaStr.replace(",", "."));
				// Fazendo a conversão dos dados recebidos do usuário para double.
				// A aplicação irá aceitar entradas com ponto e com vírgula.

				alturas.add(altura);
				// Adicionando a altura recebida a lista declarada acima.


				// Validação se é uma altura permitida, caso não,
				// o programa irá começar tudo novamente.
				if (altura < 2.20) {
					System.out.println("Altura inválida");
					System.out.println("Digite uma altura válida. Lembre-se "
							+ "que portas possuem uma altura de 1.90 e necessitam de "
							+ "uma folga de 30cm acima delas.) ");
					contagemAltura = true;
					App.inicioPrograma();

				} else {
					contagemAltura = false;
				}

				System.out.println("Digite a largura da parede " + i + ": ");
				String larguraStr = sc.next(); // Recebendo os dados como String para
				// diminuiçaõ de possíveis erros.

				largura = Double.parseDouble(larguraStr.replace(",", "."));
				// Fazendo a conversão dos dados recebidos do usuário para double.
				// A aplicação irá aceitar entradas com ponto e com vírgula.

				larguras.add(largura);
				// Adicionando a largura recebida a lista declarada acima.


				// Validação se é uma largura permitida, caso não,
				// o programa irá recomeçar.
				if (largura < 1.00 && largura > 15.0) {
					System.out.println("Largura inválida");
					System.out.println(
							"Digite uma largura válida. A largura deve ser maior que" + " 1m e menor que 15m.)");
					contagemLargura = true;
					App.inicioPrograma();

				} else {
					contagemLargura = false;
				}

				// Pergunta de sim ou não se o usuário gostaria de declarar portas nessa parede.
				System.out.println("A parede " + i + " possui portas? S/N ");
				char porta = sc.next().charAt(0);

				// Condicional que se caso o usuário digitar 's', a aplicação
				// irá perguntar quantas portas existem. Caso digite 'n', ele definirá
				// a quantidade de portas como 0. E se não digitar nenhum dos dados esperados
				// a aplicação irá retornar um "Opção Inválida".
				if (porta == 's') {

					System.out.println("Quantas portas possuem na parede " + i + "? ");
					portas = sc.nextInt();

				} else if (porta == 'n') {

					portas = 0;
				} else {

					System.out.println("Opção Inválida!");
					App.inicioPrograma();
				}

				// Cálcula da área das portas.
				Double areaPorta = portas * 1.52;

				// Pergunta de sim ou não se o usuário gostaria de declarar janelas nessa
				// parede.
				System.out.println("A parede " + i + " possui janelas? S/N ");

				char janela = sc.next().charAt(0);

				// Condicional que se caso o usuário digitar 's', a aplicação
				// irá perguntar quantas janelas existem. Caso digite 'n', ele definirá
				// a quantidade de janelass como 0. E se não digitar nenhum dos dados esperados
				// a aplicação irá retornar um "Opção Inválida".
				if (janela == 's') {

					System.out.println("Quantas janelas possuem na parde " + i + "? ");
					janelas = sc.nextInt();

				} else if (janela == 'n') {

					janelas = 0;

				} else {

					System.out.println("Opção Inválida!");
					App.inicioPrograma();
				}

				// Cálculo área das janelas.
				Double areaJanela = janelas * 2.40;

				// Cálculo da área da parede.
				Double areaParede = altura * largura;

				// Soma das áreas de paredes e portas
				Double areaTotalJeP = areaPorta + areaJanela;


				// Validação se a área de paredes e portas ultrapassam 50% da área total
				// da parede, onde se ultrapassar, a aplicação é reiniciada.
				if (areaTotalJeP > areaParede * 50 / 100) {
					System.out.println("");
					System.out.println("O total de área das portas e janelas"
							+ " deve ser no máximo 50% da área de parede. " + "Tente Novamente!");
					System.out.println("");
					App.inicioPrograma();
				}

				// Área total da parede levando em considerção agora, as áreas de janelas e
				// portas.
				Double areaTotalParede = areaParede - areaTotalJeP;


				// Validação se a parede é maior que 1m² e menor que 50m², se ultrapassado essas
				// medidas
				// a aplicação reinicia.
				if (areaTotalParede < 1.0 || areaTotalParede > 50.0) {
					System.out.println("A área da sua parede não pode ser menor que 1m², e nem maior que 50m²");
					contagemAltura = true;
					contagemLargura = true;
					App.inicioPrograma();
				}

				// Área total da parede sendo adicionada a lista de paredes.
				paredes.add(areaTotalParede);

				// Váriavel que ira conter a soma das áreas de todas as paredes.
				areaTotal = 0.0;

				// Estrutura de repetição que irá ir somando as áreas da paredes que estão na
				// lista.
				for (Double parede : paredes) {
					areaTotal += parede.doubleValue();
				}

				// Listagem das áreas contidas na lista paredes.
//				System.out.println("As áreas das suas paredes são: " + paredes);
//				System.out.println("");

				// Áreal total do meu ambiente já considerando possíveis janelas, e portas.
				System.out.println("A área total do seu ambiente é de " + areaTotal);

				// Reatribuição de váriavel para utilizá-la em outro escopo.
				areaAmbiente = areaTotal;

			}
		}

		// Cálculo para saber a quantidade exata de tinta que será necessária.
		Double litrosNecessarios = Math.ceil(areaAmbiente / 5);

		System.out.println("");
		System.out.println("");

		// Instância do meu objeto, onde serão atribuídas as quantidades necessárias de
		// latas.
		LatasUtilizadas latasUtilizadas = new LatasUtilizadas();

		// Setando a quantidade necessária de tinta.
		latasUtilizadas.setLitrosUsados(litrosNecessarios);
		
		

		Lata lata1 = new Lata(); //Iniciando uma instâcia de lata.
		lata1.setLitrosLata(18.0); //Definindo os litros dessa lata.

		Lata lata2 = new Lata(); //Iniciando uma instância de lata.
		lata2.setLitrosLata(3.6); //Definindo os litros dessa lata.

		Lata lata3 = new Lata(); //Iniciando uma instância de lata.
		lata3.setLitrosLata(2.5); //Definindo os litros dessa lata.

		Lata lata4 = new Lata(); //Iniciando uma instância de lata.
		lata4.setLitrosLata(0.5); //Definindo os litros dessa lata.
		
		
		
		//Estrutura de repetição que enquanto os litros necessários
		//não forem menor do que a quantidade de litros da maior lata
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
		
		
		//Aqui o programa irá apresentar quantas latas ele 
		//irá precisar de cada.
		latasUtilizadas.mostrarDetalhes();
		
		
		// FIM DO PROGRAMA
	}
}
