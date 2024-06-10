
public abstract class BibliotecaMain {
	
	
	public static void main(String[] args) {
		Bibliotecario biblioteca = new Bibliotecario();
		Usuario cliente = new Usuario();
		InformacoesLivro livro = new InformacoesLivro();
		
		biblioteca.getNomeBibliotecario();
		cliente.setNome("José");
		cliente.setEmail("joseSilva13@gmail.com");
		livro.setTitulo("O Morro dos Ventos Uivantes");
		livro.setAutor("Emily Brontë");
		livro.setAnoDeLançamento(1847);
		
		
		System.out.println("O bibliotecário " + biblioteca.getNomeBibliotecario() + " cadastrou um novo cliente!" + "\n");
		System.out.println(cliente.toString() + "\n");
		System.out.println("O livro escolhido em nossa biblioteca pelo cliente " + cliente.getNome() + "\nfoi " + livro.toString());
		
		System.out.println("\n" + "////////////////////////////////////////////////////////////////" + "\n");

		biblioteca.getNomeBibliotecario();
		cliente.setNome("Carlos");
		cliente.setEmail("carlosCarneiro55@gmail.com");
		livro.setTitulo("O Jardim das Aflições");
		livro.setAutor("Olavo de Carvalho");
		livro.setAnoDeLançamento(2015);
		
		System.out.println("O bibliotecário " + biblioteca.getNomeBibliotecario() + " cadastrou um novo cliente!" + "\n");
		System.out.println(cliente.toString() + "\n");
		System.out.println("O livro escolhido em nossa biblioteca pelo cliente " + cliente.getNome() + "\nfoi " + livro.toString());
		
	}
}