/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.centralenantes.bataille;

/**
 *
 * @author Souhail
 */
/**
 * Un porte-avion, un type de bateau de taille 5.
 *
 * @author [Votre nom]
 * @version 1.0
 */
public class PorteAvion extends Bateau {

    /**
     * Crée un nouveau porte-avion.
     */
    public PorteAvion() {
        super(5);
    }

    /**
     * Place le bateau sur la grille donnée.
     *
     * @param grille La grille sur laquelle placer le bateau.
     */
    @Override
    public void placer(Grille grille) {
        super.placer(grille);

        // Place le bateau en ligne horizontale.
        for (int i = 0; i < taille; i++) {
            cases[i] = grille.getCase(i, 0);
        }
    }

    /**
     * Vérifie si la case donnée est touchée par le bateau.
     *
     * @param coordonnees Les coordonnées de la case à vérifier.
     *
     * @return True si la case est touchée, false sinon.
     */
    @Override
    public boolean estTouche(Coordonnees coordonnees) {
        for (Case caseCourante : cases) {
            if (caseCourante.getCoordonnees().equals(coordonnees)) {
                return true;
            }
        }

        return false;
    }
}

