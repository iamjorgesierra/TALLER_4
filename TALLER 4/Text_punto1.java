
package punto_1;


public class Text_punto1 {
    public static void main(String[] args) {
        Punto_1 a = new Punto_1();
        a.setAltura(20);
        a.setBase(10);
        imprimirInfoEjercicio1(a);       
        Punto_1 b = new Punto_1();
        imprimirInfoEjercicio1(b);       
    } 
    public static void imprimirInfoEjercicio1(Punto_1 r){
        System.out.println("La base: " + r.getBase());
        System.out.println("La altura: "+ r.getAltura());
        System.out.println("El color: " + Punto_1.CL);
        System.out.println("El area: " + r.CalcularArea());
        System.out.println("El perimetro"+r.CalcularPerimetro());
        System.out.println("****************************");
    }
}
