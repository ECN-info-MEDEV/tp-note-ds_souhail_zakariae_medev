/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.centralenantes.bataille1;

import java.util.ArrayList;

/**
 *
 * @author Souhail
 */
/**
 * La classe représentant une grille de jeu.
 *
 * @author [Votre nom]
 * @version 1.0
 */
public class Grille {

    /**
     * La liste des cases de la grille.
     */
    private ArrayList<Case> cases;

    /**
     * Crée une nouvelle grille de jeu de taille donnée.
     *
     * @param grilleTaille La taille de la grille.
     */
    public Grille(int grilleTaille) {
        this.cases = new ArrayList<>();

        for (int i = 0; i < grilleTaille; i++) {
            for (int j = 0; j < grilleTaille; j++) {
                Case caseCourante = new Case(i, j);
                cases.add(caseCourante);
            }
        }
    }

    /**
     * Place un bateau sur la grille.
     *
     * @param bateau Le bateau à placer.
     */
    public void placerBateau(Bateau bateau) {
        // Place le bateau sur la grille.
        bateau.placer(this);
    }

    /**
     * Vérifie si une case est touchée.
     *
     * @param coordonnees Les coordonnées de la case à vérifier.
     *
     * @return True si la case est touchée, false sinon.
     */
    public boolean estTouchee(Coordonnees coordonnees) {
        return getCase(coordonnees).estTouchee();
    }

    /**
     * Vérifie si une case est coulée.
     *
     * @param coordonnees Les coordonnées de la case à vérifier.
     *
     * @return True si la case est coulée, false sinon.
     */
    public boolean estCoule(Coordonnees coordonnees) {
        return getCase(coordonnees).estCoulee();
    }

    /**
     * Récupère la case aux coordonnées données.
     *
     * @param coordonnees Les coordonnées de la case à récupérer.
     *
     * @return La case aux coordonnées données.
     */
    public Case getCase(Coordonnees coordonnees) {
        for (Case caseCourante : cases) {
            if (caseCourante.getCoordonnees().equals(coordonnees)) {
                return caseCourante;
            }
        }

        throw new IllegalArgumentException("Les coordonnées " + coordonnees + " ne correspondent à aucune case");
    }

    /**
     * Affiche la grille.
     */
    public void afficher() {
        for (int i = grilleTaille - 1; i >= 0; i--) {
            for (int j = 0; j < grilleTaille; j++) {
                System.out.print(getCase(i, j).toString() + " ");
            }
            System.out.println();
        }
    }
}
