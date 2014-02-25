/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package goldencage.entities;

/**
 *
 * @author ASMA
 */
public class offre {
    private int id_offre;
    private String description;
    private String nom_offre;

    public offre() {
    }

    public String getNom_offre() {
        return nom_offre;
    }

    public void setNom_offre(String nom_offre) {
        this.nom_offre = nom_offre;
    }
    

    public offre(String description) {
        this.description = description;
    }

    public int getId_offre() {
        return id_offre;
    }

    public String getDescription() {
        return description;
    }

    public void setId_offre(int id_offre) {
        this.id_offre = id_offre;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
    
}
