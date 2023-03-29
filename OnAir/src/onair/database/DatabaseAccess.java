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

    public DatabaseAccess() {
        try{
            this.conn = DriverManager.getConnection("jdbc:mysql://mysql-tocook.alwaysdata.net/tocook_bdd?useSSL=false", "tocook", "Btssio82300");
            System.out.println("database connected");
        } catch(Exception e){
            System.out.println(e);
        }
        this.test();
    }
    
    public String test(){
            String test = "";
        try{
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from intervenants");
            System.out.println("succes");
            while (rs.next()){
                test = rs.getString(2);
                
                
                
                
            }
            System.out.println(test);
            return test;
        } catch(Exception e){
            System.out.println("nope");
            
        }
        return test;
    }

    
}
