package toCook.model;

public class CategorieCSA {

    private String id;
    private String libelle;

    public CategorieCSA(String unId, String unLibelle) {
        this.id = unId;
        this.libelle = unLibelle;
    }

    public String getLibelle() {
        return this.libelle;
    }
}
