package toCook.model;

import java.io.IOException;
import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import toCook.DAO.DiffusionDAO;

public class Application {

    
    // La collection lesDiffusions est déjà remplie à partir de la base de données, elle contient tous
    // les éléments issus des tables Emission, Programme, Diffusion
    

    // retourne toutes les diffusions au format XML, planifiées pour la date passée en paramètre,
    // comme décrites dans le document 3
    public static void diffusionsXML(LocalDate uneDate) throws IOException {
        
        ArrayList<Diffusion> lesDiffusions = DiffusionDAO.getLesDiffusionsJour(uneDate);
        String xml;
        xml = "<?xml version = \"1.0\" encoding=\"UTF-8\" ?>";
        xml += "<programmation>";
        xml += "<jour>" + uneDate.toString() + "</jour>";
        xml += "<diffusions>";
        for(Diffusion diffusion : lesDiffusions){
            xml += diffusion.toXML();
        }
        xml += "</diffusions>";
        xml += "</programmation>";
        Application.saveXML(xml, uneDate);
    }

    public ArrayList<Diffusion> getDiffusionsEnDirect(Date uneDate) {

        // À COMPLÉTER SUR VOTRE COPIE
        return new ArrayList<Diffusion>();
    }
    
    public static void saveXML(String xmlString, LocalDate uneDate) throws IOException{
        java.io.FileWriter fw = new java.io.FileWriter("Diffusions-" + uneDate.toString() + ".xml");
        fw.write(xmlString);
        fw.close();
    }

}
