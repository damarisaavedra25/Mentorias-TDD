
//TDD - Test Driven Development
class Calculadora {

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
}