/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package edu.centralenantes.bataille1;

import edu.centralenantes.bataille.Coordonnees;
import edu.centralenantes.bataille.Joueur;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Zakariae
 */
public class JoueurTest {
    
    public JoueurTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }

    /**
     * Test of getNom method, of class Joueur.
     */
    @Test
    public void testGetNom() {
        System.out.println("getNom");
        Joueur instance = null;
        String expResult = "";
        String result = instance.getNom();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGrille method, of class Joueur.
     */
    @Test
    public void testGetGrille() {
        System.out.println("getGrille");
        Joueur instance = null;
        Object expResult = null;
        Object result = instance.getGrille();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of placerBateau method, of class Joueur.
     */
    @Test
    public void testPlacerBateau() {
        System.out.println("placerBateau");
        Object bateau = null;
        Joueur instance = null;
        instance.placerBateau(bateau);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of jouerCoup method, of class Joueur.
     */
    @Test
    public void testJouerCoup() {
        System.out.println("jouerCoup");
        Coordonnees coordonnees = null;
        Joueur instance = null;
        instance.jouerCoup(coordonnees);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of aGagne method, of class Joueur.
     */
    @Test
    public void testAGagne() {
        System.out.println("aGagne");
        Joueur instance = null;
        boolean expResult = false;
        boolean result = instance.aGagne();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
