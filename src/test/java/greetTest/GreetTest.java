package greetTest;

import greet.Greet;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GreetTest {
    @Test
    public void shouldTestCounterForOneName() {

        Greet greet = new Greet();
        greet.greet("Ammaar", 0);
        greet.greet("joe", 2);
        greet.greet("joe", 3);
        assertEquals(greet.greetedUser("joe"), 2);
    }

    @Test
    public void shouldTestCountForOneName() {
        Greet greet = new Greet();
        greet.greet("yasmin", 2);
        greet.greet("Timmy", 1);
        greet.greet("Timmy", 3);
        assertEquals(greet.greetedUser("yasmin"), 1);

    }

    @Test
    public void shouldTestFirstOption() {
        Greet greet = new Greet();

        assertEquals(greet.greet("Thomas", 1), "Hello thomas");

    }

    @Test
    public void shouldTestSecondOption() {
        Greet greet = new Greet();

        assertEquals(greet.greet("Zee", 2), "こんにちは zee");

    }

    @Test
    public void shouldTestThirdOption() {
        Greet greet = new Greet();

        assertEquals(greet.greet("Anja", 3), "Привет anja");

    }

    @Test
    public void bread() {
        Greet greet = new Greet();
        greet.greet("joe", 2);

        System.out.println(greet.greetedUsers());

    }
}
