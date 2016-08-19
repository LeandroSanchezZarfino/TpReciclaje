
public class Recibo {

	public static void generarRecibo(Elemento[] elem ){
		System.out.println("");
		int total = 0;
		for(int i=0; i<elem.length ; i++){
			System.out.println("El " + elem[i].getNombre() + " fue vendido " + elem[i].getCantidad() +" veces a un coste de "+ elem[i].getCosto() * elem[i].getCantidad());
			total= total + elem[i].getCosto() * elem[i].getCantidad();
		}
	System.out.println("Total: " + total);
	}
	
}
