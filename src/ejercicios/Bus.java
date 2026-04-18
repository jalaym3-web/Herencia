package ejercicios;

public class Bus extends Transporte {
    private String ruta;

    public Bus(String marca, int capacidad, String ruta) {
        super(marca, capacidad); // atributos heredados
        setRuta(ruta);
    }

    public void setRuta(String ruta) {
        this.ruta = (ruta != null && !ruta.isBlank()) ? ruta : "Sin ruta"; 
    }

    public String getRuta() { return ruta; }

    @Override
    public void descripcion() { // metodo  para sobreescribir
        super.descripcion();
        System.out.println("Ruta:      " + ruta);
    }
}