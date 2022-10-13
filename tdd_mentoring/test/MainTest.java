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
        int resultado = miCalculadora.porcentaje(10,1);
        Assert.assertNotEquals(1000,resultado);
    }
}
//    }
//    @Test
//  public void testOperaction(){
//
//        Calculadora miCalculadora = new Calculadora();
////        Scanner myInput= new Scanner(System.in);
//
////        System.out.println("Inserta el primer numero");
////        int numero1 = myInput.nextInt();
////        miCalculadora.insertaPrimerNumero(numero1);
////        System.out.println("Inserta el segundo numero");
////        int numero2 = myInput.nextInt();
////
////        System.out.print();
//
//
//
//        miCalculadora.capturaNumeros();
//        Assert.assertNotNull(miCalculadora.numero1);
//        Assert.assertNotNull(miCalculadora.numero2);
////        miCalculadora.ejeutaOperaction("-", 2);
////
//        Assert.assertEquals(-1,2);
//    }
//}
