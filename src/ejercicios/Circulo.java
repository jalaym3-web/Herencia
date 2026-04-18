package ejercicios;

public class Circulo extends Figura {
    private double radio;

    public Circulo(String color, double radio) {
        super(color); // hereda el atributo
        setRadio(radio);
    }

    public void setRadio(double radio) {
        this.radio = (radio > 0) ? radio : 1;
    }

    public double getRadio() { return radio; }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override // sobreescribe el metodo y agrega radio
    public void mostrar() {
        super.mostrar();
        System.out.println("Radio:  " + radio);
    }
}
