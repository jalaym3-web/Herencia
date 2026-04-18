package ejercicios;

public class Moto extends Vehiculo {
    private int cilindrada;

    public Moto(String marca, int velocidad, int cilindrada) {
        super(marca, velocidad); // atributos heredados
        setCilindrada(cilindrada);
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = (cilindrada > 0) ? cilindrada : 50;
    }

    public int getCilindrada() { return cilindrada; }

    @Override // metodo que sobreescribe y agrega cilindrada
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Cilindrada: " + cilindrada + " cc");
    }
}
