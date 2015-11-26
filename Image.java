/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gelin.alessi_schneegans;

/**
 *
 * @author Raphael
 */
public class Image {
    
    //Attributs
    /**
     * Hauteur en pixels de l'image
     */
    
    private int hauteur;
    
    /**
     * Largeur en pixels de l'image
     */
   
    private int largeur;
    
    /**
     * Tableau d'entiers stockant la valeur du niveau de chaque pixel
     */
   
    private int[][] niveau;
    
    /**
     * getter de hauteur
     * @return 
     */

    public int getHauteur() {
        return hauteur;
    }

    /**
     * setter de largeur
     * @return 
     */
    
    public int getLargeur() {
        return largeur;
    }

    /**
     * getter de niveau
     * @return 
     */
    
    public int[][] getNiveau() {
        return niveau;
    }

    /**
     * setter de hauteur
     * @return 
     */
    
    public void setHauteur(int hauteur) {
        this.hauteur = hauteur;
    }

    /**
     * setter de largeur
     * @return 
     */
    
    public void setLargeur(int largeur) {
        this.largeur = largeur;
    }

    /**
     * setter de largeur
     * @return 
     */
    
    public void setNiveau(int[][] niveau) {
        this.niveau = niveau;
    }

    /**
     * Constructeur d'une Image à partir de sa hauteur et de sa largeur.
     * @param hauteur
     * @param largeur 
     */
    public Image(int hauteur, int largeur) {
        this.hauteur = hauteur;
        this.largeur = largeur;
        this.niveau = new int[hauteur][largeur];
    }
    
    //Methodes
    
    
    
    
    
}
