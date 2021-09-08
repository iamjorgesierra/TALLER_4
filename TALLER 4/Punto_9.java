
package punto_9;


public class Punto_9 {
    private String nomcli;
    private String numcu;
    private double sld;

    public Punto_9() {
    }

    public Punto_9(String nomcuenta , String numcu, double tpint, double ald) {                         
        this.nomcli = nomcuenta ;
        this.numcu = numcu;
        this.sld = ald;
    }

    public Punto_9(final Punto_9 c) {
        nomcli = c.nomcli;
        numcu = c.numcu;
        sld = c.sld;
    }

    //getters y setters
    public String getNombre() {
        return nomcli;
    }

    public String getNumCuenta() {
        return numcu;
    }

    public double getSaldo() {
        return sld;
    }
    
    public void setNombre(String nomcli) {
        nomcli = nomcli;
    }

    public void setNumCuenta(String cuenta) {
        numcu = cuenta;
    }

    public void setSaldo(double Saldo) {
        sld = Saldo;
    }

    

    //método ingreso
    public boolean Consignar(double n) {
        boolean IngresoCorrecto = true;
        if (n < 0) {
            IngresoCorrecto = false;
        } else {
            sld = sld + n;
        }
        return IngresoCorrecto;
    }

    public boolean Retirar(double n) {
        boolean RetiroCorrecto = true;                                                                         
        if (n < 0) {
            RetiroCorrecto = false;
        } else if (sld >= n) {
            sld -= n;
        } else {
            RetiroCorrecto = false;
        }
        return RetiroCorrecto;
    }
  
    
}
