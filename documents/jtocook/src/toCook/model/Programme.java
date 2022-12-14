/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package toCook.model;

/**
 *
 * @author patrick
 */
public class Programme {

    private int id;
    private String titre;
    private int duree;
    private CategorieCSA laCategorieCSA;
    private Emission lEmission;

    public Programme(Emission uneEmission, int unId, String unTitre, int uneDuree, CategorieCSA uneCategorieCSA) {
        this.id = unId;
        this.titre = unTitre;
        this.duree = uneDuree;
        this.laCategorieCSA = uneCategorieCSA;
        this.lEmission = uneEmission;
    }
    // retourne un programme sous la forme d'une chaîne de caractères
    public String toString() {
       return new String();
    } 

    public Emission getEmission() {
        return this.lEmission;
    }

    public int getId() {
        return this.id;
    }

    public String getTitre() {
        return this.titre;
    }

    public int getDuree() {
        return this.duree;
    }

    public CategorieCSA getLaCateg() {
        return this.laCategorieCSA;
    }

}
