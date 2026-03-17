package vallegrandeledu.pe.poo_14_jorgevilcapuma.actividad5_constructor;

public class Producto {

    String nombre;
    double precio;

    public Producto(String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    public void mostrarDatos(){
        System.out.println("Nombre del producto: " + nombre);
        System.out.println("Precio: " + precio);
    }

    public void vender(){
        System.out.println("El producto " + nombre + " ha sido vendido.");
    }

    public static void main(String[] args) {

        Producto obj = new Producto("Laptop", 3500);

        obj.mostrarDatos();
        obj.vender();

    }
}