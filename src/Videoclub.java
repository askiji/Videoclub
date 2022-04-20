import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Videoclub {
	private double gananciasC;
	private double gananciasP;
	private int dia=1;
	ArrayList<CD> cds= new ArrayList<>();
	ArrayList<Pelicula> peliculas= new ArrayList<>();
	
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
		int opcion = Integer.valueOf(sc.next());
		switch (opcion) {
		case 1:
			introProducto();
			break;
		case 2:
			eliminarProducto();
			break;
		case 3:
			mostrarP(peliculas);
			break;
		case 4:
			mostrarC(cds);
			break;
		case 5:
			alquilarPelicula();
			break;
		case 6:
			venderDisco();
			break;
		case 7:
			mostrarA();
			break;
		case 8:
			dinericos();
			break;
		case 9:
			pasarDia();
			break;

		default:
			break;
		}
	}
	private void pasarDia() {
		System.out.println("Desea pasar al día siguiente (s/n)?");
		Scanner sc = new Scanner(System.in);
		String opcion  = sc.nextLine();
		if (opcion.equalsIgnoreCase("s")) {
			this.dia++;
			for (int i = 0; i < peliculas.size(); i++) {
				if(peliculas.get(i).getDisponible()>0) {
					peliculas.get(i).setDisponible();
				}
			}
			
		}
		
	}
	
	private void dinericos() {
		System.out.println("Ganacias por CDs son " + this.gananciasC);
		System.out.println("Ganacias por pelicuas " + this.gananciasP);
		System.out.println("Ganacias totales "  + (this.gananciasC + this.gananciasP));
		
	}
	
	private void mostrarA() {
		for (int i = 0; i < peliculas.size(); i++) {
			if(peliculas.get(i).getDisponible()>0) {
				System.out.println(peliculas.get(i));
				
			}
		}
	}
	
	private void venderDisco() {
		mostrarC(cds);
		System.out.println("Que CD quiere vender");
		Scanner sc = new Scanner(System.in);
		int opcion = Integer.valueOf(sc.nextLine());
		for (int i = 0; i < cds.size(); i++) {
			if(opcion == cds.get(i).getId()) {
				this.gananciasC+=cds.get(i).getPrecio();
				cds.remove(i);
				System.out.println("El disco "+ cds.get(i).getTitulo() + " de "+ cds.get(i).getGrupoCantante() +" ha sido vendido por " + cds.get(i).getPrecio());
			}
		}
		
	}
	private void alquilarPelicula() {
		for (int i = 0; i < peliculas.size(); i++) {
			if (peliculas.get(i).getDisponible()== 0) {
				System.out.println(peliculas.get(i));
			}
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el id correspondiente");
		int opcion = Integer.valueOf(sc.nextLine());
		for (int i = 0; i < peliculas.size(); i++) {
			if(opcion== peliculas.get(i).getId()) {
				System.out.println("La peliculas "+ peliculas.get(i).getTitulo()+ " has "
				+ "sido alquilada por " + peliculas.get(i).getAntiguedad().coste());
				peliculas.get(i).setDisponible(peliculas.get(i).getAntiguedad().dias());
				gananciasP+=peliculas.get(i).getAntiguedad().coste();
			}
		}
		
	}
	private void eliminarProducto() {
		Scanner sc = new Scanner(System.in);
		mostrarP(peliculas);
		mostrarC(cds);
		System.out.println("introduzca el id que quiere eliminar");
		int opcion = Integer.valueOf(sc.nextLine());
		if(opcion>10000 && opcion<20000) {
			for (int i = 0; i < cds.size(); i++) {
				if(opcion == cds.get(i).getId()) {
					cds.remove(i);
				}
			}
		}
		if(opcion>20000) {
			for (int i = 0; i < peliculas.size(); i++) {
				if(opcion == peliculas.get(i).getId()) {
					peliculas.remove(i);
				}
			}
		}
		
		
		
	}

	private void mostrarC(ArrayList<CD> o) {
		for (int i = 0; i < o.size(); i++) {
			System.out.println(o.get(i));
		}
	}
	private void mostrarP(ArrayList<Pelicula> o) {
		for (int i = 0; i < o.size(); i++) {
			System.out.println(o.get(i));
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
			System.out.println("Cual es la antiguedad de la pelicula NOVEDAD SEMINOVEDAD ANTIGUAS");
			Antiguedad a = Antiguedad.valueOf(sc.nextLine());
			
			for (int i = 0; i < cantidad; i++) {
				Pelicula p = new Pelicula(titulo , a);
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
	}
	
}
