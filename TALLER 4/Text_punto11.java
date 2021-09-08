
package punto_11;


public class Text_punto11 {
      static public void main(String[] args) {
     Punto_11 x=new Punto_11(8,2);
     Punto_11 y=new Punto_11(4,7);
     Punto_11 z=new Punto_11(2,8);
     System.out.println("x-->  "+x);
     System.out.println("y-->  "+y);
     System.out.println("z-->  "+z);
     System.out.println("**SUMA= "+Punto_11.SumarFraccion(x, y));
     System.out.println("**RESTA= "+Punto_11.RestarFraccion(x, y));
     System.out.println("**MULTIPLICACION= "+Punto_11.MultiplicarFraccion(x,y));

     Punto_11 resultado=Punto_11.MultiplicarFraccion(Punto_11.SumarFraccion(x,y),z);
     System.out.println("\n**SIMPLIFICACION=  " + resultado);
     System.out.println(resultado.SimplificarFraccion());
     try  {
            System.in.read();
        }catch (Exception e) {  }
    }
}
