/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package onair;

import onair.database.DatabaseAccess;
import onair.views.Calendrier;

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
    
}
