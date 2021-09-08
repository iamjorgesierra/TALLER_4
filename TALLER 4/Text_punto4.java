
package punto_4;

import java.util.Scanner;

public class Text_punto4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Punto_4 Coche = new Punto_4();
        
        System.out.println("Favor ingrese el color del coche: ");
        String clr = leer.nextLine(); 
        System.out.println("Favor ingrese la marca del coche: ");
        String mc = leer.nextLine();       
        System.out.println("Favor ingrese el modelo del coche: ");
        String mdo = leer.nextLine();       
        System.out.println("Favor ingrese lugar de la matricula del coche: ");
        String mta = leer.nextLine();       
        System.out.println("Favor ingrese los caballos de fuerza del coche: ");
        int cbll = leer.nextInt();  
        System.out.println("Favor ingrese el numero de puertas del coche: ");
        int pta = leer.nextInt();
       
        Coche.setColor(clr);
        Coche.setMarca(mc);
        Coche.setModelo(mdo);
        Coche.setCaballos(cbll);
        Coche.setPuertas(pta);
        Coche.setMatricula(mta);
        
        System.out.println("\n**DATOS DEL COCHE:");
        System.out.println("El color: " + Coche.getColor());
        System.out.println("La marca: " + Coche.getMarca());
        System.out.println("El modelo: " + Coche.getModelo());
        System.out.println("Los caballos de fuerza: " + Coche.getCaballos());
        System.out.println("El numero de puertas: " + Coche.getPuertas());
        System.out.println("La matricula: " + Coche.getMatricula());
                 
    }
}
