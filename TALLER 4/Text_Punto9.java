
package punto_9;

import java.util.Scanner;


public class Text_Punto9 {
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        String nom, num;
        double tp, imp,cong, ret;

        Punto_9 Cuenta = new Punto_9();

        System.out.print("Ingrese nombre del cliente: ");
        nom = leer.nextLine();
        System.out.print("Ingrese número de la cuenta : ");
        num = leer.nextLine();
        System.out.print("El Saldo: ");
        imp = leer.nextDouble();
        System.out.print("Ingrese el saldo a Consignar: ");
        cong = leer.nextDouble();
        System.out.print("Ingrese el saldo a Retirar: ");
        ret = leer.nextDouble();      
        Cuenta.setNombre(nom);
        Cuenta.setNumCuenta(num);
        Cuenta.setSaldo(imp);
        System.out.println("\n***DATOS DE CUENTA***");
        System.out.println("NOMBRE DEL TITULAR: " + Cuenta.getNombre());
        System.out.println("NUMERO DE LA CUENTA: " + Cuenta.getNumCuenta());
        System.out.println("SALDO: " + Cuenta.getSaldo());
        System.out.println();
        Cuenta.Consignar(cong);
        System.out.println("SALDO DESPUES DE CONSIGNAR: " + Cuenta.getSaldo());       
        Cuenta.Retirar(ret);
        System.out.println("SALDO DESPUES DE RETIRAR: " + Cuenta.getSaldo());



       }
}
