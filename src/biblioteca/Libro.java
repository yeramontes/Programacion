package biblioteca;

public class Libro {
	private String titulo;
	private String autor;
	private int nPaginas;
	private Estado estado;
	private String fechaPrestado;
	
	public Libro(String titulo, String autor, int nPaginas, Estado estado) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.nPaginas = nPaginas;
		this.estado = estado;
		this.fechaPrestado = null;
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
	
	public String getFechaPrestado() {
		return fechaPrestado;
	}

	public void setFechaPrestado(String fechaPrestado) {
		this.fechaPrestado = fechaPrestado;
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
		if(this.estado == Estado.PRESTADO) {
			builder.append(", fechaPrestado= ");
			builder.append(this.fechaPrestado);
		}
		builder.append("]");
		return builder.toString();
	}

	
	
}
