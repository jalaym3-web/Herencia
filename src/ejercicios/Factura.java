package ejercicios;

public class Factura {
    private int numero;  // atributos
    private Cliente cliente;
    private double total;

    public Factura(int numero, Cliente cliente, double total) {
        setNumero(numero);
        setCliente(cliente);
        setTotal(total);
    }
    // getters and setters
    public void setNumero(int numero) {
        this.numero = (numero > 0) ? numero : 1;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = (cliente != null) ? cliente : new Cliente("Sin nombre", "CF");
    }

    public void setTotal(double total) {
        this.total = (total >= 0) ? total : 0;
    }

    public int getNumero()      { return numero; }
    public Cliente getCliente() { return cliente; }
    public double getTotal()    { return total; }

    public double calcularTotal() {
        return total;
    }

    public void mostrar() {
        System.out.println("---- Factura #" + numero + " ----");
        cliente.mostrar();
        System.out.println("Total:   Q" + calcularTotal());
    }
}
