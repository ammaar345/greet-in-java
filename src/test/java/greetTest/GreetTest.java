package greetTest;

import greet.Greet;

import org.junit.Test;

import static org.junit.Assert.*;

public class GreetTest {
    @Test
    public void shouldTestCounterForOneName() {

        Greet greet = new Greet();
        greet.greet("Ammaar", 0);
        greet.greet("joe", 2);
        greet.greet("joe", 3);
        assertEquals(greet.greetedUser("Joe"), 2);
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
    public void bread() {
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
    public void bread3() {
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
    public void bread2() {
        Greet greet = new Greet();
        greet.greet("Jill", 3);
        greet.greet("Tim", 3);
        greet.greet("john", 2);
        assertTrue(greet.greetedUsers().containsKey("jill"));
        assertTrue(greet.greetedUsers().containsKey("tim"));
        assertTrue(greet.greetedUsers().containsKey("john"));
        assertEquals(greet.greetedUsers().get("jill"), 1);
        assertEquals(greet.greetedUsers().get("john"), 1);
        assertEquals(greet.greetedUsers().get("tim"), 1);
    }

    @Test
    public void bread4() {
        Greet greet = new Greet();
        greet.greet("Ammaar", 0);
        greet.greet("Abigail", 2);
        greet.greet("Natasha", 1);
        assertEquals(greet.counter(), 3);
    }

    @Test
    public void bread5() {
        Greet greet = new Greet();
        greet.greet("Henry", 0);
        assertEquals(greet.counter(), 1);

    }

    @Test
    public void bread6() {
        Greet greet = new Greet();
        greet.greet("Ammaar", 0);
        greet.greet("Abigail", 2);
        greet.greet("Natasha", 1);
        greet.greet("Samantha", 1);
        greet.greet("Freddy", 1);

        assertEquals(greet.counter(), 5);
    }

    @Test
    public void breaaad() {
        Greet greet = new Greet();
        greet.greet("ammaar", 1);
        greet.greet("ammaar", 1);

        greet.minusOne("ammaar");
        System.out.println(greet.greetedUsers());

    }

    @Test
    public void breaaad2() {
        Greet greet = new Greet();
        greet.greet("thabang", 1);
        greet.greet("thabang", 1);
        greet.minusOne("thabang");




//        greet.greet("thabang", 1);
//
//        greet.minusOne("thabang");
//        greet.minusOne("thabang");
        System.out.println(greet.greetedUsers());

    }

    @Test
    public void breaaad3() {
        Greet greet = new Greet();
        greet.greet("tim", 1);

        greet.minusOne("tim");
        System.out.println(greet.greetedUsers());

    }
}