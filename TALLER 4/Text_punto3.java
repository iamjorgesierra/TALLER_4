
package punto_3;


public class Text_punto3 {
    public static void main(String[] args) {
          Punto_3 A = new Punto_3();
        imprimirHabitacion(A);
        Punto_3 B = new Punto_3(4,3,2);
        imprimirHabitacion(B);
    } 
    public static void  imprimirHabitacion(Punto_3 h){
        System.out.println("El largo: " + h.getLargo());
        System.out.println("El ancho: " +h.getAncho());
        System.out.println("El alto: " + h.getAlto());
        System.out.println("El tapizado: " + h.CantidadTapizado());
        System.out.println("El enchape: " + h.CantidadEnchape());
        System.out.println("*******************************");
    }
}
