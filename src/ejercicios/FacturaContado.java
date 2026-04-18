package ejercicios;

public class FacturaContado extends Factura {
    private double descuento;

    public FacturaContado(int numero, Cliente cliente, double total, double descuento) {
        super(numero, cliente, total); // atributos heredados
        setDescuento(descuento);
    }

    public void setDescuento(double descuento) {
        this.descuento = (descuento >= 0 && descuento <= 100) ? descuento : 0;
    }

    public double getDescuento() { return descuento; }

    @Override //sobreescribe el metodo y agrega descuento
    public double calcularTotal() {
        double totalConDescuento = super.calcularTotal() - (super.calcularTotal() * descuento / 100);
        return Math.max(totalConDescuento, 0);
    }

    @Override // sobreescribe para mostrar el descuento y despues el total
    public void mostrar() {
        super.mostrar();
        System.out.println("Descuento: " + descuento + "%");
        System.out.println("A pagar:   Q" + calcularTotal());
    }
}
