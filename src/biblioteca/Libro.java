package biblioteca;

public class Libro {
	private String titulo;
	private String autor;
	private int nPaginas;
	private Estado estado;
	
	public Libro(String titulo, String autor, int nPaginas, Estado estado) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.nPaginas = nPaginas;
		this.estado = estado;
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
	
	public int getnPaginas() {
		return nPaginas;
	}
	
	public void setnPaginas(int nPaginas) {
		this.nPaginas = nPaginas;
	}
	
	public Estado getEstado() {
		return estado;
	}
	
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	public void prestar() {
		this.estado = Estado.PRESTADO;
	}
	
	public void devolver() {
		this.estado = Estado.DISPONIBLE;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Libro [titulo=");
		builder.append(titulo);
		builder.append(", autor=");
		builder.append(autor);
		builder.append(", nPaginas=");
		builder.append(nPaginas);
		builder.append(", estado=");
		builder.append(estado);
		builder.append("]");
		return builder.toString();
	}

	
	
}
