package ejercicios;

public class Gerente extends Empleado {
    private double bono;

    public Gerente(String nombre, double salario, double bono) {
        super(nombre, salario); // atributos que se heredan
        setBono(bono);
    }

    public void setBono(double bono) {
        this.bono = (bono >= 0) ? bono : 0;
    }

    public double getBono() { return bono; }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + bono;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Bono:    Q" + bono);
    }
}