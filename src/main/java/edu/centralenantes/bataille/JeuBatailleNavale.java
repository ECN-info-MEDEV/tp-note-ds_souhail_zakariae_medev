/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package edu.centralenantes.bataille;

/**
 * Le jeu de la bataille navale.
 *
 * @author [Votre nom]
 * @version 1.0
 */
public class JeuBatailleNavale {

    /**
     * La grille du joueur 1.
     */
    @property
    private Grille grilleJoueur1;

    /**
     * La grille du joueur 2.
     */
    @property
    private Grille grilleJoueur2;

    /**
     * Le joueur qui commence la partie.
     */
    @property
    private Joueur joueurCourant;

    /**
     * Crée un nouveau jeu de la bataille navale.
     */
    public JeuBatailleNavale() {
        this.grilleJoueur1 = new Grille();
        this.grilleJoueur2 = new Grille();
        this.joueurCourant = new Joueur("Joueur 1");
    }

    /**
     * Place les bateaux sur les grilles des joueurs.
     */
    public void placerBateaux() {
        // Place les bateaux du joueur 1.
        for (TypeBateau typeBateau : TypeBateau.values()) {
            for (int i = 0; i < typeBateau.getNombre(); i++) {
                grilleJoueur1.placerBateau(typeBateau.creerBateau());
            }
        }

        // Place les bateaux du joueur 2.
        for (TypeBateau typeBateau : TypeBateau.values()) {
            for (int i = 0; i < typeBateau.getNombre(); i++) {
                grilleJoueur2.placerBateau(typeBateau.creerBateau());
            }
        }
    }

    /**
     * Joue un tour du jeu.
     *
     * @return Le joueur qui a gagné le tour, ou null si aucun joueur n'a gagné.
     */
    public Joueur jouerTour() {
        // Le joueur courant joue un coup.
        Joueur joueurGagnant = null;
        Coordonnees coordonnees = joueurCourant.jouerCoup();

        // Vérifie si le coup a coulé un bateau.
        if (grilleJoueurCourant.jouerCoup(coordonnees) == Grille.EtatCase.COULE) {
            joueurGagnant = joueurCourant;
        }

        // Passe au joueur suivant.
        joueurCourant = joueurCourant == joueur1 ? joueur2 : joueur1;

        return joueurGagnant;
    }

    /**
     * Vérifie si la partie est terminée.
     *
     * @return True si la partie est terminée, false sinon.
     */
    public boolean estTerminee() {
        return grilleJoueur1.aGagne() || grilleJoueur2.aGagne();
    }

    /**
     * Retourne le joueur qui a gagné la partie.
     *
     * @return Le joueur qui a gagné la partie, ou null si la partie n'est pas terminée.
     */
    public Joueur getGagnant() {
        if (estTerminee()) {
            return grilleJoueur1.aGagne() ? joueur1 : joueur2;
        } else {
            return null;
        }
    }

    /**
     * Retourne la grille du joueur 1.
     *
     * @return La grille du joueur 1.
     */
    public Grille getGrilleJoueur1() {
        return grilleJoueur1;
    }

    /**
     * Retourne la grille du joueur 2.
     *
     * @return La grille du joueur 2.
     */
    public Grille getGrilleJoueur2() {
        return grilleJoueur2;
    }

    /**
     * Retourne le joueur courant.
     *
     * @return Le joueur courant.
     */
    public Joueur getJoueurCourant() {
        return joueurCourant;
    }
}
