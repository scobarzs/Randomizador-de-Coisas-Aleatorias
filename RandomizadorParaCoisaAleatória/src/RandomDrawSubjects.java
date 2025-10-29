import java.util.Scanner;
import java.util.List;
import java.util.Random;

public class RandomDrawSubjects {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int option;
		do {
			menu();
			option = scanner.nextInt();
			scanner.nextLine();
			switch (option) {
			case 1:
				randomObjeto();
				break;
			case 2:
				randomEstrutura();
				break;
			case 3:
				randomAnimal();
				break;
			case 4:
				randomParte();
				break;
			case 5:
				randomVeiculo();
				break;
			case 6:
				randomMaterial();
				break;
			case 7:
				randomPlanta();
				break;
			case 8:
				randomVeste();
				break;
			case 9:
				random();
				break;

			case 0:
				System.out.println("Saindo...");
				break;
			default:
				System.out.println("Erro na digitação. Tente novamente");
			}
		} while (option != 0);
	}

	private static void menu() {
		System.out.println("======= RANDOMIZADOR =======");
		System.out.println("Selecione o tipo de 'coisa' que deseja: ");
		System.out.println("\n1 - Objetos");
		System.out.println("2 - Estruturas");
		System.out.println("3 - Animais");
		System.out.println("4 - Partes do Corpo Humano");
		System.out.println("5 - Veículos");
		System.out.println("6 - Materiais");
		System.out.println("7 - Plantas");
		System.out.println("8 - Vestes");
		System.out.println("9 - Qualquer Coisa");
		System.out.println("\n0 - Fechar Randomizador");
	}

	public static String randomizar(List<String> coisas) {
		Random r = new Random();
		String coisa = coisas.get(r.nextInt(coisas.size()));
		return coisa;
	}

	public static void randomObjeto() {

		System.out.println("=== OBJETOS === ");
		System.out.println("\nO objeto aleatório é:");
		System.out.println("\n	" + randomizar(Objeto.listaObjetos()));
		System.out.println("\nBoa sorte com isso!\n");
		System.out.println("\n1 - Voltar ao Menu");
		System.out.println("2 - Refazer Random");
		int option = scanner.nextInt();
		scanner.nextLine();
		switch (option) {
		case 1:
			break;
		case 2:
			randomObjeto();
			break;
		}
	}
	
	public static void randomEstrutura() {
		System.out.println("=== ESTRUTURAS === ");
		System.out.println("\nA esturuta aleatória é:");
		System.out.println("\n	" + randomizar(Estrutura.listaEstruturas()));
		System.out.println("\nBoa sorte com isso!\n");
		System.out.println("\n1 - Voltar ao Menu");
		System.out.println("2 - Refazer Random");
		int option = scanner.nextInt();
		scanner.nextLine();
		switch (option) {
		case 1:
			break;
		case 2:
			randomEstrutura();
			break;
		}
	}
	
	public static void randomAnimal() {
		System.out.println("=== ANIMAIS === ");
		System.out.println("\nO animal aleatório é:");
		System.out.println("\n	" + randomizar(Animal.listaAnimais()));
		System.out.println("\nBoa sorte com isso!\n");
		System.out.println("\n1 - Voltar ao Menu");
		System.out.println("2 - Refazer Random");
		int option = scanner.nextInt();
		scanner.nextLine();
		switch (option) {
		case 1:
			break;
		case 2:
			randomAnimal();
			break;
		}
	}
	
	public static void randomParte() {
		System.out.println("=== PARTE DO CORPO === ");
		System.out.println("\nA parte do corpo aleatória é:");
		System.out.println("\n	" + randomizar(Parte.listaPartes()));
		System.out.println("\nBoa sorte com isso!\n");
		System.out.println("\n1 - Voltar ao Menu");
		System.out.println("2 - Refazer Random");
		int option = scanner.nextInt();
		scanner.nextLine();
		switch (option) {
		case 1:
			break;
		case 2:
			randomParte();
			break;
		}
	}
	
	public static void randomVeiculo() {
		System.out.println("=== VEICULOS === ");
		System.out.println("\nO veiculo aleatório é:");
		System.out.println("\n	" + randomizar(Veiculo.listaVeiculos()));
		System.out.println("\nBoa sorte com isso!\n");
		System.out.println("\n1 - Voltar ao Menu");
		System.out.println("2 - Refazer Random");
		int option = scanner.nextInt();
		scanner.nextLine();
		switch (option) {
		case 1:
			break;
		case 2:
			randomVeiculo();
			break;
		}
	}
	
	public static void randomMaterial() {
		System.out.println("=== MATERIAIS === ");
		System.out.println("\nO material aleatório é:");
		System.out.println("\n	" + randomizar(Material.listaMateriais()));
		System.out.println("\nBoa sorte com isso!\n");
		System.out.println("\n1 - Voltar ao Menu");
		System.out.println("2 - Refazer Random");
		int option = scanner.nextInt();
		scanner.nextLine();
		switch (option) {
		case 1:
			break;
		case 2:
			randomMaterial();
			break;
		}
	}
	
	public static void randomPlanta() {
		System.out.println("=== PLANTAS === ");
		System.out.println("\nA planta aleatória é:");
		System.out.println("\n	" + randomizar(Planta.listaPlantas()));
		System.out.println("\nBoa sorte com isso!\n");
		System.out.println("\n1 - Voltar ao Menu");
		System.out.println("2 - Refazer Random");
		int option = scanner.nextInt();
		scanner.nextLine();
		switch (option) {
		case 1:
			break;
		case 2:
			randomPlanta();
			break;
		}
	}
	
	public static void randomVeste() {
		System.out.println("=== VESTES === ");
		System.out.println("\nO objeto aleatório é:");
		System.out.println("\n	" + randomizar(Veste.listaVestes()));
		System.out.println("\nBoa sorte com isso!\n");
		System.out.println("\n1 - Voltar ao Menu");
		System.out.println("2 - Refazer Random");
		int option = scanner.nextInt();
		scanner.nextLine();
		switch (option) {
		case 1:
			break;
		case 2:
			randomVeste();
			break;
		}
	}
	
	public static void random() {
		System.out.println("=== QUALQUER COISA === ");
		System.out.println("\nA coisa aleatória é:");
		System.out.println("\n	" + randomizar(Qualquer.listaTudo()));
		System.out.println("\nBoa sorte com isso!\n");
		System.out.println("\n1 - Voltar ao Menu");
		System.out.println("2 - Refazer Random");
		int option = scanner.nextInt();
		scanner.nextLine();
		switch (option) {
		case 1:
			break;
		case 2:
			random();
			break;
		}
	}

}
