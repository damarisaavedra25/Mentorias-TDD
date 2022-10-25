import org.junit.Assert;
import org.junit.Test;

import java.util.Scanner;

public class MainTest {

    @Test
    public void testSuma() {
        Calculadora miCalculadora = new Calculadora();
        int resultado = miCalculadora.suma(10, 10);
        Assert.assertEquals(20, resultado);
    }

    @Test
    public void testResta() {
        Calculadora miCalculadora = new Calculadora();
        int resultado = miCalculadora.resta(10, 10);
        Assert.assertEquals(0, resultado);
    }

    @Test
    public void testDivisionEntreCero() {
        Calculadora miCalculadora = new Calculadora();
        try {
            miCalculadora.division(100, 0);
        } catch (Exception e) {
            Assert.assertEquals("Numero no puede ser dividio entre cero.", e.getMessage());
            Assert.assertEquals(Exception.class, e.getClass());

        }
    }

    @Test
    public void testMultiplicacion() {
        Calculadora miCalculadora = new Calculadora();
        int resultado = miCalculadora.multiplicacion(10, 10);
        Assert.assertEquals(100, resultado);
    }

    @Test
    public void divisionNormal() throws Exception {

        Calculadora miCalculadora = new Calculadora();
        int resultado = miCalculadora.division(200, 1);
        Assert.assertEquals(200, resultado);
    }

    @Test
    public void testPorcentaje() {

        Calculadora miCalculadora = new Calculadora();
        int resultado = miCalculadora.porcentaje(10, 1);
        Assert.assertNotEquals(1000, resultado);
    }
    //Mentorias //1 suma con numeros negativos
    @Test
    public void testSumanegativa() {
        Calculadora miCalculadora = new Calculadora();
        int resultado = miCalculadora.sumanegativa(-10, -10);
        Assert.assertEquals(-20, resultado);
    }

    //Mentorias //2 suma con numeros
    @Test
    public void testSumaFlotantes() {
        Calculadora miCalculadora = new Calculadora();
        float resultado = miCalculadora.sumaflotantes(10.20f, 10.80f);
        Assert.assertEquals(21, resultado, 0);
    }


    //Mentorias //2 suma con dobles
    @Test
    public void testSumaDobles() {
        Calculadora miCalculadora = new Calculadora();
        double resultado = miCalculadora.sumaDobles(10.5, 10.5);
        Assert.assertEquals(11, resultado, 0);
    }

    //Mentorias //2 suma con numeros
    @Test
    public void testSumaGigantes() {
        Calculadora miCalculadora = new Calculadora();
        long resultado = miCalculadora.sumaGigantes(2000000, 1000000);
        Assert.assertEquals(3000000, resultado, 0);
    }

    @Test
    public void testMayoraDiez(){
        Calculadora miCalculadora = new Calculadora();
        boolean resultado = miCalculadora.esMayoraDiez(24);

        Assert.assertTrue(resultado);
    }

    @Test
    public void testDescripcion() {
        Nota miNota = new Nota();
        String respuesta = miNota.IsEmpty("esto es una prueba");

        Assert.assertNotNull(respuesta);
    }

    //unit testing c/ arreglos
    @Test
    public void arrayAreEquals(){
        Calculadora miCalculadora = new Calculadora();

        Assert.assertArrayEquals(miCalculadora.expectedOutput, miCalculadora.methodOutput);
    }
    @Test
    public void dosMasDosIgualCuatro(){
        Calculadora miCalculadora = new Calculadora();
        Assert.assertTrue(miCalculadora.add(2, 2) == 4);
    }
}
