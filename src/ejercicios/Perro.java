package ejercicios;

public class Perro extends Animal {

    public Perro(String nombre) {
        super(nombre); // atributo que se hereda
    }

    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " dice: ¡Guau guau!");
    }
}