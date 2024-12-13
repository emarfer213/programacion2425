package tema4.ej6;

public class AppProducto {

    public static void main(String[] args){
        Producto producto1 = new Producto( "leche", 9.30);
        Producto producto2 = new Producto( "Pan", 3.30);

        System.out.println(producto1);
        System.out.println(producto1.calculoPrecio() + "€");

        System.out.println(producto2);
        System.out.println(producto2.calculoPrecio() + "€");
    }
}
