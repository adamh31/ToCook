/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package onair;

import onair.database.DatabaseAccess;
import onair.views.Calendrier;
import java.sql*

/**
 *
 * @author Administrator
 */
public class OnAir {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DatabaseAccess data = new DatabaseAccess();
        Calendrier calendrier = new Calendrier();
        calendrier.setVisible(true);
        
    }
    
    public static void journee(){
        
        Connection con = DriverManager.getConnection("jdbc:mysql://https://phpmyadmin.alwaysdata.com/phpmyadmin/index.php?route=/sql&server=1&db=tocook_bdd&table=Diffusion&pos=0", "tocook", "Btssio82300");
        
        
    }
    
}
