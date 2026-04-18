package ejercicios;

public class LibroDigital extends Libro {
    private double tamanoMB;

    public LibroDigital(String titulo, String autor, double tamanoMB) {
        super(titulo, autor); // hereda los atributos
        setTamanoMB(tamanoMB);
    }

    public void setTamanoMB(double tamanoMB) {
        this.tamanoMB = (tamanoMB > 0) ? tamanoMB : 0.1;
    }

    public double getTamanoMB() { return tamanoMB; }

    @Override // sobreescribe el metodo y agrega tamanoMB
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tamaño: " + tamanoMB + " MB");
    }
}