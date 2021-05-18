import greet.Greet;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GreetTest {
    @Test
    public void shouldBread() {
        Greet greet = new Greet();

        assertEquals("Hey Ammaar", greet.greet("Ammaar", 0));
    }

}
