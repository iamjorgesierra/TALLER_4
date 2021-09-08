
package punto_6;

import java.util.Scanner;


public class Text_punto6 {
    public static void main(String[] args) {  
    Scanner leer = new Scanner(System.in);
    int vl,pto,pño;
        Punto_6 b = new Punto_6();
        b.setVelocidad1(16);
        b.setPlato1(15);
        b.setPiñon1(5);
        imprimirInfoBicicleta(b);
        System.out.print("Ingrese la velocidad: ");
        vl = leer.nextInt();
        System.out.print("Ingrese el plato: ");
        pto = leer.nextInt();
        System.out.print("Ingrese el piñon: ");
        pño = leer.nextInt();
        
        Punto_6 a = new Punto_6();
        a.setVelocidad1(16);
        a.setPlato1(15);
        a.setPiñon1(5);
        a.setVelocidad2(vl);
        a.setPlato2(pto);
        a.setPiñon2(pño);
        imprimirInfoBicicleta(a);
             
    }
        public static void imprimirInfoBicicleta(Punto_6 r){
        System.out.println("\nLa velocidad: "+ r.getVelocidad1());
        System.out.println("EL plato: "+ r.getPlato1());
        System.out.println("El piñon: "+ r.getPiñon1());
        System.out.println("*****************************************");
}
}