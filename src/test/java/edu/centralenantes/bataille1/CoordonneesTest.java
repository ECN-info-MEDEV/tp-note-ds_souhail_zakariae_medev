/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package edu.centralenantes.bataille1;

import edu.centralenantes.bataille.Coordonnees;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Zakariae
 */
public class CoordonneesTest {
    
    public CoordonneesTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }

    /**
     * Test of getX method, of class Coordonnees.
     */
    @Test
    public void testGetX() {
        System.out.println("getX");
        Coordonnees instance = null;
        int expResult = 0;
        int result = instance.getX();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getY method, of class Coordonnees.
     */
    @Test
    public void testGetY() {
        System.out.println("getY");
        Coordonnees instance = null;
        int expResult = 0;
        int result = instance.getY();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Coordonnees.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object coordonnees = null;
        Coordonnees instance = null;
        boolean expResult = false;
        boolean result = instance.equals(coordonnees);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Coordonnees.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Coordonnees instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
