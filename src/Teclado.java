import java.util.Scanner;

public class Teclado
{
	public static String introducirTarjeta(Scanner in)
	{
		System.out.println("Ingresar Nombre Tarjeta");
		String tarjeta = in.next();
		
		System.out.println("Tarjeta Ingresada");
		
		return tarjeta;
	}

	public static String introducirContrase�a(Scanner in)
	{
		System.out.println("Ingrese Contrase�a");
		String contrase�a = in.next();
		
		return contrase�a;
	}

	public static int seleccionarElemento(Scanner in)
	{
		String opcion = in.next();
		int elem = Integer.parseInt(opcion);
		
		return elem;
	}
}
