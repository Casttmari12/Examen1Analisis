package cr.go.ucr.examen1.calculadoracomisionesventas;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Pruebas para la clase ComisionVenta.
 *
 * @author Mariana Castro Araya C01861
 */
public class ComisionVentaTest {
    
    private final ComisionVenta comisionVenta = ComisionVenta.getCurrentInstance();

    @Test
    public void testCalcularComisionValida() {
        Double expResult = 45.0; 
        Double result = comisionVenta.calcular(1500.0); 
        assertEquals(expResult, result, 0.01);
    }

    @Test
    public void testCalcularComisionInvalidaNegativa() {
        Double expResult = -1.0; 
        Double result = comisionVenta.calcular(-100.0);
        assertEquals(expResult, result);
    }

    @Test
    public void testCalcularComisionInvalidaNull() {
        Double expResult = -1.0; 
        Double result = comisionVenta.calcular(null);
        assertEquals(expResult, result);
    }

    @Test
    public void testCalcularComisionFueraDeRango() {
        Double expResult = -1.0; 
        Double result = comisionVenta.calcular(200000.0);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetCurrentInstance() {
        ComisionVenta instance = ComisionVenta.getCurrentInstance();
        //La instancia singleton no debería ser nula
        assertNotNull(instance);
        assertEquals(comisionVenta, instance);
    }
    
   
    
     @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        ComisionVenta.main(args);
        
    }
}
