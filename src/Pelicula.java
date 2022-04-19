
public class Pelicula extends Disco{

	private static int queue = 10000;
	private int id;
	private String titulo;
	private Antiguedad antiguedad;
	
	
	@Override
	public String toString() {
		return "Pelicula [titulo=" + titulo + "]";
	}
	public Pelicula(String titulo) {
		super();
		this.titulo = titulo;
		this.id = queue;
		queue++;
		this.antiguedad= Antiguedad.NOVEDAD;
	}
	public Antiguedad getAntiguedad() {
		return antiguedad;
	}
	public void setAntiguedad(Antiguedad antiguedad) {
		this.antiguedad = antiguedad;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
}
