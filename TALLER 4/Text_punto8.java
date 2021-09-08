
package punto_8;


public class Text_punto8 {
     public static void main(String[] args) {
        Punto_8 miLibro = new Punto_8();
        miLibro.setTitulo("CIEN AÑOS DE SOLEDAD");
        miLibro.setAutor("GABRIEL GARCIA MARQUEZ");
        miLibro.setIsbn("0-13-031997-X Prentice-Hall");
        miLibro.setPaginas(200);
        miLibro.setEdicion("3.");
        miLibro.setEditorial("MUNDO PLANETA");
        miLibro.setLugar(" COLOMBIA", "BOGOTA");
        miLibro.setFechaEdicion("10 de Agosto 1994");
        imprimirInfoLibro(miLibro);
     
    }
    
    
    public static void imprimirInfoLibro(Punto_8 r){
        System.out.println("Titulo: " + r.getTitulo());
        System.out.println(r.getEdicion() + "Edicion");
        System.out.println("Autor: "+ r.getAutor());
        System.out.println("ISBN: " + r.getIsbn());
        System.out.println(r.getEditorial() + ","+ r.getLugar() + ","+ r.getFechaEdicion());
        System.out.println(r.getPaginas() + " Paginas");
        System.out.println("-----------------------------------");
    }
}
