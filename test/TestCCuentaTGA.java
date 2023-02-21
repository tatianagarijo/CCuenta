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

    }

    @Test
    public void retirar() {
    }

    @Test
    public void getCuenta() {
    }

    @Test
    public void getNombre() {
    }
}