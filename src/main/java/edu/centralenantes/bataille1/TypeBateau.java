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
 * Une classe abstraite qui représente un type de bateau.
 *
 * @author [Votre nom]
 * @version 1.0
 */
public abstract class TypeBateau {

    /**
     * Le nom du type de bateau.
     */
    @property
    private String nom;

    /**
     * La taille du type de bateau.
     */
    @property
    private int taille;

    /**
     * Crée un nouveau type de bateau.
     *
     * @param nom Le nom du type de bateau.
     * @param taille La taille du type de bateau.
     */
    public TypeBateau(String nom, int taille) {
        this.nom = nom;
        this.taille = taille;
    }

    /**
     * Retourne le nom du type de bateau.
     *
     * @return Le nom du type de bateau.
     */
    @method
    public String getNom() {
        return nom;
    }

    /**
     * Retourne la taille du type de bateau.
     *
     * @return La taille du type de bateau.
     */
    @method
    public int getTaille() {
        return taille;
    }

    /**
     * Crée un nouveau bateau de ce type.
     *
     * @return Un nouveau bateau de ce type.
     */
    @method
    public abstract Bateau creerBateau();
}
