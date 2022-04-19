
public class CD extends Disco{

	private static int queue = 20000;
	private int id;
	private String titulo;
	private String grupoCantante;
	private double precio;
	
	public CD(String titulo, String grupoCantante) {
		super();
		this.titulo = titulo;
		this.grupoCantante = grupoCantante;
		this.id=queue;
		queue++;
	}
	@Override
	public String toString() {
		return "CD [titulo=" + titulo + ", grupoCantante=" + grupoCantante + ", precio=" + precio + "]";
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
	
	

}
