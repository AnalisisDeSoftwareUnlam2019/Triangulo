package triangulo;

import com.unlam.triangulo.TipoTriangulo;
import com.unlam.triangulo.Triangulo;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TrianguloTest {

    Triangulo t1, t2, t3;

    @Before
    public void setUp() throws Exception {
        t1 = new Triangulo(3,3,3);
        t2 = new Triangulo(3,3,2);
        t3 = new Triangulo(3,2,1);
    }

    @Test
    public void equilateroTest(){
        TipoTriangulo result = t1.obtenerTipoTriangulo();
        Assert.assertEquals("Equilatero", result.getTipo());
    }

    @Test
    public void isoscelesTest(){
        TipoTriangulo result = t2.obtenerTipoTriangulo();
        Assert.assertEquals("Isosceles", result.getTipo());
    }

    @Test
    public void escalenoTest(){
        TipoTriangulo result = t3.obtenerTipoTriangulo();
        Assert.assertEquals("Escaleno", result.getTipo());
    }

    @Test(expected = Exception.class)
    public void exceptionNoEsTrianguloTest() throws Exception {
        Triangulo t4 = new Triangulo(1, 2, 60);
    }

    @Test(expected = Exception.class)
    public void exceptionLadoNegativoTest() throws Exception {
        Triangulo t5 = new Triangulo(1, 2, -3);
    }

}
