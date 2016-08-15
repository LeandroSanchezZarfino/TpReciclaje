
public class Trabajador {
	String nombre;
	String contrase�a;
	int recliclado;
	
	public Trabajador(String nombre, String contrase�a, int recliclado) {
		super();
		this.nombre = nombre;
		this.contrase�a = contrase�a;
		this.recliclado = recliclado;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getContrase�a() {
		return contrase�a;
	}
	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}
	public int getRecliclado() {
		return recliclado;
	}
	public void setRecliclado(int recliclado) {
		this.recliclado = recliclado;
	} 
	public static boolean verificarContrase�a(Trabajador[] trabajadores, String tarjeta, String pass){
		int flag=0;
		boolean bool = false;
		int i;
		for(i=0; flag == 0 ; i++)
		{
			if(trabajadores[i].nombre.equals(tarjeta)){
				flag=1;
			}
		}
		if(trabajadores[i-1].contrase�a.equals(pass)) bool=true;
		return bool;
	}
	
}
