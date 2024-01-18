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
 * Les coordonnées d'une case sur la grille.
 *
 * @author [Votre nom]
 * @version 1.0
 */
public class Coordonnees {

    /**
     * L'abscisse de la case.
     */
    @property
    private int x;

    /**
     * L'ordonnée de la case.
     */
    @property
    private int y;

    /**
     * Crée de nouvelles coordonnées aux coordonnées données.
     *
     * @param x L'abscisse de la case.
     * @param y L'ordonnée de la case.
     */
    public Coordonnees(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Récupère l'abscisse de la case.
     *
     * @return L'abscisse de la case.
     */
    @method
    public int getX() {
        return x;
    }

    /**
     * Récupère l'ordonnée de la case.
     *
     * @return L'ordonnée de la case.
     */
    @method
    public int getY() {
        return y;
    }

    /**
     * Compare deux coordonnées.
     *
     * @param coordonnees Les coordonnées à comparer.
     *
     * @return True si les coordonnées sont égales, false sinon.
     */
    @method
    @Override
    public boolean equals(Object coordonnees) {
        if (coordonnees instanceof Coordonnees) {
            Coordonnees other = (Coordonnees) coordonnees;
            return x == other.x && y == other.y;
        }

        return false;
    }

    /**
     * Renvoie une représentation textuelle des coordonnées.
     *
     * @return Une représentation textuelle des coordonnées.
     */
    @method
    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}

