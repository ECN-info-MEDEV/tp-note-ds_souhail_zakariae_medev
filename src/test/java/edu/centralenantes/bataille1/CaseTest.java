/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package edu.centralenantes.bataille1;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Zakariae
 */
public class CaseTest {
    
    public CaseTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }

    /**
     * Test of getCoordonnees method, of class Case.
     */
    @Test
    public void testGetCoordonnees() {
        System.out.println("getCoordonnees");
        Case instance = null;
        Object expResult = null;
        Object result = instance.getCoordonnees();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of estTouchee method, of class Case.
     */
    @Test
    public void testEstTouchee() {
        System.out.println("estTouchee");
        Case instance = null;
        boolean expResult = false;
        boolean result = instance.estTouchee();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of estCoule method, of class Case.
     */
    @Test
    public void testEstCoule() {
        System.out.println("estCoule");
        Case instance = null;
        boolean expResult = false;
        boolean result = instance.estCoule();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toucher method, of class Case.
     */
    @Test
    public void testToucher() {
        System.out.println("toucher");
        Case instance = null;
        instance.toucher();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of couler method, of class Case.
     */
    @Test
    public void testCouler() {
        System.out.println("couler");
        Case instance = null;
        instance.couler();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Case.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Case instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
