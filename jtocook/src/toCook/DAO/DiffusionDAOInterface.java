/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package toCook.DAO;

import java.util.TreeMap;
import toCook.model.Diffusion;

/**
 *
 * @author g.vern
 */
public interface DiffusionDAOInterface {
    public static void create() {}
    public static void update(Diffusion diffusion) {}
    public static void delete() {}
    public static Diffusion getLaDiffusion(int Id_Diffusion) {
        Diffusion diff = new Diffusion();
        // code à implémenter
        return Diffusion;
    }
    public static TreeMap<String, Diffusion> getLesUtilisateurs() {
        TreeMap<String, Diffusion> lesUt = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        return lesUt;
    }
}
