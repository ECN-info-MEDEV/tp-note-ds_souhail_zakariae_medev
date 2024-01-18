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
 * Un bateau, avec une taille et des informations sur son état (touché, coulé).
 *
 * @author [Votre nom]
 * @version 1.0
 */
public abstract class Bateau {

    /**
     * La taille du bateau.
     */
    @property
    private int taille;

    /**
     * Indique si le bateau est touché.
     */
    @property
    private boolean touche;

    /**
     * Indique si le bateau est coulé.
     */
    @property
    private boolean coule;

    /**
     * Crée un nouveau bateau de taille donnée.
     *
     * @param taille La taille du bateau.
     */
    public Bateau(int taille) {
        this.taille = taille;
        this.touche = false;
        this.coule = false;
    }

    /**
     * Retourne la taille du bateau.
     *
     * @return La taille du bateau.
     */
    @method
    public int getTaille() {
        return taille;
    }

    /**
     * Indique si le bateau est touché.
     *
     * @return True si le bateau est touché, false sinon.
     */
    @method
    public boolean estTouche() {
        return touche;
    }

    /**
     * Indique si le bateau est coulé.
     *
     * @return True si le bateau est coulé, false sinon.
     */
    @method
    public boolean estCoule() {
        return coule;
    }

    /**
     * Place le bateau sur la grille donnée.
     *
     * @param grille La grille sur laquelle placer le bateau.
     */
    public abstract void placer(Grille grille);

    /**
     * Vérifie si la case donnée est touchée par le bateau.
     *
     * @param coordonnees Les coordonnées de la case à vérifier.
     *
     * @return True si la case est touchée, false sinon.
     */
    public abstract boolean estTouche(Coordonnees coordonnees);

    /**
     * Méthode abstraite qui permet de placer le bateau sur la grille.
     */
    protected abstract void placerCases(Grille grille);
}
