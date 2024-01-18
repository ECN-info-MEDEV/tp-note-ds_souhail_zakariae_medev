/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package edu.centralenantes.bataille1;

import edu.centralenantes.bataille.JeuBatailleNavale;
import edu.centralenantes.bataille.Joueur;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Zakariae
 */
public class JeuBatailleNavaleTest {
    
    public JeuBatailleNavaleTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }

    /**
     * Test of placerBateaux method, of class JeuBatailleNavale.
     */
    @Test
    public void testPlacerBateaux() {
        System.out.println("placerBateaux");
        JeuBatailleNavale instance = new JeuBatailleNavale();
        instance.placerBateaux();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of jouerTour method, of class JeuBatailleNavale.
     */
    @Test
    public void testJouerTour() {
        System.out.println("jouerTour");
        JeuBatailleNavale instance = new JeuBatailleNavale();
        Joueur expResult = null;
        Joueur result = instance.jouerTour();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of estTerminee method, of class JeuBatailleNavale.
     */
    @Test
    public void testEstTerminee() {
        System.out.println("estTerminee");
        JeuBatailleNavale instance = new JeuBatailleNavale();
        boolean expResult = false;
        boolean result = instance.estTerminee();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGagnant method, of class JeuBatailleNavale.
     */
    @Test
    public void testGetGagnant() {
        System.out.println("getGagnant");
        JeuBatailleNavale instance = new JeuBatailleNavale();
        Joueur expResult = null;
        Joueur result = instance.getGagnant();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGrilleJoueur1 method, of class JeuBatailleNavale.
     */
    @Test
    public void testGetGrilleJoueur1() {
        System.out.println("getGrilleJoueur1");
        JeuBatailleNavale instance = new JeuBatailleNavale();
        Object expResult = null;
        Object result = instance.getGrilleJoueur1();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGrilleJoueur2 method, of class JeuBatailleNavale.
     */
    @Test
    public void testGetGrilleJoueur2() {
        System.out.println("getGrilleJoueur2");
        JeuBatailleNavale instance = new JeuBatailleNavale();
        Object expResult = null;
        Object result = instance.getGrilleJoueur2();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getJoueurCourant method, of class JeuBatailleNavale.
     */
    @Test
    public void testGetJoueurCourant() {
        System.out.println("getJoueurCourant");
        JeuBatailleNavale instance = new JeuBatailleNavale();
        Joueur expResult = null;
        Joueur result = instance.getJoueurCourant();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
