package ejercicios;

public class FacturaCredito extends Factura {
    private double recargo;
    private int cuotas;

    public FacturaCredito(int numero, Cliente cliente, double total, double recargo, int cuotas) {
        super(numero, cliente, total); // atributos heredados
        setRecargo(recargo);
        setCuotas(cuotas);
    }

    public void setRecargo(double recargo) {
        this.recargo = (recargo >= 0 && recargo <= 100) ? recargo : 0;
    }

    public void setCuotas(int cuotas) {
        this.cuotas = (cuotas > 0) ? cuotas : 1;
    }

    public double getRecargo() { return recargo; }
    public int getCuotas()     { return cuotas; }

    @Override // sobreescribe el metodo con recargo
    public double calcularTotal() {
        return super.calcularTotal() + (super.calcularTotal() * recargo / 100);
    }

    public double calcularCuota() {
        return calcularTotal() / cuotas;
    }

    @Override // sobreescribe para mostrar recargo, cuotas y el total
    public void mostrar() {
        super.mostrar();
        System.out.println("Recargo:   " + recargo + "%");
        System.out.println("Cuotas:    " + cuotas);
        System.out.println("Por cuota: Q" + String.format("%.2f", calcularCuota()));
        System.out.println("A pagar:   Q" + calcularTotal());
    }
}