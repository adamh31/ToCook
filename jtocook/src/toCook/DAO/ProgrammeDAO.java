/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package toCook.DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import toCook.model.Diffusion;
import toCook.model.Programme;
import toCook.technic.ConnectDB;
import toCook.DAO.EmissionDAO;

/**
 *
 * @author g.vern
 */
public class ProgrammeDAO implements ProgrammeDAOInterface{
    public static void create(Programme programme) {

        try {
            Connection con = ConnectDB.getConnect();
            String sql = "INSERT INTO Programme (Id_Emission, Id_Programme, titre, duree, code) VALUES (?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, programme.getId());
            ps.setInt(2, programme.getEmission().getId());
            ps.setString(3, programme.getTitre());
            ps.setInt(4, programme.getDuree());
            ps.setString(5, programme.getLaCategorieCSA().getCode());
            ps.executeUpdate();
            //JOptionPane.showMessageDialog(null, "DB : Enregistrement créé !");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "DB : Erreur lors de la création de l'utilisateur");
        }
    }
    
    public static void update(Programme programme) {

        try {
            Connection con = ConnectDB.getConnect();
            String sql = "UPDATE Programme SET titre=?, duree=?, code=? WHERE Id_Emission=? AND Id_Programme=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, programme.getTitre());
            ps.setInt(2, programme.getDuree());
            ps.setString(3, programme.getLaCategorieCSA().getCode());
            ps.setInt(4, programme.getEmission().getId());
            ps.setInt(5, programme.getId());
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
    
   
    
    public static Programme getLeProgramme(int id, int id_emission) {

        Programme prog = new Programme();
    
        try {
            Connection con = ConnectDB.getConnect();
            String sql = "SELECT * FROM Programme WHERE Id_Programme=? AND Id_Emission=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.setInt(2, id_emission);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
               prog.setId(rs.getInt("Id_Programme"));
               prog.setlEmission(EmissionDAO.getLEmission(rs.getInt("Id_Emission")));
               prog.setTitre(rs.getString("titre"));
               prog.setDuree(rs.getInt("duree"));
               prog.setLaCategorieCSA(CategorieCSADAO.getLaCategorieCSA(rs.getString("code")));


            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return prog;
    }
    
    public static Programme getLeProgrammeTitre(String titre, int id_emission) {

        Programme prog = new Programme();
    
        try {
            Connection con = ConnectDB.getConnect();
            String sql = "SELECT * FROM Programme WHERE titre=? AND Id_Emission=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, titre);
            ps.setInt(2, id_emission);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
               prog.setId(rs.getInt("Id_Programme"));
               prog.setlEmission(EmissionDAO.getLEmission(rs.getInt("Id_Emission")));
               prog.setTitre(rs.getString("titre"));
               prog.setDuree(rs.getInt("duree"));
               prog.setLaCategorieCSA(CategorieCSADAO.getLaCategorieCSA(rs.getString("code")));


            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return prog;
    }
    
     public static ArrayList<Programme> getLesProgramme(int id_emission) {

        ArrayList<Programme> programmes = new ArrayList<Programme>();
        try {
            Connection con = ConnectDB.getConnect();
            String sql = "SELECT * FROM Programme WHERE Id_Emission=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id_emission);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
               Programme prog = new Programme();
               prog.setId(rs.getInt("Id_Programme"));
               prog.setlEmission(EmissionDAO.getLEmission(rs.getInt("Id_Emission")));
               prog.setTitre(rs.getString("titre"));
               prog.setDuree(rs.getInt("duree"));
               prog.setLaCategorieCSA(CategorieCSADAO.getLaCategorieCSA(rs.getString("code")));
               programmes.add(prog);

            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return programmes;
    }

}
