
package punto_11;


public class Punto_11 {
    private int numd;
    private int dend;
  public Punto_11() {
     numd=0;
     dend=1;
  }
  public Punto_11(int x, int y) {
     numd=x;
     dend=y;
  }
  public static Punto_11 SumarFraccion(Punto_11 a, Punto_11 b){
     Punto_11 c=new Punto_11();
     c.numd=a.numd*b.dend+b.numd*a.dend;
     c.dend=a.dend*b.dend;
     return c;
  }
  public static Punto_11 RestarFraccion(Punto_11 a, Punto_11 b){
     Punto_11 c=new Punto_11();
     c.numd=a.numd*b.dend-b.numd*a.dend;
     c.dend=a.dend*b.dend;
     return c;
  }
  public static Punto_11 MultiplicarFraccion(Punto_11 a, Punto_11 b){
     return new Punto_11(a.numd*b.numd, a.dend*b.dend);
  }
  public static Punto_11 Inversa(Punto_11 a){
     return new Punto_11(a.dend, a.numd);
  }
  public static Punto_11 DividirFraccion(Punto_11 a, Punto_11 b){
     return MultiplicarFraccion(a, Inversa(b));
  }
  private int mcd(){
     int u=Math.abs(numd);
     int v=Math.abs(dend);
     if(v==0){
          return u;
     }
     int r;
     while(v!=0){
          r=u%v;
          u=v;
          v=r;
     }
     return u;
  }
  public Punto_11 SimplificarFraccion(){
     int dividir=mcd();
     numd/=dividir;
     dend/=dividir;
     return this;
  }
     @Override
  public String toString(){
     String texto=numd+ " / " + dend;
     return texto;
  }   
}
