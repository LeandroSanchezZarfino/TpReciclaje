import java.util.*;
public class main {
public static int cantidadTot = 0;
	public static void main(String[] args) {
		
		Trabajador Pepe = new Trabajador("Pepe","Pepe",0);
		Trabajador Jose = new Trabajador("Jose","asd",0);
		Trabajador Roberto = new Trabajador("Roberto","r0b3r",0);
		Elemento plastico = new Elemento("plastico",0,5);
		Elemento vidrio = new Elemento("vidrio",0,3);
		Elemento carton = new Elemento("carton",0,2);
		Elemento[] elementos;
		elementos = new Elemento[3];
		elementos[0]=plastico;
		elementos[1]=vidrio;
		elementos[2]=carton;
		
		Trabajador[] trabajadores;
		trabajadores = new Trabajador[3];
		trabajadores[0]= Pepe;
		trabajadores[1]= Jose;
		trabajadores[2]= Roberto;
		
		int elem;
		Scanner in = new Scanner (System.in);
			while(true){
			System.out.println("Ingresar Nombre Tarjeta");
			String tarjeta = in.next();
			System.out.println("Tarjeta Ingresada");
			System.out.println("Ingrese Contraseña");
			String contraseña = in.next();
			boolean login = Trabajador.verificarContraseña(trabajadores,tarjeta,contraseña);
			while(login == true){
				elem = Control.reciclarElemento();
				if(elem==0){
					login=false;
					Recibo.generarRecibo(elementos);
					for(int j=0; j<elementos.length ;j++)
						elementos[j].cantidad = 0;
				}
				else {
					elem--;
					elementos[elem].cantidad ++;
					System.out.println(elementos[elem].nombre + ": " +elementos[elem].cantidad);
					System.out.println("cantidad total: "+ cantidadTot);
					
				}
			}
		}
		
	}
}
