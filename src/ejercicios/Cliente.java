package ejercicios;

public class Cliente {
    private String nombre; // atributos
    private String nit;

    public Cliente(String nombre, String nit) {
        setNombre(nombre);
        setNit(nit);
    }

    public void setNombre(String nombre) {
        this.nombre = (nombre != null && !nombre.isBlank()) ? nombre : "Sin nombre";
    }

    public void setNit(String nit) {
        this.nit = (nit != null && !nit.isBlank()) ? nit : "CF";
    }

    public String getNombre() { return nombre; }
    public String getNit()    { return nit; }

    public void mostrar() {
        System.out.println("Cliente: " + nombre + " | NIT: " + nit);
    }
}
