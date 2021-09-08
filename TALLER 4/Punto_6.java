
package punto_6;


public class Punto_6 {
    private int vl, vl2, pto,pto2,  pño, pño2;
    public Punto_6(){  
    }
    public Punto_6(int velocidad, int velocidad2, int plato, int plato2, int piñon, int piñon2) {
        this.vl = velocidad;
        this.vl2 = velocidad2;
        this.pto = plato;
        this.pto2 = plato2;
        this.pño = piñon;
        this.pño2 = piñon2;
    }
    public int getVelocidad1() {
        return vl;
    }
    public int getVelocidad2() {
        return vl2;
    }
    public int getPlato1() {
        return pto;
    }   
    public int getPlato2() {
        return pto2;
    }
    public int getPiñon1() {
        return pño;
    }
    public int getPiñon2() {
        return pño;
    }
    public void setVelocidad1(int vl) {
        this.vl = vl;
    }
    public void setVelocidad2(int vl2) {
        this.vl = vl2;
    }
    public void setPlato1(int pto) {
        this.pto = pto;
    }    
    public void setPlato2(int pto2) {
        this.pto = pto2;
    }
    public void setPiñon1(int pño) {
        this.pño = pño;
    } 
    public void setPiñon2(int pño2) {
        this.pño = pño2;
    }  
}
