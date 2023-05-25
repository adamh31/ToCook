package toCook.model;

import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Application {

    
    // La collection lesDiffusions est déjà remplie à partir de la base de données, elle contient tous
    // les éléments issus des tables Emission, Programme, Diffusion
    private ArrayList<Diffusion> lesDiffusions;

    // retourne toutes les diffusions au format XML, planifiées pour la date passée en paramètre,
    // comme décrites dans le document 3
    public String diffusionsXML(Date uneDate) {
        String xml;
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-mm-dd");
        xml = "<?xml version = \"1.0\" encoding=\"UTF-8\" ?>";
        xml += "<programmation>";
        xml += "<jour>" + sf.format(uneDate) + "</jour>";
        // À COMPLÉTER . . .
        xml += "</programmation>";
        return xml;
    }

    public ArrayList<Diffusion> getDiffusionsEnDirect(Date uneDate) {

        // À COMPLÉTER SUR VOTRE COPIE
        return new ArrayList<Diffusion>();
    }

}
