package NOVA;

import org.junit.Test;

public class maipulateStringTest {
    @Test
    public void testReverse() {
        manipulateString ms = new manipulateString();
        String result = ms.reverse("Hello");
        assert result.equals("olleH");
    }
}
