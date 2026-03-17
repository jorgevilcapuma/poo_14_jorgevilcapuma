package vallegrandeledu.pe.poo_14_jorgevilcapuma.actividad3_retorno;

public class Operacion {

    int a = 10;
    int b = 5;

    public int sumar(){
        return a + b;
    }

    public int restar(){
        return a - b;
    }

    public static void main(String[] args) {

        Operacion op = new Operacion();

        int suma = op.sumar();
        int resta = op.restar();

        System.out.println("Resultado de la suma: " + suma);
        System.out.println("Resultado de la resta: " + resta);

    }
}