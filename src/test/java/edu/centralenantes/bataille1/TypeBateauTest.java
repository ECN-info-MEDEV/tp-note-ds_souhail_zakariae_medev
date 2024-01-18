package edu.centralenantes.bataille1;

import edu.centralenantes.bataille.TypeBateau;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for TypeBateau.
 */
public class TypeBateauTest {

    /**
     * Test of getNom method, of class TypeBateau.
     */
    @Test
    public void testGetNom() {
        System.out.println("getNom");
        TypeBateau typeBateau = new TypeBateauImpl("NomBateau", 3);
        String expResult = "NomBateau";
        String result = typeBateau.getNom();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTaille method, of class TypeBateau.
     */
    @Test
    public void testGetTaille() {
        System.out.println("getTaille");
        TypeBateau typeBateau = new TypeBateauImpl("NomBateau", 3);
        int expResult = 3;
        int result = typeBateau.getTaille();
        assertEquals(expResult, result);
    }

    /**
     * Test of creerBateau method, of class TypeBateau.
     */
    @Test
    public void testCreerBateau() {
        System.out.println("creerBateau");
        TypeBateau typeBateau = new TypeBateauImpl("NomBateau", 3);
        Object result = typeBateau.creerBateau();
        assertNotNull(result);
        // Additional assertions based on the expected behavior of creerBateau()
    }

    /**
     * A concrete implementation of TypeBateau for testing purposes.
     */
    public class TypeBateauImpl extends TypeBateau {

        public TypeBateauImpl(String nom, int taille) {
            super(nom, taille);
        }

        @Override
        public Bateau creerBateau() {
            // Replace with the actual implementation for creating a Bateau
            return new Bateau() {}; // You may need to create an actual Bateau class
        }
    }
}
