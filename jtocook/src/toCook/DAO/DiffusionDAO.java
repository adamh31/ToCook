/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package toCook.DAO;
import java.sql.*;
import java.util.ArrayList;
import toCook.technic.ConnectDB;
import javax.swing.JOptionPane;
import toCook.model.Diffusion;
import toCook.model.Emission;
import toCook.model.Programme;


/**
 *
 * @author g.vern
 */
public class DiffusionDAO implements DiffusionDAOInterface{
    
    public static void create(Diffusion diffusion) {

        try {
            Connection con = ConnectDB.getConnect();
            String sql = "INSERT INTO Diffusion (Id_Diffusion, jour, horaire, direct, Id_Programme) VALUES (?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, diffusion.getId());
            ps.setDate(2, (Date) diffusion.getLeJour());
            ps.setString(3, diffusion.getHoraire());
            ps.setBoolean(4, diffusion.getDirect());
            ps.setInt(5, diffusion.getLeProgramme().getId());
            ps.executeUpdate();
            //JOptionPane.showMessageDialog(null, "DB : Enregistrement créé !");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "DB : Erreur lors de la création de l'utilisateur");
        }
    }
    
    public static void update(Diffusion diffusion) {

        try {
            Connection con = ConnectDB.getConnect();
            String sql = "UPDATE Diffusion SET jour=?, horaire=?, direct=?, Id_Programme=? WHERE Id_Diffusion=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDate(1, (Date) diffusion.getLeJour());
            ps.setString(2, diffusion.getHoraire());
            ps.setBoolean(3, diffusion.getDirect());
            ps.setInt(4, diffusion.getLeProgramme().getId());
            ps.setInt(5, diffusion.getId());
            ps.executeUpdate();
            //JOptionPane.showMessageDialog(null, "DB : Enregistrement créé !");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public static void delete(int id) {

        try {
            Connection con = ConnectDB.getConnect();
            String sql = "DELETE FROM Diffusion WHERE Id_Diffusion=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            //JOptionPane.showMessageDialog(null, "DB : Enregistrement créé !");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "DB : Erreur lors de la création de l'utilisateur");
        }
    }
    
    public static Diffusion getLaDiffusion(int id) {
        
        Diffusion diffusion = new Diffusion();

        try {
            Connection con = ConnectDB.getConnect();
            String sql = "SELECT * FROM Diffusion WHERE Id_Diffusion=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Programme prog = ProgrammeDAO.getLeProgramme(rs.getInt("Id_Programme"), rs.getInt("Id_Emission"));

                diffusion.setLeProgramme(prog);
                diffusion.setId(rs.getInt("Id_Diffusion"));
                diffusion.setLeJour(rs.getDate("jour"));
                diffusion.setHoraire(rs.getString("horaire"));
                diffusion.setDirect(rs.getBoolean("direct"));



            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return diffusion;
    }
    
    public static ArrayList<Diffusion> getLesDiffusionsSemaine(int semaine){
        
        int jourMin = semaine * 7;
        int jourMax = semaine * 7 + 7;
        ArrayList<Diffusion> diffusions = new ArrayList<Diffusion>();
        
        try{
            
            Connection con = ConnectDB.getConnect();
            String sql = "SELECT * FROM Diffusion WHERE DAYOFYEAR(jour) >= ? AND DAYOFYEAR(jour) <= ? ORDER BY jour DESC, horaire DESC";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, jourMin);
            ps.setInt(2, jourMax);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                Programme prog = ProgrammeDAO.getLeProgramme(rs.getInt("Id_Programme"), rs.getInt("Id_Emission"));
                
                
                Diffusion diffusion = new Diffusion();
                diffusion.setDirect(rs.getBoolean("direct"));
                diffusion.setLeProgramme(prog);
                diffusion.setLeJour(rs.getDate("jour"));
                diffusion.setHoraire(rs.getString("horaire"));
                diffusion.setId(rs.getInt("Id_Diffusion"));
                
                diffusions.add(diffusion);
            }
            
        } catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e);
        }
        return diffusions;
    }
}
