package ejercicios;

public class Empleado {
    private String nombre; // atributos
    private double salario;

    public Empleado(String nombre, double salario) {
        setNombre(nombre);
        setSalario(salario);
    }

    public void setNombre(String nombre) {
        this.nombre = (nombre != null && !nombre.isBlank()) ? nombre : "Sin nombre";
    }

    public void setSalario(double salario) {
        this.salario = (salario >= 0) ? salario : 0;
    }

    public String getNombre()  { return nombre; }
    public double getSalario() { return salario; }

    public double calcularSalario() { // metodo a sobreescribir
        return salario;
    }

    public void mostrar() { // metodo para sobreescribir
        System.out.println("Nombre:  " + nombre);
        System.out.println("Salario: Q" + calcularSalario());
    }
}