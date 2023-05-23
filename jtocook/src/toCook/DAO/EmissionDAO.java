/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package toCook.DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import toCook.model.Diffusion;
import toCook.model.Emission;
import toCook.model.Programme;
import toCook.technic.ConnectDB;

/**
 *
 * @author Administrator
 */
public class EmissionDAO {
    public void create(Emission emission) {

        try {
            Connection con = ConnectDB.getConnect();
            String sql = "INSERT INTO emission (Id_Emission, titre, titre_original, annee_production, num_saison, code, code_1) VALUES (?,?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, emission.getId());
            ps.setString(2, emission.getTitre());
            ps.setString(3, emission.getTitreOriginal());
            ps.setInt(4, emission.getAnneeProduction());
            ps.setInt(5, emission.getNumSaison());
            ps.setString(6, emission.getGenre());
            ps.setString(7, emission.getOrigine());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "DB : Enregistrement créé !");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void update(Emission emission) {

        try {
            Connection con = ConnectDB.getConnect();
            String sql = "UPDATE emission SET titre=?, titre_original=?, annee_production=?, num_saison=?, code=?, code_1=? WHERE Id_Emission=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, emission.getTitre());
            ps.setString(2, emission.getTitreOriginal());
            ps.setInt(3, emission.getAnneeProduction());
            ps.setInt(4, emission.getNumSaison());
            ps.setString(5, emission.getGenre());
            ps.setString(6, emission.getOrigine());
            ps.setInt(7, emission.getId());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "DB : Enregistrement créé !");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void delete(int id) {

        try {
            Connection con = ConnectDB.getConnect();
            String sql = "DELETE FROM emission WHERE Id_Emission=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "DB : Enregistrement créé !");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public static Emission getLEmission(int id) {
        
        Emission emission = new Emission();

        try {
            Connection con = ConnectDB.getConnect();
            String sql = "SELECT * FROM diffusion WHERE Id_Diffusion=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                emission.setId(rs.getInt("Id_Emission"));
                emission.setTitre(rs.getString("titre"));
                emission.setTitreOriginal(rs.getString("titre_original"));
                emission.setAnneeProduction(rs.getInt("annee_production"));
                emission.setNumSaison(rs.getInt("num_saison"));
                emission.setGenre(rs.getString("code"));
                emission.setOrigine(rs.getString("code_1"));

            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return emission;
    }
}
