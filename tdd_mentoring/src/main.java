import java.util.Scanner;

//TDD - Test Driven Development
class Calculadora {
    int numero1, numero2;

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
    public int porcentaje(int x, int y) { return x / y *100;}
}
//    public int multiplicacion(int x, int y) {
//        return x * y;
//    }
//    public void capturaNumeros(){
//        Scanner myInput= new Scanner(System.in);
//        System.out.println("Inserta el primer numero");
//        numero1 = myInput.nextInt();
//        System.out.println("Inserta el segundo numero");
//        numero2 = myInput.nextInt();
//
//        System.out.print(" Si se suma un número mayor que cero y un número menor que cero: se restan y se deja el signo del número con mayor valor absoluto");
//    }
//
//    public void ejeutaOperaction(String s, int i) {
//    }