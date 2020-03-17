package dev.branna.model;

/**
 * @author Angel Braña
 * 
 * This is the class that represent the domain model
 * 
 * */
public class Persona {
	
	int id;
	int edad;
	String nombre;
		
	public Persona(int id, int edad, String nombre) {
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
	}
		
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Persona [id=" + id + ", edad=" + edad + ", nombre=" + nombre + "]";
	}
}
