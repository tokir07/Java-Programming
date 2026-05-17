package NOVA;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public class ShapesTest {

    Shapes shapes;

    @BeforeEach
    public void setUp() {
        shapes = new Shapes();
    }

    @Test
    public void testAreaOfCircle() {
        double result = shapes.areaOfCircle(5);
        assertEquals(78.5398, result, 0.0001); // Allowing for floating-point precision
    }

    @Test
    public void testAreaOfRectangle() {
        double result = shapes.areaOfRectangle(5, 3);
        assertEquals(15, result, 0.0001); // Allowing for floating-point precision
    }
}
