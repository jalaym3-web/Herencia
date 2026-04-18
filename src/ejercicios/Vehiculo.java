package ejercicios;

public class Vehiculo {
    private String marca;
    private int velocidad;

    public Vehiculo(String marca, int velocidad) {
        setMarca(marca);
        setVelocidad(velocidad);
    }

    public void setMarca(String marca) {
        this.marca = (marca != null && !marca.isBlank()) ? marca : "Sin marca";
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = (velocidad >= 0) ? velocidad : 0;
    }

    public String getMarca()    { return marca; }
    public int getVelocidad()   { return velocidad; }

    public void mostrarInfo() {
        System.out.println("Marca:      " + marca);
        System.out.println("Velocidad:  " + velocidad + " km/h");
    }
}
