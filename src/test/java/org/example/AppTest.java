package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void calcSub() {
        Calculator calculator = new Calculator();
        int result = calculator.subtractionTwoValues(3,2);
        assertEquals(1, result);
    }
    @Test
    public void calcSum() {
        Calculator calculator = new Calculator();
        int result = calculator.sumTwoValues(3,2);
        assertEquals(5, result);
    }

    @Test
    public void checkConstructorWithValues(){
        User user = new User("Boris", 1337,33);
        assertNotNull( user.name );
        assertEquals("Boris", user.name);

    }
    @Test
    public void testDefaultConstructor() {
        User user = new User();
        assertEquals(0, user.id );

    }
    @Test
    public void updateUserName() {
        User user = new User("Boris", 1337,33);
        user.name = "Erik";
        assertEquals("Erik", user.name);


        }
    }

