package vallegrandeledu.pe.poo_14_jorgevilcapuma.actividad4_parametros;

public class CalculadoraParametros {

    public void sumar(int a, int b){
        int resultado = a + b;
        System.out.println("Suma: " + resultado);
    }

    public void multiplicar(int a, int b){
        int resultado = a * b;
        System.out.println("Multiplicación: " + resultado);
    }

    public static void main(String[] args) {

        CalculadoraParametros calc = new CalculadoraParametros();

        calc.sumar(5,3);
        calc.multiplicar(4,2);

    }
}