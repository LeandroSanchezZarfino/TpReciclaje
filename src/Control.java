import java.util.*;

public class Control {

	public static int mostrarElementosAReciclar(Scanner in)
	{
		System.out.println("Pulse un boton para reciclar");
		System.out.println("1-Plastico");
		System.out.println("2-Vidrio");
		System.out.println("3-Carton");
		System.out.println("0-Fin de Reciclado	");

		String opcion = in.next();
		int elem = Integer.parseInt(opcion);
		
		return elem;
	}
	
	public static String introducirTarjeta(Scanner in)
	{
		System.out.print("Ingresar Nombre Tarjeta: ");
		String tarjeta = in.next();
		
		System.out.println("Tarjeta Ingresada");
		
		return tarjeta;
	}

	public static String introducirContraseña(Scanner in)
	{
		System.out.print("Ingrese Contraseña: ");
		String contraseña = in.next();
		
		return contraseña;
	}
}
