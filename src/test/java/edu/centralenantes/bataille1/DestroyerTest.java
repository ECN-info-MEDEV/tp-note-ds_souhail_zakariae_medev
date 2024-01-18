/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package edu.centralenantes.bataille1;

import edu.centralenantes.bataille.Coordonnees;
import edu.centralenantes.bataille.Destroyer;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Zakariae
 */
public class DestroyerTest {
    
    public DestroyerTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }

    /**
     * Test of placer method, of class Destroyer.
     */
    @Test
    public void testPlacer() {
        System.out.println("placer");
        Grille grille = null;
        Destroyer instance = new Destroyer();
        instance.placer(grille);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of estTouche method, of class Destroyer.
     */
    @Test
    public void testEstTouche() {
        System.out.println("estTouche");
        Coordonnees coordonnees = null;
        Destroyer instance = new Destroyer();
        boolean expResult = false;
        boolean result = instance.estTouche(coordonnees);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
