
package punto_1;


public class Punto_1 {
    private double bs;
    private double H;
    
    public static final String CL="Blanco";
 
    public Punto_1(){
        this.bs = 5;
        this.H=10;
    }
    public double getBase(){
        return this.bs;
    }      
    public double getAltura(){
        return this.H;
    }  
    public void setBase(double bs){
        this.bs = bs;
    }    
    public void setAltura(double H){
        this.H = H;
    }   
    public double CalcularArea(){
        return this.bs * this.H;
    } 
    public double CalcularPerimetro(){
        return 2*(this.H + this.bs);
    }
}

    
    
    

