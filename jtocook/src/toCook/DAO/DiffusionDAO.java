/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package toCook.DAO;
import java.sql.*;
import toCook.technic.ConnectDB;
import javax.swing.JOptionPane;
import toCook.model.Diffusion;
import toCook.model.Programme;


/**
 *
 * @author g.vern
 */
public class DiffusionDAO implements DiffusionDAOInterface{
    
    public void create(Diffusion diffusion) {

        try {
            Connection con = ConnectDB.getConnect();
            String sql = "INSERT INTO diffusion (Id_Diffusion, jour, horaire, direct, Id_Programme) VALUES (?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, diffusion.getId());
            ps.setDate(2, (Date) diffusion.getLeJour());
            ps.setString(3, diffusion.getHoraire());
            ps.setBoolean(4, diffusion.getDirect());
            ps.setInt(5, diffusion.getLeProgramme().getId());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "DB : Enregistrement créé !");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "DB : Erreur lors de la création de l'utilisateur");
        }
    }
    
    public void update(Diffusion diffusion) {

        try {
            Connection con = ConnectDB.getConnect();
            String sql = "UPDATE diffusion SET jour=?, horaire=?, direct=?, Id_Emission=null, Id_Programme=? WHERE Id_Diffusion=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDate(1, (Date) diffusion.getLeJour());
            ps.setString(2, diffusion.getHoraire());
            ps.setBoolean(3, diffusion.getDirect());
            ps.setInt(4, diffusion.getLeProgramme().getId());
            ps.setInt(5, diffusion.getId());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "DB : Enregistrement créé !");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "DB : Erreur lors de la création de l'utilisateur");
        }
    }
    
    public void delete(int id) {

        try {
            Connection con = ConnectDB.getConnect();
            String sql = "DELETE FROM diffusion WHERE Id_Diffusion=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "DB : Enregistrement créé !");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "DB : Erreur lors de la création de l'utilisateur");
        }
    }
    
    public static Diffusion getLaDiffusion(int id) {
        
        Diffusion diffusion = new Diffusion();

        try {
            Connection con = ConnectDB.getConnect();
            String sql = "SELECT * FROM diffusion WHERE Id_Diffusion=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Programme prog = new Programme(
                        
                );

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
}
