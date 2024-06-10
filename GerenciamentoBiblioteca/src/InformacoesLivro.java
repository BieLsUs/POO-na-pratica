
public class InformacoesLivro {
	
	private String titulo;
	private String autor;
	private int anoDeLançamento;
	
	public int getAnoDeLançamento() {
		return anoDeLançamento;
	}
	public void setAnoDeLançamento(int anoDeLançamento) {
		this.anoDeLançamento = anoDeLançamento;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	@Override
	public String toString() {
		return  titulo + ", autor: " + autor + ", anoDeLançamento: " + anoDeLançamento;
	}
	
	
}