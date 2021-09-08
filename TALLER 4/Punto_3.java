
package punto_3;


public class Punto_3 {
    private double largo, w, alt;
    public Punto_3(){
    }
    
    public Punto_3(double largo, double w, double alt){
        this.alt=alt;
        this.w=w ;
        this.largo = largo;
    }
    public double getLargo() {
        return largo;
    }
    public void setLargo(double largo) {
        this.largo = largo;
    }
    public double getAncho() {
        return w;
    }
    public void setAncho(double w) {
        this.w = w;
    }
    public double getAlto() {
        return alt;
    }
    public void setAlto(double alt) {
        this.alt = alt;
    }
    
    public double CantidadEnchape(){
        return this.w*this.largo;
    }
    public double CantidadTapizado(){
        
        return 2*(this.alt*this.w) + 2 * (this.alt*this.largo);
    }   
}
