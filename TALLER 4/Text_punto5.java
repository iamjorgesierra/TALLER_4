
package punto_5;


public class Text_punto5 {
    public static void main(String[] args) {
        Punto_5 T = new Punto_5();
        T.setBase(40);
        T.setAltura(20);
        T.setladoA(18);
        T.setladoB(18);
        T.setladoC(9);
        T.setanguloA(20);
        T.setanguloB(30);
        
        imprimirInfoTriangulo(T); 
    }
    
   public static void imprimirInfoTriangulo(Punto_5 r){
        System.out.println("Area: " + r.calcularArea());
        System.out.println("Longitud lados iguales: "+ r.calcularlongitud());
        System.out.println("Perimetro: " + r.calcularPerimetro());
        System.out.println("El angulo vertice es de: " + r.calcularAngulovertice());
        System.out.println("***************************************");
    }
}
