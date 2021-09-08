
package punto_7;


public class Punto_7 {
        private int Cdg ;
        private double cmp, vnt;
        private double util;
    
    public Punto_7(){
    }
    public Punto_7(int Cdg, double vnt, int util) {
        this.Cdg = Cdg;
        this.cmp = vnt;
        this.util = util;
    }
    public void setCodigo(int cdg) {
        this.Cdg = cdg;
    }
    public void setPCompra(double cmp) {
        this.cmp = cmp;
    }
    public void setPVenta(double vnt) {
        this.vnt = vnt;
    }
    public void setPUtilidad(double util) {
        this.util = util;
    }
    public int getCodigo() {
        return Cdg;
    }
    public double getPCompra() {
        return cmp;
    }
    public double getPVenta() {
        return vnt;
    }
    public double getPUtilidad() {
        return util;
    }
    public double calcularPVenta(){
        return  this.cmp * util;
   }
}
