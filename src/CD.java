
public class CD {

	private static int queue = 20000;
	private int id;

	private String titulo;
	private String grupoCantante;
	private double precio=15;
	
	public CD(String titulo, String grupoCantante) {
		super();
		this.titulo = titulo;
		this.grupoCantante = grupoCantante;
		this.id=queue;
		queue++;
	}
	@Override
	public String toString() {
		return "CD [titulo=" + titulo + ", grupoCantante=" + grupoCantante + ", precio=" + precio +" "+ this.id + "]";
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getGrupoCantante() {
		return grupoCantante;
	}
	public void setGrupoCantante(String grupoCantante) {
		this.grupoCantante = grupoCantante;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	

}
