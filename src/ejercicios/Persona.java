package ejercicios;

public class Persona {
	private String nombre; //Atributos que se van a heredar
    private int edad;

    public Persona(String nombre, int edad) {
        setNombre(nombre);
        setEdad(edad);
    }

    public void setNombre(String nombre) {
        this.nombre = (nombre != null && !nombre.isBlank()) ? nombre : "Sin nombre";
    }

    public void setEdad(int edad) {
        this.edad = (edad >= 0) ? edad : 0;
    }

    public String getNombre() { return nombre; }
    public int getEdad()      { return edad; }

    public void mostrar() { //metodo a sobreescribir
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad:   " + edad);
    }
}
