package menu;

import java.util.InputMismatchException;
import java.util.Optional;
import java.util.Scanner;

import farmacia.controller.ProdutoController;
import farmacia.model.Cosmetico;
import farmacia.model.Medicamento;
import farmacia.model.Produto;

public class Menu {

	
	private static final Scanner leia = new Scanner(System.in);
	private static final ProdutoController controller = new ProdutoController();
	
	public static void main(String[] args) {
		
		
		
		int opcao;
		
		do {
			
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                    DROGA ARRAIA                     ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("            1 - Cadastro de Produto                  ");
			System.out.println("            2 - Listar Todos os Produtos             ");
			System.out.println("            3 - Consultar Produto por ID             ");
			System.out.println("            4 - Atualizar Produto                    ");
			System.out.println("            5 - Apagar Produto                       ");
			System.out.println("            6 - Sobre o Projeto                     ");
			System.out.println("            0 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Digite a opção desejada: ");
			
			try {
				opcao = leia.nextInt();
				leia.nextLine();
			}catch(InputMismatchException e) {
				opcao = -1;
				System.out.println("Digite um número inteiro entre 0 e 6");
				leia.nextLine();
			}
			
			switch(opcao) {
			case 1:
				System.out.println("Cadastrar produto: \n");
				cadastrarProduto();
				keyPress();
			break;
				
			case 2:
				System.out.println("Listar todos os produtos: \n");
				listarProdutos();
				keyPress();
			break;
			
			case 3: 
				System.out.println("Consultar produto por ID: \n");
				listarPorID();
				keyPress();
			break;
			
			case 4:
				System.out.println("Atualizar dados do produto: \n");
				atualizarProduto();
				keyPress();
			break;
			
			case 5:
				System.out.println("Apagar produto: \n");
				deletarProduto();
				keyPress();
			break;
			
			case 6:
				sobre();
				keyPress();
			break;
				
			case 0:
				System.out.println("\nObrigado por utilizar os serviços da DROGA ARRAIA!");
				
			break;
			
			default:
				System.out.println("\nOpção Inválida! Escolha um número de 0 a 6.");
				
				keyPress();
				break;
				
				}
			
		}while(opcao != 0);
		
		leia.close();
	}
	
		public static void sobre() {
			System.out.println("\n*********************************************************");
			System.out.println("Projeto Desenvolvido por: Maryane Praxedes ");
			System.out.println("Contato - mary.praxedes@icloud.com");
			System.out.println("github.com/marypraxedes");
			System.out.println("*********************************************************");
	}

	
		public static void keyPress() {
			System.out.println("\n\nPressione Enter para continuar...");
			leia.nextLine();
		}
		
		
		public static void listarProdutos() {
			controller.listarTodos();
		}
		
		public static void cadastrarProduto() {
			System.out.println("Digite o nome do produto: ");
			String nome = leia.nextLine();
			
			System.out.println("Digite o tipo de produto (1- Medicamento / 2- Cosmético): ");
			int tipo = leia.nextInt();
			
			System.out.println("Digite o preço do produto: ");
			float preco = leia.nextFloat();
			
			switch(tipo) {
			case 1: 
				System.out.println("Medicamento genérico (S/N): ");
				String generico = leia.next();
				
				controller.cadastrarProduto(new Medicamento(controller.gerarId(), nome, tipo, preco, generico));
			break;
			case 2:
				System.out.println("Fragrância (Floral, Amadeirado, Cítrico ou Oriental): ");
				String fragrancia = leia.nextLine();
				
				controller.cadastrarProduto(new Cosmetico(controller.gerarId(),nome, tipo, preco, fragrancia));
			break;	
			default: System.out.println("Tipo de produto inválido!");
			}
			
		}
		
		
		public static void listarPorID() {
			
			System.out.println("Digite o ID do produto: ");
			int id = leia.nextInt();
			leia.nextLine();
			
			controller.listarPorID(id);
		}
		
		public static void deletarProduto() {
			
			System.out.println("Digite o ID do produto: ");
			int id = leia.nextInt();
			leia.nextLine();
			
			Optional<Produto> produto = controller.buscarNaCollection(id);
			
			if(produto.isPresent()) {
				
				//Confirmação da exclusão
				
				System.out.printf("\nTem certeza que você deseja excluir o produto de ID %d (S/N)? ", id);
				String confirmacao = leia.nextLine();
				
				if(confirmacao.equalsIgnoreCase("S"))
					controller.deletarProduto(id);
				else
					System.out.println("\nOperação cancelada!");
			} else {
				System.out.printf("\nO produto de ID %d não foi encontrado!", id);
			}
			
		}
		
		public static void atualizarProduto() {
			
			System.out.println("Digite o ID do produto: ");
			int id = leia.nextInt();
			leia.nextLine();
			
			Optional<Produto> produto = controller.buscarNaCollection(id);
			
			if(produto.isPresent()) {
				
				// Obtém os dados atuais do produto
				String nome = produto.get().getNome();
				int tipo = produto.get().getTipo();
				float preco = produto.get().getPreco();
				
				
				// Atualizar o nome
				System.out.printf("Nome atual: %s"
							+ "%nDigite o novo nome do produto (Pressione ENTER para manter o valor atual): ", nome);
				String entrada = leia.nextLine();
				
				nome = entrada.isEmpty() ? nome : entrada;
							
				// Atualizar o preço
				System.out.printf("Preço atual: %.2f"
							+ "%nDigite o novo preço (Pressione ENTER para manter o valor atual): ", preco);
				entrada = leia.nextLine();
							
				preco = entrada.isEmpty() ? preco : Float.parseFloat(entrada.replace(",", "."));
				
				switch(tipo) {
				case 1 ->{
					Medicamento medicamento = (Medicamento) produto.get();
					String generico = medicamento.getGenerico();
					
					// Atualizar o medicamento genérico
					System.out.printf("Medicamento genérico (S/N): %s"
								+ "%nDigite se o medicamento é genérico ou não (S/N) (Pressione ENTER para manter o valor atual): ", generico);
					entrada = leia.nextLine();
								
					generico = entrada.isEmpty() ? generico : entrada;
					
					controller.atualizarProduto(new Medicamento (id, nome, tipo, preco, generico));
					
				}
				
				case 2 -> {
					Cosmetico cosmetico = (Cosmetico) produto.get();
					String fragrancia = cosmetico.getFragrancia();
					
					// Atualizar a fragrância
					System.out.printf("Fragrância atual: %s"
								+ "%nDigite a nova fragrância (Pressione ENTER para manter o valor atual): ", fragrancia);
					entrada = leia.nextLine();
								
					fragrancia = entrada.isEmpty() ? fragrancia : entrada;
					controller.atualizarProduto(new Cosmetico (id, nome, tipo, preco, fragrancia));
				}
				default -> System.out.println("Tipo de produto é inválido!");
				
				}
				
			}else {
				System.out.printf("\nO produto número %d não foi encontrado!", id);
			}
			
			
		}
	
}
