
package punto_4;


public class Punto_4 {

    private String clr;
    private String mc;
    private String mdo;
    private int cbll;
    private int pta;
    private String mta;
    
    public Punto_4(){
    
    }
    
    public String getColor(){
        return this.clr;
    }
    public String getMarca(){
        return this.mc;
    }
    public String getModelo(){
        return this.mdo;
     }
    public int getCaballos(){
        return this.cbll;
    }
    public int getPuertas(){
        return this.pta;
    }
    public String getMatricula(){
        return this.mta;
    }
    
    public void setColor(String clr){
        this.clr=clr;
    }
     public void setMarca(String mc){
        this.mc=mc;
    }
     
    public void setModelo(String mdo){
       this.mdo=mdo;
    }
    public void setCaballos(int cbll){
       this.cbll=cbll;
    }
    public void setPuertas(int pta){
        this.pta=pta;
    }
    public void setMatricula (String mta){
        this.mta=mta;
    }
    }
    
