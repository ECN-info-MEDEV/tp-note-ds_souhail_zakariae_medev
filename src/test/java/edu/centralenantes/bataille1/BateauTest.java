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
public class BateauTest {
    
    public BateauTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }

    /**
     * Test of getTaille method, of class Bateau.
     */
    @Test
    public void testGetTaille() {
        System.out.println("getTaille");
        Bateau instance = null;
        int expResult = 0;
        int result = instance.getTaille();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of estTouche method, of class Bateau.
     */
    @Test
    public void testEstTouche_0args() {
        System.out.println("estTouche");
        Bateau instance = null;
        boolean expResult = false;
        boolean result = instance.estTouche();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of estCoule method, of class Bateau.
     */
    @Test
    public void testEstCoule() {
        System.out.println("estCoule");
        Bateau instance = null;
        boolean expResult = false;
        boolean result = instance.estCoule();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of placer method, of class Bateau.
     */
    @Test
    public void testPlacer() {
        System.out.println("placer");
        Grille grille = null;
        Bateau instance = null;
        instance.placer(grille);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of estTouche method, of class Bateau.
     */
    @Test
    public void testEstTouche_Object() {
        System.out.println("estTouche");
        Object coordonnees = null;
        Bateau instance = null;
        boolean expResult = false;
        boolean result = instance.estTouche(coordonnees);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of placerCases method, of class Bateau.
     */
    @Test
    public void testPlacerCases() {
        System.out.println("placerCases");
        Grille grille = null;
        Bateau instance = null;
        instance.placerCases(grille);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class BateauImpl extends Bateau {

        public BateauImpl() {
            super(0);
        }

        public void placer(Grille grille) {
        }

        public boolean estTouche(Object coordonnees) {
            return false;
        }

        public void placerCases(Grille grille) {
        }
    }
    
}
