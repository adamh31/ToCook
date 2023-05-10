/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package toCook.DAO;
import java.sql.*;

/**
 *
 * @author g.vern
 */
public class DiffusionDAO implements DiffusionDAOInterface{
    public void create(Utilisateur utilisateur) {

        try {
            Connection con = ConnectDB.getConnect();
            String sql = "INSERT INTO utilisateur (utpseudo, utnom, utprenom, utmp, utmail, utphrase, utadr1, utadr2, utcdpost, utnumpost) VALUES (?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, utilisateur.getUtPseudo());
            ps.setString(2, utilisateur.getUtNom());
            ps.setString(3, utilisateur.getUtPrenom());
            ps.setString(4, utilisateur.getUtMp());
            ps.setString(5, utilisateur.getUtMail());
            ps.setString(6, utilisateur.getUtPhrase());
            ps.setString(7, utilisateur.getUtAdr1());
            ps.setString(8, utilisateur.getUtAdr2());
            ps.setString(9, utilisateur.utCommune.getCode_Postal());
            ps.setString(10, utilisateur.utCommune.getNum_Postal());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "DB : Enregistrement créé !");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "DB : Erreur lors de la création de l'utilisateur");
        }
    }
}
