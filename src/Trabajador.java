
public class Trabajador {
	String nombre;
	String contraseña;
	int recliclado;
	
	public Trabajador(String nombre, String contraseña, int recliclado) {
		super();
		this.nombre = nombre;
		this.contraseña = contraseña;
		this.recliclado = recliclado;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	public int getRecliclado() {
		return recliclado;
	}
	public void setRecliclado(int recliclado) {
		this.recliclado = recliclado;
	} 
	public static boolean verificarContraseña(Trabajador[] trabajadores, String tarjeta, String pass){
		int flag=0;
		boolean bool = false;
		int i;
		for(i=0; flag == 0 ; i++)
		{
			if(trabajadores[i].nombre.equals(tarjeta)){
				flag=1;
			}
		}
		if(trabajadores[i-1].contraseña.equals(pass)) bool=true;
		return bool;
	}
	
}
