import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Videoclub {
	private int dia=1;
	ArrayList<CD> cds= new ArrayList<>();
	ArrayList<Pelicula> peliculas= new ArrayList<>();
	ArrayList<Disco> discos=  new ArrayList(Arrays.asList(peliculas,cds));
	
	public void menu() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("MENU: DIA "+ dia);
		System.out.println("1.- Introducir nuevo producto");
		System.out.println("2.- Eliminar producto");
		System.out.println("3.- Ver listado de peliculas");
		System.out.println("4.- Ver listado de CDs");
		System.out.println("5.- Alquilar pelicula");
		System.out.println("6.- Vender disco");
		System.out.println("7.- Ver peliculas en alquiler");
		System.out.println("8.- Ver ganacias");
		System.out.println("9.- Pasar al dia siguente");
		int opcion = Integer.valueOf(sc.nextLine());
		switch (opcion) {
		case 1:
			introProducto();
			break;
		case 2:
			eliminarProducto();
			break;

		default:
			break;
		}
		sc.close();
	}
	
	private void eliminarProducto() {
		mostrar(discos);
		
	}

	private void mostrar(ArrayList<Disco> o) {
		for (int i = 0; i < o.size(); i++) {
			o.get(i);
		}
		
	}
	private void introProducto() {
		System.out.println("Desa introducir pelicula (p) o CD (c)");
		Scanner sc = new Scanner(System.in);
		String opcion = sc.nextLine();
		System.out.println("Cantidad a introducir");
		int cantidad = Integer.valueOf(sc.nextLine());
		if (opcion.equalsIgnoreCase("p")) {
			System.out.println("Cual es el titulo de la pelicula");
			String titulo= sc.nextLine();
			for (int i = 0; i < cantidad; i++) {
				Pelicula p = new Pelicula(titulo);
				peliculas.add(p);
			}
			
		}
		if (opcion.equalsIgnoreCase("c")) {
			System.out.println("Cual es el cantante o grupo");
			String cantante= sc.nextLine();
			System.out.println("Cual es el titulo");
			String titulo= sc.nextLine();
			for (int i = 0; i < cantidad; i++) {
				CD c = new CD(titulo,cantante);
				cds.add(c);
			}
		}
		sc.close();
	}
	
}
