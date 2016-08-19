import java.util.*;

public class Reciclaje {
	public static void main(String[] args) {

		Trabajador Pepe = new Trabajador("Pepe", "Pepe", 0);
		Trabajador Jose = new Trabajador("Jose", "asd", 0);
		Trabajador Roberto = new Trabajador("Roberto", "r0b3r", 0);
		Elemento plastico = new Elemento("plastico", 0, 5);
		Elemento vidrio = new Elemento("vidrio", 0, 3);
		Elemento carton = new Elemento("carton", 0, 2);
		Elemento[] elementos;
		elementos = new Elemento[3];
		elementos[0] = plastico;
		elementos[1] = vidrio;
		elementos[2] = carton;

		Trabajador[] trabajadores;
		trabajadores = new Trabajador[3];
		trabajadores[0] = Pepe;
		trabajadores[1] = Jose;
		trabajadores[2] = Roberto;

		int elem;
		Scanner in = new Scanner(System.in);

		while (true) {
			String tarjeta = Control.introducirTarjeta(in);
			String contraseña = Control.introducirContraseña(in);

			boolean login = Trabajador.verificarContraseña(trabajadores, tarjeta, contraseña);

			while (login == true) {
				elem = Control.mostrarElementosAReciclar(in);
				if (elem == 0) {
					login = false;
					Recibo.generarRecibo(elementos);
					for (int j = 0; j < elementos.length; j++)
						elementos[j].setCantidad(0);
				} else {
					elem--;
					elementos[elem].reciclarElemento();
					System.out.println(elementos[elem].getNombre() + ": " + elementos[elem].getCantidad());
					System.out.println("cantidad total: " + elementos[elem].getCantidadTot());
					System.out.println("");
				}
			}
			System.out.println("");
		}

	}
}
