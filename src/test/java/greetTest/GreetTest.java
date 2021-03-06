package greetTest;

import greet.Greet;

import org.junit.Test;

import static org.junit.Assert.*;

public class GreetTest {
    @Test
    public void shouldTestCounterForOneName() {

        Greet greet = new Greet();
        greet.greet("joe", 1);
        greet.greet("joe", 2);
        greet.greet("joe", 0);
        greet.greet("ammaar", 0);
        System.out.println(greet.greetedUsers());
        assertEquals(greet.greetedUser("joe"), 3);
    }

    @Test
    public void shouldTestCountForOneName() {
        Greet greet = new Greet();
        greet.greet("yasmin", 2);
        greet.greet("Timmy", 1);
        greet.greet("Timmy", 3);
        assertEquals(greet.greetedUser("Yasmin"), 1);

    }

    @Test
    public void shouldTestFirstOption() {
        Greet greet = new Greet();

        assertEquals(greet.greet("Thomas", 1), "Hello Thomas");

    }

    @Test
    public void shouldTestSecondOption() {
        Greet greet = new Greet();

        assertEquals(greet.greet("Zee", 2), "こんにちは Zee");

    }

    @Test
    public void shouldTestThirdOption() {
        Greet greet = new Greet();

        assertEquals(greet.greet("Anja", 3), "Привет Anja");

    }

    @Test
    public void shouldTestDefault() {
        Greet greet = new Greet();
        assertEquals(greet.greet("Joe", 0), "Hey Joe");

    }

    @Test
    public void shouldTestIfMapHoldsCount() {
        Greet greet = new Greet();
        greet.greet("thabo", 3);
        greet.greet("thabo", 3);
        greet.greet("joe", 2);
        assertTrue(greet.greetedUsers().containsKey("thabo"));
        assertTrue(greet.greetedUsers().containsKey("joe"));
        assertFalse(greet.greetedUsers().containsKey("lewis"));
        assertEquals(greet.greetedUsers().get("thabo"), 2);
        assertEquals(greet.greetedUsers().get("joe"), 1);
    }

    @Test
    public void shouldTestIfMapHoldsCount2() {
        Greet greet = new Greet();
        greet.greet("melissa", 3);
        greet.greet("melissa", 1);
        greet.greet("melissa", 1);
        greet.greet("john", 2);
//        greet.greet("tom", 1);
//        greet.greet("tom", 0);
        greet.greet("abigail", 3);
        System.out.println(greet.greetedUsers());
        assertTrue(greet.greetedUsers().containsKey("melissa"));
        assertTrue(greet.greetedUsers().containsKey("john"));
//        assertEquals(greet.greetedUsers().containsKey("tom"), true);
        assertTrue(greet.greetedUsers().containsKey("abigail"));
        assertEquals(greet.greetedUsers().get("melissa"), 3);
//        assertEquals(greet.greetedUsers().get("tom"), 2);
        assertEquals(greet.greetedUsers().get("abigail"), 1);
        assertEquals(greet.greetedUsers().get("john"), 1);

    }


    @Test
    public void shouldTestIfMapHoldsCount3() {
        Greet greet = new Greet();
        greet.greet("jill", 3);
        greet.greet("tim", 3);
        greet.greet("john", 2);
        assertTrue(greet.greetedUsers().containsKey("jill"));
        assertTrue(greet.greetedUsers().containsKey("tim"));
        assertTrue(greet.greetedUsers().containsKey("john"));
        assertEquals(greet.greetedUsers().get("jill"), 1);
        assertEquals(greet.greetedUsers().get("john"), 1);
        assertEquals(greet.greetedUsers().get("tim"), 1);
    }

    @Test
    public void shouldTestAllCount() {
        Greet greet = new Greet();
        greet.greet("Ammaar", 0);
        greet.greet("Abigail", 2);
        greet.greet("Natasha", 1);
        assertEquals(greet.counter(), 3);
    }

    @Test
    public void shouldTestAllCount2() {
        Greet greet = new Greet();
        greet.greet("Henry", 0);
        assertEquals(greet.counter(), 1);

    }

    @Test
    public void shouldTestAllCount3() {
        Greet greet = new Greet();
        greet.greet("Ammaar", 0);
        greet.greet("Abigail", 2);
        greet.greet("Natasha", 1);
        greet.greet("Samantha", 1);
        greet.greet("Freddy", 1);
        System.out.println(greet.greetedUsers());
        assertEquals(greet.counter(), 5);
    }

    @Test
    public void shouldTestClearMethod() {
        Greet greet = new Greet();
        greet.greet("ammaar", 1);
        greet.greet("ammaar", 1);

        greet.minusOne("ammaar");
        assertEquals(greet.greetedUsers().get("ammaar"), 1);
        assertTrue(greet.greetedUsers().containsKey("ammaar"));
    }

    @Test
    public void shouldTestClearMethod2() {
        Greet greet = new Greet();
        greet.greet("thabang", 1);

        greet.minusOne("thabang");
        greet.greet("thabang", 1);
        greet.minusOne("thabang");
        System.out.println(greet.greetedUsers());
//        assertEquals(greet.greetedUsers().get("thabang"),1);
//        assertTrue(greet.greetedUsers().containsKey("thabang"));
    }

    @Test
    public void shouldTestClearMethod3() {
        Greet greet = new Greet();
        greet.greet("tim", 1);
        greet.minusOne("tim");
        System.out.println(greet.greetedUsers());

    }
}