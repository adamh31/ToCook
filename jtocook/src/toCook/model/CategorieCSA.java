package toCook.model;

public class CategorieCSA {

    private String code;
    private String libelle;

    public CategorieCSA(String code, String unLibelle) {
        this.code = code;
        this.libelle = unLibelle;
    }
    
    public CategorieCSA(){
        
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getLibelle() {
        return this.libelle;
    }
    
    public String getCode(){
        return this.code;
    }
}
