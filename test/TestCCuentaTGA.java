import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TestCCuentaTGA {

    @Test
    public void testSaldoTGA() {
        CCuenta miCuenta=new CCuenta("Ana","ES08-3456-2343-2345-1234-1234",3200,1);
        assertNotNull(miCuenta);
    }

    @Test
    public void testingresarTGA() {
        CCuenta ingrs=new CCuenta("Ana","ES08-3456-2343-2345-1234-1234",3200,1);
        assertEquals(3200,ingrs.getSaldo(),0);

        CCuenta ingrsneg=new CCuenta("Ana","ES08-3456-2343-2345-1234-1234",100,1);
        ingrsneg.ingresar(-6);
        assertEquals(94,ingrsneg.getSaldo(),0);
    }

    @Test
    public void retirar() {
        CCuenta ret=new CCuenta("Ana","ES08-3456-2343-2345-1234-1234",500,1);
        ret.retirar(250);
        assertEquals(250,ret.getSaldo(),0);

        CCuenta retneg=new CCuenta("Ana","ES08-3456-2343-2345-1234-1234",500,1);
        retneg.retirar(2500);
        assertEquals(-2000,retneg.getSaldo(),0);
    }

    @Test
    public void getCuenta() {
    }

    @Test
    public void getNombre() {
    }
}