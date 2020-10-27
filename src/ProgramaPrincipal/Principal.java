package ProgramaPrincipal;

import java.util.ArrayList;
import java.util.Scanner;

import julenmartin.pojo.Grafica;
import julenmartin.pojo.Procesador;
import julenmartin.pojo.Producto;
import julenmartin.pojo.discoDuro;
import julenmartin.pojo.servicioDomicilio;
import julenmartin.pojo.servicioTienda;

public class Principal {

	static final char OPC_A = 'A';
	static final char OPC_B = 'B';
	static final char OPC_C = 'C';
	static final int OPC1 = 1;
	static final int OPC2 = 2;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char resp;
		char opc;
		ArrayList<Producto> productos = new ArrayList<>();

		do {
			mostrarMenu();
			resp = sc.nextLine().charAt(0);
			switch (Character.toUpperCase(resp)) {
			case OPC_A:
				mostrarMenuA();
				opc = sc.nextLine().charAt(0);
				opcionA(sc, opc, productos);
				break;
			case OPC_B:
				opcionB(productos, sc);
				break;
			case OPC_C:
				opcionC(sc, productos);
				break;
			default:
				break;
			}

		} while (Character.toUpperCase(resp) != 'A' && Character.toUpperCase(resp) != 'B'
				&& Character.toUpperCase(resp) != 'C');
	}

	private static void opcionC(Scanner sc, ArrayList<Producto> productos) {
		// TODO faltan los try catch
		int opc;
		mostrarMenuC();
		opc = Integer.parseInt(sc.nextLine());
		switch (opc) {
		case 1:
			servicioDomicilio domicilio = new servicioDomicilio();

			System.out.println("Introduce una referencia");
			domicilio.setReferencia(sc.nextLine());

			System.out.println("Introduce precio");
			domicilio.setPrecio(Float.parseFloat(sc.nextLine()));

			System.out.println("Introduce el codigo");
			domicilio.setCodigo(Integer.parseInt(sc.nextLine()));

			System.out.println("Introduce las horas minimas");
			domicilio.setMinimoHoras(Integer.parseInt(sc.nextLine()));

			System.out.println("Introduce el gasto adicional");
			domicilio.setGastoAdicional(Float.parseFloat(sc.nextLine()));

			productos.add(domicilio);
			break;
		case 2:
			servicioTienda tienda = new servicioTienda();

			System.out.println("Introduce una referencia");
			tienda.setReferencia(sc.nextLine());

			System.out.println("Introduce precio");
			tienda.setPrecio(Float.parseFloat(sc.nextLine()));

			System.out.println("Introduce el codigo");
			tienda.setCodigo(Integer.parseInt(sc.nextLine()));

			System.out.println("Introduce las horas minimas");
			tienda.setMinimoHoras(Integer.parseInt(sc.nextLine()));

			System.out.println("Introduce el empleado");
			tienda.setEmpleado(sc.nextLine());

			productos.add(tienda);
			break;
		default:
			break;
		}
	}

	private static void mostrarMenuC() {

		System.out.println("***********SERVICIO***********");
		System.out.println("1.- Servicio a domicilio");
		System.out.println("2.- Servicio en tienda");

	}

	private static void opcionA(Scanner sc, char opc, ArrayList<Producto> productos) {

		if (!(Character.toUpperCase(opc) != 'A' && Character.toUpperCase(opc) != 'B'
				&& Character.toUpperCase(opc) != 'C')) {
			switch (opc) {
			case OPC_A:
				discoduro(sc, productos);
				break;
			case OPC_B:
				grafica(sc, productos);
				break;
			case OPC_C:
				procesador(sc, productos);
				break;
			default:
				System.out.println("No existe esa opcion");
				break;
			}
		} else {
			System.out.println("No existe esa opcion");
		}
	}

	private static void opcionB(ArrayList<Producto> productos, Scanner sc) {
		// TODO faltan los try catch
		int pos;
		for (Producto producto : productos) {
			if (producto instanceof Producto) {
				System.out.println("Referencia: " + producto.getReferencia());
			}
		}
		System.out.println("Cual es el producto que quieres vender?(Introduce la posicion del producto)");
		pos = Integer.parseInt(sc.nextLine());

		productos.remove(pos - 1);

		System.out.println("Verifica que el producto se ha vendido");
		for (Producto producto : productos) {
			if (producto instanceof Producto) {
				System.out.println("Referencia: " + producto.getReferencia());
			}
		}

	}

	private static void procesador(Scanner sc, ArrayList<Producto> productos) {
		// TODO faltan los try catch
		Procesador procesador = new Procesador();

		System.out.println("Introduce una referencia");
		procesador.setReferencia(sc.nextLine());

		System.out.println("Introduce precio");
		procesador.setPrecio(Float.parseFloat(sc.nextLine()));

		System.out.println("Introduce el modelo");
		procesador.setModelo(sc.nextLine());

		System.out.println("Introduce la velocidad");
		procesador.setVelocidad(Float.parseFloat(sc.nextLine()));

		productos.add(procesador);
	}

	private static void grafica(Scanner sc, ArrayList<Producto> productos) {
		// TODO faltan los try catch
		Grafica grafica = new Grafica();

		System.out.println("Introduce una referencia");
		grafica.setReferencia(sc.nextLine());

		System.out.println("Introduce precio");
		grafica.setPrecio(Float.parseFloat(sc.nextLine()));

		System.out.println("Introduce la memoria");
		grafica.setMemoria(Integer.parseInt(sc.nextLine()));

		System.out.println("Introduce la conexion");
		grafica.setConexion(sc.nextLine());

		productos.add(grafica);
	}

	private static void discoduro(Scanner sc, ArrayList<Producto> productos) {
		// TODO faltan los try catch
		char resp;
		discoDuro disco = new discoDuro();
		System.out.println("Introduce una referencia");
		disco.setReferencia(sc.nextLine());

		System.out.println("Introduce precio");
		disco.setPrecio(Float.parseFloat(sc.nextLine()));

		System.out.println("Introduce la capacidad");
		disco.setCapacidad(Integer.parseInt(sc.nextLine()));

		System.out.println("Introduce la velocidad");
		disco.setVelocidad(Float.parseFloat(sc.nextLine()));

		System.out.println("Es un SSD?");
		resp = sc.nextLine().charAt(0);

		if (Character.toUpperCase(resp) == 'S') {
			disco.setSSD(true);
		} else {
			disco.setSSD(false);
		}

		productos.add(disco);
	}

	private static void mostrarMenuA() {
		System.out.println("**************PRODUCTOS**************");
		System.out.println("A.- Disco duro");
		System.out.println("B.- Procesador");
		System.out.println("C.- Grafica");

	}

	private static void mostrarMenu() {

		System.out.println("*************MENU***************");
		System.out.println("A.- Añadir stock de la tienda");
		System.out.println("B.- Vender producto");
		System.out.println("C.- Vender servicio informatico");
	}

}
