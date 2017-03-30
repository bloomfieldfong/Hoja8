
/**
 *
 * @author Alejandro Vasquez 
 * @author Michelle Bloomfield 
 *
 */
public class Paciente {

	public String nombre;
	public String sintoma;
	public String codigo;
	
	public Paciente(){
		nombre = "";
		sintoma ="";
		codigo = "";
	}
	
	/**
	 * @param nombre
	 * @param sintoma
	 * @param codigo
	 */
	public void setPaciente(String nombre, String sintoma, String codigo){
		this.nombre = nombre;
		this.sintoma = sintoma;
		this.codigo = codigo;
	}
	
	/**
	 * @param nombre
	 */
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	
	/**
	 * @param sintoma
	 */
	public void setSintoma(String sintoma){
		this.sintoma = sintoma;
	}
	
	/**
	 * @param codigo
	 */
	public void setCodigo(String codigo){
		this.codigo = codigo;
	}
	
	/**
	 * @return nombre
	 */
	public String getNombre(){
		return nombre;
	}
	
	/**
	 * @return sintoma
	 */
	public String getSintoma(){
		return sintoma;
	}
	
	/**
	 * @return codigo
	 */
	public String getCodigo(){
		return codigo;
	}
	
}
