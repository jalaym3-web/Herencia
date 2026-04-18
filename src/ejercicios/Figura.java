package ejercicios;

public class Figura {
    private String color;

    public Figura(String color) {
        setColor(color);
    }

    public void setColor(String color) {
        this.color = (color != null && !color.isBlank()) ? color : "Sin color";
    }

    public String getColor() { return color; }

    public double calcularArea() {
        return 0;
    }

    public void mostrar() { // metodo para sobreescribir
        System.out.println("Color: " + color);
        System.out.println("Área:  " + calcularArea());
    }
}