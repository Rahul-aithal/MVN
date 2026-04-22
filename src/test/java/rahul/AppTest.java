package rahul;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * Rigorous Test :-)
     */
    App c = new App();

    @Test
    public void shouldProivdeTrue() {
        int exp = c.add(1, 2);
        assertEquals(3, exp);
    }
}
