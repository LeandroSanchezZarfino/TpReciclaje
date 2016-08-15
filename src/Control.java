import java.util.*;
public class Control {

public static int reciclarElemento(){
	System.out.println("Pulse un boton para reciclar");
	System.out.println("1-Plastico");
	System.out.println("2-Vidrio");
	System.out.println("3-Carton");
	System.out.println("0-Fin de Turno	");
	Scanner in = new Scanner (System.in);
	String opcion = in.next();
	int elem = Integer.parseInt(opcion);
	main.cantidadTot ++;
	return elem;
	
	}
}
