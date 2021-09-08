
package punto_2;

import java.util.Scanner;


public class Text_punto2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Favor ingrese el valor de (x): ");
        int x = leer.nextInt();
        
        Punto_2 e = new Punto_2();
        e.setA(3);
        e.setB(2);
        e.setC(5);
        
        System.out.printf("Y= %.2f%n",x, e.CalcularEcuacion(x) );
   
        Punto_2 eSobrecargada = new Punto_2(3,2,5);
        System.out.printf("* Y= %.2f%n",x, eSobrecargada.CalcularEcuacion(x) );
        
        Punto_2 eSobrecargada2 = new Punto_2(3,2);
        System.out.printf("* Y= %.2f%n",x, eSobrecargada2.CalcularEcuacion(x) );       
    }
}
