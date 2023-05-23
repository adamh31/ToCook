package toCook.model;

public class Emission {

    private int id;
    private String titre;
    private String titreOriginal;
    private int anneeProduction;
    private int numSaison;
    private String genre;
    private String origine;

    public Emission(int unId, String unTitre, String unTitreOriginal, int uneAnneeProduction, int unNumSaison, String genrem, String origine) {
        this.id = unId;
        this.titre = unTitre;
        this.titreOriginal = unTitreOriginal;
        this.anneeProduction = uneAnneeProduction;
        this.numSaison = unNumSaison;
        this.genre = genre;
        this.origine = origine;
    }
    
    public Emission(){
        
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getOrigine() {
        return origine;
    }

    public void setOrigine(String origine) {
        this.origine = origine;
    }

    public Emission(int unId, String unTitre) {
        this.id = unId;
        this.titre = unTitre;
        // . . . . . . . autes élèments à initialiser
    }

    public int getId() {
        return this.id;
    }

    public String getTitreOriginal() {
        return titreOriginal;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setTitreOriginal(String titreOriginal) {
        this.titreOriginal = titreOriginal;
    }

    public int getAnneeProduction() {
        return anneeProduction;
    }

    public void setAnneeProduction(int anneeProduction) {
        this.anneeProduction = anneeProduction;
    }

    public int getNumSaison() {
        return numSaison;
    }

    public void setNumSaison(int numSaison) {
        this.numSaison = numSaison;
    }

    public String getTitre() {
        return this.titre;
    }
    
// La méthode toString retourne une émission sous la forme d'une chaîne de caractères
    @Override
    public String toString() {
        return "ID Emission : " + this.id + " Titre : " + this.titre
                + " Version Originale : " + this.titreOriginal
                + " Année : " + this.anneeProduction + " Saison : " + this.numSaison
                + " Genre : " + this.genre.toString();
    }
}
