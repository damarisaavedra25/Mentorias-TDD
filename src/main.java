import java.util.Scanner;

//TDD - Test Driven Development
class Calculadora {
    //propiedades
    int numero1, numero2;
    public int[] expectedOutput = {1, 2, 3};
    public int[] methodOutput = {1, 2, 3};


    //metodos
    public int suma(int x, int y) {
        return x + y;
    }

    public int resta(int x, int y) {
        return x - y;
    }

    public int division(int x, int y) throws Exception {
        if (x != 0 && y != 0) {
            return x / y;
        } else {
            throw new Exception("Numero no puede ser dividio entre cero.");
        }
    }

    public int multiplicacion(int x, int y) {
        return x * y;
    }

    public int porcentaje(int x, int y) {
        return x / y * 100;
    }

    public int sumanegativa(int x, int y) {
        return x + y;
    }

    public float sumaflotantes(float x, float y) {
        return x + y;
    }


    public double sumaDobles(double x, double y) {
        return x + y;
    }


    public long sumaGigantes(long x, long y) {
        return x + y;
    }

    public boolean esMayoraDiez(int numero) {
        if (numero > 10) {
            return true;
        } else {
            return false;
        }
    }

    public int add (int numberA, int numberB){
        return numberA + numberB;
    }
}
