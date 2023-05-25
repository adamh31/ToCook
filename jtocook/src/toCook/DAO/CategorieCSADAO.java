/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package toCook.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import toCook.model.CategorieCSA;
import toCook.model.Emission;
import toCook.technic.ConnectDB;

/**
 *
 * @author Administrator
 */
public class CategorieCSADAO {
    public void create(CategorieCSA categorieCSA) {

        try {
            Connection con = ConnectDB.getConnect();
            String sql = "INSERT INTO Categorie_CSA (code, libelle) VALUES (?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, categorieCSA.getCode());
            ps.setString(2, categorieCSA.getLibelle());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "DB : Enregistrement créé !");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void update(CategorieCSA categorieCSA) {

        try {
            Connection con = ConnectDB.getConnect();
            String sql = "UPDATE Categorie_CSA SET libelle=? WHERE code=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, categorieCSA.getLibelle());
            ps.setString(2, categorieCSA.getCode());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "DB : Enregistrement créé !");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void delete(String code) {

        try {
            Connection con = ConnectDB.getConnect();
            String sql = "DELETE FROM CategorieCSA WHERE code=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, code);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "DB : Enregistrement créé !");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public static CategorieCSA getLaCategorieCSA(String code) {
        
        CategorieCSA categorieCSA = new CategorieCSA();

        try {
            Connection con = ConnectDB.getConnect();
            String sql = "SELECT * FROM Categorie_CSA WHERE code=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, code);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                categorieCSA.setCode(rs.getString("code"));
                categorieCSA.setLibelle(rs.getString("libelle"));
                

            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return categorieCSA;
    }
    
    public static ArrayList<CategorieCSA> getLesCategorieCSA(){
        ArrayList<CategorieCSA> categorieCSAs = new ArrayList<CategorieCSA>();
        try{
            Connection con = ConnectDB.getConnect();
            String sql = "SELECT * FROM Categorie_CSA";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                CategorieCSA categorieCSA = new CategorieCSA();
                categorieCSA.setCode(rs.getString("code"));
                categorieCSA.setLibelle(rs.getString("libelle"));
                categorieCSAs.add(categorieCSA);
            }
        } catch(Exception e){
            System.out.println(e);
        }
        return categorieCSAs;
    }
}
