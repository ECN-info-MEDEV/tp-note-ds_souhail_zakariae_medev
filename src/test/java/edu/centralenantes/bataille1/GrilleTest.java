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
public class GrilleTest {
    
    public GrilleTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }

    /**
     * Test of placerBateau method, of class Grille.
     */
    @Test
    public void testPlacerBateau() {
        System.out.println("placerBateau");
        Bateau bateau = null;
        Grille instance = null;
        instance.placerBateau(bateau);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of estTouchee method, of class Grille.
     */
    @Test
    public void testEstTouchee() {
        System.out.println("estTouchee");
        Object coordonnees = null;
        Grille instance = null;
        boolean expResult = false;
        boolean result = instance.estTouchee(coordonnees);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of estCoule method, of class Grille.
     */
    @Test
    public void testEstCoule() {
        System.out.println("estCoule");
        Object coordonnees = null;
        Grille instance = null;
        boolean expResult = false;
        boolean result = instance.estCoule(coordonnees);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCase method, of class Grille.
     */
    @Test
    public void testGetCase() {
        System.out.println("getCase");
        Object coordonnees = null;
        Grille instance = null;
        Case expResult = null;
        Case result = instance.getCase(coordonnees);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of afficher method, of class Grille.
     */
    @Test
    public void testAfficher() {
        System.out.println("afficher");
        Grille instance = null;
        instance.afficher();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
