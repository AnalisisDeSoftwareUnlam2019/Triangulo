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
        Triangulo t4 = new Triangulo(14, 14, 29);
    }

    @Test(expected = Exception.class)
    public void exceptionLadoNegativoTest() throws Exception {
        Triangulo t5 = new Triangulo(1, 2, -3);
    }

    @Test(expected = Exception.class)
    public void dosLadosMenorQueElTercero() throws Exception {
        Triangulo t5 = new Triangulo(1,1,3);
        Triangulo t6 = new Triangulo(90,172,24);
        Triangulo t7 = new Triangulo(2,11,14);
        Triangulo t8 = new Triangulo(14,14,29);
        Triangulo t9 = new Triangulo(23,11,11);
        Triangulo t10 = new Triangulo(19,44,19);
    }

    @Test(expected = Exception.class)
    public void valoresNoEnterosConDosLadosMenorQueElTercero() throws Exception{
        Triangulo t5 = new Triangulo(1.1,1.5,1.03);
        Assert.assertEquals(TipoTriangulo.ESCALENO, t5.obtenerTipoTriangulo());
        Triangulo t1 = new Triangulo(0.23203,334.12,10.0000);
    }

    @Test
    public void valoresNoEnteros() throws Exception {
        Triangulo t5 = new Triangulo(13.312,13.312,14.202);
        Assert.assertEquals(TipoTriangulo.ISOSCELES, t5.obtenerTipoTriangulo());
        Triangulo t6 = new Triangulo(0.2,0.4,0.3);
        Assert.assertEquals(TipoTriangulo.ESCALENO, t6.obtenerTipoTriangulo());
        Triangulo t7 = new Triangulo(120.253,120.253,120.253);
        Assert.assertEquals(TipoTriangulo.EQUILATERO, t7.obtenerTipoTriangulo());
        Triangulo t8 = new Triangulo(31.345,313.45,300.6);
        Assert.assertEquals(TipoTriangulo.ESCALENO, t8.obtenerTipoTriangulo());

    }

    @Test
    public void EnterosYDecimales() throws Exception {
        Triangulo t3 = new Triangulo(12.012,12,12.00012);
        Assert.assertEquals(TipoTriangulo.ESCALENO, t3.obtenerTipoTriangulo());
        Triangulo t4 = new Triangulo(5,5.5,5.55);
        Assert.assertEquals(TipoTriangulo.ESCALENO, t4.obtenerTipoTriangulo());
        Triangulo t5 = new Triangulo(4,0.21d,4);
        Assert.assertEquals(TipoTriangulo.ISOSCELES, t5.obtenerTipoTriangulo());
        Triangulo t6 = new Triangulo(13.3,22,12.12);
        Assert.assertEquals(TipoTriangulo.ESCALENO, t6.obtenerTipoTriangulo());
        Triangulo t7 = new Triangulo(123.2,123.2,76);
        Assert.assertEquals(TipoTriangulo.ISOSCELES, t7.obtenerTipoTriangulo());
        Triangulo t8 = new Triangulo(41.8989,41.8989,41.8989);
        Assert.assertEquals(TipoTriangulo.EQUILATERO, t8.obtenerTipoTriangulo());
        Triangulo t9 = new Triangulo(6.123,6.122,6.1233);
        Assert.assertEquals(TipoTriangulo.ESCALENO, t9.obtenerTipoTriangulo());
        Triangulo t10 = new Triangulo(80,80.006,80);
        Assert.assertEquals(TipoTriangulo.ISOSCELES, t10.obtenerTipoTriangulo());

    }



}
