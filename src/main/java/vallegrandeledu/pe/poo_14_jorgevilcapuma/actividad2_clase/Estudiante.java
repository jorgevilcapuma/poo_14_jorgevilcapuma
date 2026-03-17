package vallegrandeledu.pe.poo_14_jorgevilcapuma.actividad2_clase;

public class Estudiante {

    String nombre;
    int edad;

    public void estudiar(){
        System.out.println(nombre + " está estudiando");
    }

    public void mostrarDatos(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

    public static void main(String[] args) {

        Estudiante obj = new Estudiante();

        obj.nombre = "Jorge";
        obj.edad = 20;

        obj.estudiar();
        obj.mostrarDatos();

    }
}