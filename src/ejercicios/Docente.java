package ejercicios;

public class Docente extends Persona {
	    private String especialidad;

	    public Docente(String nombre, int edad, String especialidad) {
	        super(nombre, edad);  //Se heredan los atributos
	        setEspecialidad(especialidad);
	    }

	    public void setEspecialidad(String especialidad) {
	        this.especialidad = (especialidad != null && !especialidad.isBlank())
	                ? especialidad : "Sin especialidad";
	    }

	    public String getEspecialidad() { return especialidad; }

	    @Override
	    public void mostrar() { // metodo heredado
	        super.mostrar();
	        System.out.println("Especialidad: " + especialidad);
	    }
	}
