package toCook.model;
//import java.text.SimpleDateFormat;

import java.util.Date;

public class Diffusion {

    private int id;
    private Date leJour; //date de diffusion
    private String horaire;
    private boolean direct;
    private Programme leProgramme;
    private Emission emission;

    public Diffusion(Programme leProgramme, int id, Date leJour, String horaire, boolean direct, Emission emission) {
        this.id = id;
        this.leJour = leJour;
        this.horaire = horaire;
        this.direct = direct;
        this.leProgramme = leProgramme;
        this.emission = emission;
    }

    public Emission getEmission() {
        return emission;
    }

    public void setEmission(Emission emission) {
        this.emission = emission;
    }
    
    public Diffusion(){
        
    }
    
    public int getId(){
        return this.id;
    }
    
    public void setId(int id){
        this.id = id;
    }

    // retourne la valeur de l'attribut leJour
    public Date getLeJour() {
        return this.leJour;
    }

    // permet de modifier la date de diffusion en s’assurant que la nouvelle date soit postérieure
    // à la date du jour. Retourne « true » si la modification a été effectuée, « false » sinon.
    public boolean setLeJour(Date dateDiffusion) {
        // À COMPLÉTER . . . 
        return false;
    }
    
    public String getHoraire(){
        return this.horaire;
    }
    
    public void setHoraire(String horaire){
        this.horaire = horaire;
    }
    
    // retourne la valeur de l'attribut direct pour savoir si un programme est diffusé en direct
    public boolean getDirect() {
        return this.direct;
    }
    
    public Programme getLeProgramme(){
        return this.leProgramme;
    }
    
    public void setLeProgramme(Programme programme){
        this.leProgramme = programme;
    }

    public boolean isDirect() {
        return direct;
    }

    public void setDirect(boolean direct) {
        this.direct = direct;
    }
    
    // retourne les informations d'une diffusion, de son programme et sa catégorie, au format XML
    // telles que décrites dans l’extrait du fichier XML (document 3)
    public String toXML() {
        String xml = new String();
        xml += "<diffusion>";
        // À COMPLÉTER . . . 
        return new String();
    }
}
