
public class Elemento {
	String nombre;
	int cantidad;
	int costo;

	public Elemento(String nombre, int cantidad, int costo) {
		super();
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.costo = costo;
	}

	public int getCantidad() {
		return cantidad;
	}
	
	public Elemento(String nombre, int cantidad) {
		super();
		this.nombre = nombre;
		this.cantidad = cantidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
}
