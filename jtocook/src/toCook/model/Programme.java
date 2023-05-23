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
    
    public Programme(){
        
    }
    // retourne un programme sous la forme d'une chaîne de caractères
    public String toString() {
       return new String();
    } 

    public Emission getEmission() {
        return this.lEmission;
    }

    public CategorieCSA getLaCategorieCSA() {
        return laCategorieCSA;
    }

    public void setLaCategorieCSA(CategorieCSA laCategorieCSA) {
        this.laCategorieCSA = laCategorieCSA;
    }

    public Emission getlEmission() {
        return lEmission;
    }

    public void setlEmission(Emission lEmission) {
        this.lEmission = lEmission;
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

    public void setId(int id) {
        this.id = id;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

}
