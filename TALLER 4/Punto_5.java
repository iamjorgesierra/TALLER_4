
package punto_5;


public class Punto_5 {
    private double w;
    private double h;
    private double ladoA;
    private double ladoB;
    private double ladoC;
    private double anB;
    private final double anA;
    
    public Punto_5(){
        this.w = 5;
        this.h=10;
        this.ladoA= 14;
        this.ladoB=14;
        this.ladoC=7;
        this.anA= 15;
        this.anB=18;               
    }
    public double getBase(){
        return this.w;
    }     
    public double getAltura(){
        return this.h;
    }    
     public double getladoA(){
        return this.h;
    }    
    public double getladoB(){
        return this.h;
    }   
    public double getladoC(){
        return this.h;
    }   
    public double getanguloA(){
        return this.h;
    }   
    public double getanguloB(){
        return this.h;
    }
    public void setBase(double w){
        this.w = w;
    }    
    public void setAltura(double h){
        this.h = h;
    }
    public void setladoA(double ladoa){
        this.ladoA = ladoa;
    }
    public void setladoB(double ladob){
        this.ladoB = ladob;
    }
    public void setladoC(double ladoc){
        this.ladoC = ladoc;
    }   
    public void setanguloA(double anA){
        this.anB = anA;
    }
    public void setanguloB(double anB){
        this.anB = anB;
    }
    public double calcularArea(){
        return (this.w * this.h)/2;
    }    
    public double calcularPerimetro(){
        return 2*(this.h + this.w);        
    }
     public double calcularlongitud(){
        return (this.ladoA + this.ladoB + this.ladoC);
    } 
    public double calcularAngulovertice(){
        return (this.anA+ this.anB);
    }
    
}
