package FigurasAvanzadas;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;

public class RectanguloTest {
    private static Double errorAdmitido = 1e-6;
    Rectangulo r1;
    Rectangulo r2;
    Rectangulo r3;
    Rectangulo r4;

    @Before
    public void crearRectangulos () {
        r1 = new Rectangulo(170);
        r2 = new Rectangulo(90);
        r3 = new Rectangulo(150, 90);
        r4 = new Rectangulo(210, 190);
    }

    @Test
    public void testConstrutor1Argumento () {
        assertEquals(Integer.valueOf(170), r1.getBase());
        assertEquals(Integer.valueOf(170), r1.getAltura());
        assertEquals(Integer.valueOf(90), r2.getBase());
        assertEquals(Integer.valueOf(90), r2.getAltura());
    }

    @Test
    public void testConstrutor2Argumentos () {
        assertEquals(Integer.valueOf(150), r3.getBase());
        assertEquals(Integer.valueOf(90), r3.getAltura());
        assertEquals(Integer.valueOf(210), r4.getBase());
        assertEquals(Integer.valueOf(190), r4.getAltura());
    }

    @Test
    public void testConstrutorID () {
        assertEquals("Rectangulo1", r1.getId());
        assertEquals("Rectangulo2", r2.getId());
        assertEquals("Rectangulo3", r3.getId());
        assertEquals("Rectangulo4", r4.getId());
    }

    // @DisplayName("Verifica valor de la base")
    @Test
    public void testSetBase () {
        assertEquals(Integer.valueOf(170), r1.getBase());
        r1.setBase(-1);
        assertEquals(Integer.valueOf(170), r1.getBase());
        r1.setBase(0);
        assertEquals(Integer.valueOf(170), r1.getBase());
        r1.setBase(1);
        assertEquals(Integer.valueOf(1), r1.getBase());
        r1.setBase(100);
        assertEquals(Integer.valueOf(100), r1.getBase());
        r1.setBase(600);
        assertEquals(Integer.valueOf(100), r1.getBase());
        r1.setBase(501);
        assertEquals(Integer.valueOf(100), r1.getBase());
        r1.setBase(500);
        assertEquals(Integer.valueOf(500), r1.getBase());
        r1.setBase(499);
        assertEquals(Integer.valueOf(499), r1.getBase());
    }

    // @DisplayName("Verifica valor de la altura")
    @Test
    public void testSetAltura () {
        assertEquals(Integer.valueOf(170), r1.getAltura());
        r1.setAltura(-1);
        assertEquals(Integer.valueOf(170), r1.getAltura());
        r1.setAltura(0);
        assertEquals(Integer.valueOf(170), r1.getAltura());
        r1.setAltura(1);
        assertEquals(Integer.valueOf(1), r1.getAltura());
        r1.setAltura(100);
        assertEquals(Integer.valueOf(100), r1.getAltura());
        r1.setAltura(600);
        assertEquals(Integer.valueOf(100), r1.getAltura());
        r1.setAltura(501);
        assertEquals(Integer.valueOf(100), r1.getAltura());
        r1.setAltura(500);
        assertEquals(Integer.valueOf(500), r1.getAltura());
        r1.setAltura(499);
        assertEquals(Integer.valueOf(499), r1.getAltura());
    }

    @Test
    public void testPerimetro () {
        assertEquals(Double.valueOf(680), r1.getPerimetro(), errorAdmitido);
        assertEquals(Double.valueOf(360), r2.getPerimetro(), errorAdmitido);
        assertEquals(Double.valueOf(480), r3.getPerimetro(), errorAdmitido);
        assertEquals(Double.valueOf(800), r4.getPerimetro(), errorAdmitido);
    }

    @Test
    public void testSuperficie () {
        assertEquals(Double.valueOf(28900), r1.getSuperficie(), errorAdmitido);
        assertEquals(Double.valueOf(8100),  r2.getSuperficie(), errorAdmitido);
        assertEquals(Double.valueOf(13500), r3.getSuperficie(), errorAdmitido);
        assertEquals(Double.valueOf(39900), r4.getSuperficie(), errorAdmitido);
    }

    @Test
    public void testToStringLocal () {
        assertEquals("Altura=170, Base=170", r1.toString().split(" \\+\\+ ")[1]);
        assertEquals("Altura=90, Base=90", r2.toString().split(" \\+\\+ ")[1]);
        assertEquals("Altura=90, Base=150", r3.toString().split(" \\+\\+ ")[1]);
        assertEquals("Altura=190, Base=210", r4.toString().split(" \\+\\+ ")[1]);
    }

    @Test
    public void testToStringCompleto () {
        assertEquals("Figura Rectangulo1 (null,null) ++ Altura=170, Base=170", r1.toString());
        assertEquals("Figura Rectangulo2 (null,null) ++ Altura=90, Base=90", r2.toString());
        assertEquals("Figura Rectangulo3 (null,null) ++ Altura=90, Base=150", r3.toString());
        assertEquals("Figura Rectangulo4 (null,null) ++ Altura=190, Base=210", r4.toString());
    }

    @Test
    public void testCompareTo () {
        assertEquals( 0, r1.compareTo(r1));
        assertEquals( 1, r1.compareTo(r2));
        r2.setAltura(289);
        r2.setBase(100);
        assertEquals(-1, r1.compareTo(r2));
        assertEquals(-1, r1.compareTo(r4));
        r1.setAltura(210);
        r1.setBase(190);
        assertEquals(-1, r1.compareTo(r4));
        r1.setBase(191);
        assertEquals( 1, r1.compareTo(r4));
    }

}
