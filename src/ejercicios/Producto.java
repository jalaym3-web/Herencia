package ejercicios;

public class Producto {
	 private String nombre;
	    private double precio;

	    public Producto(String nombre, double precio) {
	        setNombre(nombre);
	        setPrecio(precio);
	    }

	    public void setNombre(String nombre) {
	        this.nombre = (nombre != null && !nombre.isBlank()) ? nombre : "Sin nombre"; // verifica que exista nombre
	    }

	    public void setPrecio(double precio) {
	        this.precio = (precio >= 0) ? precio : 0;
	    }

	    public String getNombre() { return nombre; }
	    public double getPrecio() { return precio; }

	    public boolean estaVencido() {
	        return false; // un producto base nunca vence
	    }

	    public void mostrar() {
	        System.out.println("Nombre:  " + nombre);
	        System.out.println("Precio:  Q" + precio);
	        System.out.println("Vencido: " + estaVencido());
	    }
}
