/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package onair.database;

import java.sql.*;

/**
 *
 * @author Administrator
 */
public class DatabaseAccess {

    protected Connection conn;

    public void databaseAccess() {
        
    }

    public String[][] getEmissions() {
        try {
            this.conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tocook", "root", "");
            
            Statement stmt = conn.createStatement();
            int rsCount = getEmissionCount();
            
            String query = "select * from emission;";
            ResultSet rs = stmt.executeQuery(query);
            ResultSetMetaData rsMeta = rs.getMetaData();
            String[][] emissions = new String[rsCount][rsMeta.getColumnCount()];
            int i = 0;
            while (rs.next()) {
                int j = 1;
                while (j < rsMeta.getColumnCount()) {
                    emissions[i][j] = rs.getString(j);
                    j++;
                }
                i++;
            }
            return emissions;
        } catch (Exception e) {
            System.out.println(e);
            String[][] emissions = new String[0][0];
            return emissions;
        }
    }
    
    public int getEmissionCount(){
        try{
            this.conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tocook", "root", "");
            
            Statement stmt = conn.createStatement();
            String query = "select count(*) from emission;";
            ResultSet rs = stmt.executeQuery(query);
            rs.next();
            return rs.getInt(1);
        } catch(Exception e){
            System.out.println(e);
        }
        return 0;
    }
    
    public String[][] getProgramsOfEmission(int idEmission){
        try {
            this.conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tocook", "root", "");

            String query = "select * from programme where Id_Emission = ?;";            
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, idEmission);
            
            int rsCount = getProgramsCountOfEmission(idEmission);
            ResultSet rs = stmt.executeQuery();
            ResultSetMetaData rsMeta = rs.getMetaData();
            String[][] programmes = new String[rsCount][rsMeta.getColumnCount()];
            int i = 0;
            while (rs.next()) {
                int j = 1;
                while (j < rsMeta.getColumnCount()) {
                    programmes[i][j] = rs.getString(j);
                    j++;
                }
                i++;
            }
            return programmes;
        } catch (Exception e) {
            System.out.println(e);
            String[][] programmes = new String[0][0];
            return programmes;
        }
    }
    
    public int getProgramsCountOfEmission(int idEmission){
        try{
            this.conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tocook", "root", "");
            
            String query = "select count(*) from programme where Id_Emission = ?;";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, idEmission);
            ResultSet rs = stmt.executeQuery();
            rs.next();
            return rs.getInt(1);
        } catch(Exception e){
            System.out.println(e);
        }
        return 0;
    }
}
