
public class Recibo {

	public static void generarRecibo(Elemento[] elem ){
		int total = 0;
		for(int i=0; i<elem.length ; i++){
			System.out.println("El " + elem[i].nombre + "fue vendido" + elem[i].costo +"veces a un coste de "+ elem[i].costo * elem[i].cantidad);
			total= total + elem[i].costo * elem[i].cantidad;
		}
	System.out.println("Total: " + total);
	}
	
}
