
public class Pelicula {

	private static int queue = 10000;
	private int id;
	private String titulo;
	private Antiguedad antiguedad;
	private int disponible = 0;
	
	

	@Override
	public String toString() {
		return "Pelicula [titulo=" + titulo +" "+ this.id + "]";
	}
	public Pelicula(String titulo, Antiguedad a) {
		super();
		this.titulo = titulo;
		this.id = queue;
		queue++;
		this.antiguedad= a;
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getDisponible() {
		return disponible;
	}
	public void setDisponible() {
		this.disponible--;
	}
	public void setDisponible(int disponible) {
		this.disponible = disponible;
	}
}
