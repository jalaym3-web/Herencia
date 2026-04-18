package ejercicios;

public class Transporte {
    private String marca;
    private int capacidad;

    public Transporte(String marca, int capacidad) {
        setMarca(marca); 
        setCapacidad(capacidad);
    }

    public void setMarca(String marca) {
        this.marca = (marca != null && !marca.isBlank()) ? marca : "Sin marca";  //verifica que haya marca
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = (capacidad > 0) ? capacidad : 1;
    }

    public String getMarca()   { return marca; }
    public int getCapacidad()  { return capacidad; }

    public void descripcion() {
        System.out.println("Marca:     " + marca);
        System.out.println("Capacidad: " + capacidad + " pasajeros");
    }
}