package ejercicios;

import java.time.LocalDate;

public class ProductoPerecedero extends Producto {
    private LocalDate fechaVencimiento;

    public ProductoPerecedero(String nombre, double precio, LocalDate fechaVencimiento) {
        super(nombre, precio); // atributos heredados
        setFechaVencimiento(fechaVencimiento);
    }

    public void setFechaVencimiento(LocalDate fecha) {
        this.fechaVencimiento = (fecha != null) ? fecha : LocalDate.now();// compara la fecha de vencimiento con la hora local
    }

    public LocalDate getFechaVencimiento() { return fechaVencimiento; }

    @Override
    public boolean estaVencido() { // metodo para sobreescribir
        return LocalDate.now().isAfter(fechaVencimiento);
    }

    @Override
    public void mostrar() { // metodo que se sobreescribe
        super.mostrar();
        System.out.println("Vencimiento: " + fechaVencimiento);
    }
}