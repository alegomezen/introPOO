
package Entidad;


public class Libro {
    private int ISBN;
    private String titulo;
    private String autor;
    private int numPags;
    ///creamos los atributos 

    public Libro() {
    }

    public Libro(int ISBN, String titulo, String autor, int numPags) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numPags = numPags;
    }
    //Creamos los constructores. 

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPags() {
        return numPags;
    }

    public void setNumPags(int numPags) {
        this.numPags = numPags;
    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", numPags=" + numPags + '}';
    }
    
    
    
}
