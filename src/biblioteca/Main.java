package biblioteca;

import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		
		Biblioteca biblioteca = new Biblioteca();
		Scanner sc = new Scanner(System.in);
		
		biblioteca.adicionarLivro(new Livro ("O Hobbit", "Tolkien"));
		biblioteca.adicionarLivro(new Livro ("Sonho","Shakespeare" ));
		biblioteca.adicionarUsuario(new Usuario ("Joao"));
		biblioteca.adicionarUsuario(new Usuario ("Jose"));
		
		
		
		while(true) {
			System.out.println("1. Alugar livro");
			System.out.println("2. Devolver livro");
			System.out.println("3. Sair");
			System.out.print("Escolha uma opcao: ");
			
			int opcao;

			try {
			    opcao = Integer.parseInt(sc.nextLine());  
			} catch (NumberFormatException e) {
			    System.out.println("Opcao invalida. Digite um número.\n");
			    continue;  
			}
			
			if (opcao == 1) {
				System.out.println("Digite o nome do usuario: ");
				String nomeUsuario = sc.nextLine();
				Usuario usuario = biblioteca.buscarUsuario(nomeUsuario);
				
				if (usuario != null) {
					System.out.println("Digite o titulo do livro: ");
					String tituloDoLivro = sc.nextLine();
					Livro livro = biblioteca.buscarLivro(tituloDoLivro);
					
					if (livro != null) {
						usuario.alugarLivro(livro);
						
					}else {
						System.out.println("Livro nao encontrado.");
					}
					
				}else {
					System.out.println("Usuario nao encontrado.");
				}
				
			}else if (opcao == 2) {
				System.out.println("Digite o nome do usuario: ");
				String nomeUsuario = sc.nextLine();
				Usuario usuario = biblioteca.buscarUsuario(nomeUsuario);
				
				if (usuario != null) {
					usuario.devolverLivro();
					
				}else {
					System.out.println("Usuario nao encontrado.");
				}
			}else if (opcao == 3) {
				System.out.println("Saindo...");
				break;
				
			}else {
				System.out.println("Opcao invalida.");
			}
			
		}
		sc.close();
	}
}
