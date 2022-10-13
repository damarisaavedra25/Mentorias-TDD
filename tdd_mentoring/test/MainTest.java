import org.junit.Assert;
import org.junit.Test;

public class MainTest {

    @Test
    public void testSuma(){
        Calculadora miCalculadora = new Calculadora();
        int resultado = miCalculadora.suma(10,10);
        Assert.assertEquals( 20, resultado);
    }

    @Test
    public void testResta(){
        Calculadora miCalculadora = new Calculadora();
        int resultado = miCalculadora.resta(10,10);
        Assert.assertEquals( 0, resultado);
    }

    @Test
    public void testDivisionEntreCero(){
        Calculadora miCalculadora = new Calculadora();
        try {
            miCalculadora.division(100,0);
        } catch (Exception e) {
            Assert.assertEquals("Not found 404", e.getMessage());
            Assert.assertEquals(Exception.class, e.getClass());
        }
    }

    public void testOperaction(){

        Calculadora miCalculadora = new Calculadora();
        miCalculadora.insertaPrimerNumero(1);
        miCalculadora.ejeutaOperaction("-", 2);

        Assert.assertEquals(1,2);
    }
}
