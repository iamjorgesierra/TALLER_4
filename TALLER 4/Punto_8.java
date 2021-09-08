
package punto_8;


public class Punto_8 {
    String ttl;
    String ato;
    String isbn;
    int pag;
    String edi;
    String Edital;
    String lgr;
    String f_edi;
    
    public Punto_8() {
    }

    public Punto_8(String titulo, String autor, String ISBN, int paginas, String edicion, String editorial, String lugar, String fecha_edicion) {
        this.ttl = titulo;
        this.ato = autor;
        this.isbn = ISBN;
        this.pag = 200;
        this.edi = edicion;
        this.Edital = editorial;
        this.lgr = lugar;
        this.f_edi = fecha_edicion;
    
    }

    //ACCEDENTES Y MUTADORES
    public String getTitulo() {
        return this.ttl;
    }

    public void setTitulo(String titulo) {
        this.ttl = titulo;
    }

    public String getAutor() {
        return ato;
    }

    public void setAutor(String autor) {
        this.ato = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String ISBN) {
        this.isbn = ISBN;
    }

    public int getPaginas() {
        return pag;
    }

    public void setPaginas(int paginas) {
        this.pag = paginas;
    }

    public String getEdicion() {
        return edi;
    }

    public void setEdicion(String edicion) {
        this.edi = edicion;
    }

    public String getEditorial() {
        return Edital;
    }

    public void setEditorial(String editorial) {
        this.Edital = editorial;
    }

    public String getLugar() {
        return lgr;
    }

    public void setLugar(String ciudad,String pais) {
        this.lgr = ciudad+"("+pais+")";
    }

    public String getFechaEdicion() {
        return f_edi;
    }

    public void setFechaEdicion(String fecha_edicion) {
        this.f_edi = fecha_edicion;
    }
   
    
}
