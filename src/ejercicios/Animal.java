package ejercicios;

public class Animal {
    private String nombre; // atributo

    public Animal(String nombre) {
        setNombre(nombre);
    }

    public void setNombre(String nombre) {
        this.nombre = (nombre != null && !nombre.isBlank()) ? nombre : "Sin nombre";
    }

    public String getNombre() { return nombre; }

    public void hacerSonido() { // metodo que se sobreescribe
        System.out.println(nombre + " hace un sonido.");
    }
}
