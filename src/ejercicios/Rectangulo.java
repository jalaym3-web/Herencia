package ejercicios;

public class Rectangulo extends Figura {
    private double base;
    private double altura;

    public Rectangulo(String color, double base, double altura) {
        super(color); // hereda los atributos
        setBase(base);
        setAltura(altura);
    }

    public void setBase(double base) {
        this.base = (base > 0) ? base : 1;
    }

    public void setAltura(double altura) {
        this.altura = (altura > 0) ? altura : 1;
    }

    public double getBase()   { return base; }
    public double getAltura() { return altura; }

    @Override // sobre escribe el metodo
    public double calcularArea() {
        return base * altura;
    }

    @Override // sobreescribe el metodo y agrega atributos
    public void mostrar() {
        super.mostrar();
        System.out.println("Base:   " + base);
        System.out.println("Altura: " + altura);
    }
}
