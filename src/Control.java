import java.util.*;

public class Control {

	public static int mostrarElementosAReciclar(Scanner in)
	{
		System.out.println("Pulse un boton para reciclar");
		System.out.println("1-Plastico");
		System.out.println("2-Vidrio");
		System.out.println("3-Carton");
		System.out.println("0-Fin de Reciclado	");
		
		return Teclado.seleccionarElemento(in);
	}
}
