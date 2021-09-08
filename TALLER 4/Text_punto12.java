
package punto_12;

import java.util.Scanner;


public class Text_punto12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Punto_12 caidaL = new Punto_12();
        int velin,tim;
        System.out.println("**INGRESE LA VELOCIDAD INICIAL: ");
        velin=entrada.nextInt();  
        System.out.println("**INGRESE EL TIEMPO EN SEGUNDOS (S): ");
        tim=entrada.nextInt();
        caidaL.setVelocidadInicial(velin);
        caidaL.setTiempo(tim);
        caidaL.setGravedad(9.8);
        ImprimirInfoCaidaLibre(caidaL);
    }
    public static void ImprimirInfoCaidaLibre(Punto_12 r) {
        System.out.println("**LA DISTANCIA QUE SE HA RECORRIDO ES: " + r.CalcularDistancia()+ " metros");
        System.out.println("**VELOCIDAD FINAL: " + r.VelocidadFinal() + " m/s");   
    }
}
