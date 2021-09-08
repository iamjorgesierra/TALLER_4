
package punto_12;


public class Punto_12 {
     private double vlin;
    private double grd;
    private double tim;
    
    public Punto_12(){
      
    }
  
    public double getVelocidadInicial() {
        return vlin;
    }

    public Double getGravedad() {
        return grd;
    }

    public double getTiempo() {
        return tim;
    }

    public void setVelocidadInicial(int velin) {
        this.vlin = velin;
    }

    public void setGravedad(Double grad) {
        this.grd = grad;
    }

    public void setTiempo(int tim) {
        this.tim = tim;
    }
    public double CalcularDistancia(){
        double distancia = 0.5 * grd * Math.pow(tim,2);
        return distancia;
    }
  
    public double VelocidadFinal(){
        
        double VelocidadFinal = this.vlin + grd * tim;
        return VelocidadFinal;
    }  
}
