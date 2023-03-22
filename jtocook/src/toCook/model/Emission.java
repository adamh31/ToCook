package toCook.model;

public class Emission {

    private int id;
    private String titre;
    private String titreOriginal;
    private String anneeProduction;
    private int numSaison;
    private Genre sonGenre;

    public Emission(int unId, String unTitre, String unTitreOriginal, String uneAnneeProduction, int unNumSaison, Genre unGenre) {
        this.id = unId;
        this.titre = unTitre;
        this.titreOriginal = unTitreOriginal;
        this.anneeProduction = uneAnneeProduction;
        this.numSaison = unNumSaison;
        this.sonGenre = unGenre;
    }

    public Emission(int unId, String unTitre) {
        this.id = unId;
        this.titre = unTitre;
        // . . . . . . . autes élèments à initialiser
    }

    public int getId() {
        return this.id;
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
                + " Genre : " + this.sonGenre.toString();
    }
}
