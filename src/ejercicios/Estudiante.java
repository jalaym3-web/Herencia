package ejercicios;

public class Estudiante extends Persona {
    private String carnet;

    public Estudiante(String nombre, int edad, String carnet) {
        super(nombre, edad); // se hereda de Persona
        setCarnet(carnet);
    }

    public void setCarnet(String carnet) {
        this.carnet = (carnet != null && !carnet.isBlank()) ? carnet : "Sin carnet";
    }

    public String getCarnet() { return carnet; }

    @Override
    public void mostrar() {  // metodo heredado
        super.mostrar();
        System.out.println("Carnet: " + carnet);
    }
}