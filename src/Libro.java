

public class Libro {
    private String titulo;
    private String autor;
    private String editorial;
    private int añoPublicacion;
    private int numeroPaginas;

    public Libro(String titulo, String autor, String editorial, int añoPublicacion, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.añoPublicacion = añoPublicacion;
        this.numeroPaginas = numeroPaginas;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return this.editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getAñoPublicacion() {
        return this.añoPublicacion;
    }

    public void setAñoPublicacion(int añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }

    public int getNumeroPaginas() {
        return this.numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public String toString() {
        return "Libro{titulo='" + this.titulo + "', autor='" + this.autor + "', editorial='" + this.editorial + "', añoPublicacion=" + this.añoPublicacion + ", numeroPaginas=" + this.numeroPaginas + "}";
    }
}
