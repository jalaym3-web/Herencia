package ejercicios;

public class Libro {
    private String titulo; // atributos
    private String autor;

    public Libro(String titulo, String autor) {
        setTitulo(titulo);
        setAutor(autor);
    }

    public void setTitulo(String titulo) {
        this.titulo = (titulo != null && !titulo.isBlank()) ? titulo : "Sin título";
    }

    public void setAutor(String autor) {
        this.autor = (autor != null && !autor.isBlank()) ? autor : "Sin autor";
    }

    public String getTitulo() { return titulo; }
    public String getAutor()  { return autor; }

    public void mostrarInfo() { // metodo que se va a sobreescribir
        System.out.println("Título: " + titulo);
        System.out.println("Autor:  " + autor);
    }
}
