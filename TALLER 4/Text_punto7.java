
package punto_7;


public class Text_punto7 {
    public static void main(String[] args) {
        Punto_7 mpro=new Punto_7();
        mpro.setCodigo(5978);
        mpro.setPCompra(50.00);
        mpro.setPUtilidad(0.5);
        imprimirInfoProducto(mpro);
    }
        public static void imprimirInfoProducto(Punto_7 r){
        System.out.println("El codigo de producto: "+ r.getCodigo());
        System.out.println("El precio de compra: "+ r.getPCompra());
        System.out.println("El precio de utilidad: "+ r.getPUtilidad());
        System.out.println("El precio de venta: "+ r.calcularPVenta());
        System.out.println("******************************************");
    }
}
