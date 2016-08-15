
public class Elemento {
	private String nombre;
	private int cantidad;
	private int costo;
	private int cantidadTot;

	public Elemento(String nombre, int cantidad, int costo) {
		super();
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.setCosto(costo);
		this.cantidadTot = 0;
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

	public int getCosto() {
		return costo;
	}

	public void setCosto(int costo) {
		this.costo = costo;
	}

	public int getCantidadTot() {
		return cantidadTot;
	}

	public void reciclarElemento()
	{
		this.actualizarContadores();
	}
	
	private void actualizarContadores() 
	{
		this.setCantidad(this.getCantidad()+1);
		this.cantidadTot++;
		
	}
}
