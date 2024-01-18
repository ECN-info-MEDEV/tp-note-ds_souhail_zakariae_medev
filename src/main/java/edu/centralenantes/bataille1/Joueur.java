/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.centralenantes.bataille;

/**
 * Un joueur de morpion.
 *
 * @author [Votre nom]
 * @version 1.0
 */
public class Joueur {

    /**
     * Le nom du joueur.
     */
    @property
    private String nom;

    /**
     * La grille du joueur.
     */
    @property
    private Grille grille;

    /**
     * Crée un nouveau joueur avec le nom donné.
     *
     * @param nom Le nom du joueur.
     */
    public Joueur(String nom) {
        this.nom = nom;
        this.grille = new Grille();
    }

    /**
     * Retourne le nom du joueur.
     *
     * @return Le nom du joueur.
     */
    @method
    public String getNom() {
        return nom;
    }

    /**
     * Retourne la grille du joueur.
     *
     * @return La grille du joueur.
     */
    @method
    public Grille getGrille() {
        return grille;
    }

    /**
     * Place un bateau sur la grille du joueur.
     *
     * @param bateau Le bateau à placer.
     */
    public void placerBateau(Bateau bateau) {
        bateau.placer(grille);
    }

    /**
     * Joue un coup sur la grille du joueur.
     *
     * @param coordonnees Les coordonnées du coup à jouer.
     */
    public void jouerCoup(Coordonnees coordonnees) {
        grille.jouerCoup(coordonnees);
    }

    /**
     * Vérifie si le joueur a gagné.
     *
     * @return True si le joueur a gagné, false sinon.
     */
    public boolean aGagne() {
        return grille.aGagne();
    }
}
