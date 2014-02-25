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
public class Prestataire {
private int id_prestataire;
private String email_prestataire;
private String username_prestataire;
private String password_prestataire;
private String domaine;

    public Prestataire() {
    }

    public Prestataire(String email_prestataire, String username_prestataire, String password_prestataire, String domaine) {
        this.email_prestataire = email_prestataire;
        this.username_prestataire = username_prestataire;
        this.password_prestataire = password_prestataire;
        this.domaine = domaine;
    }
    


    public int getId_prestataire() {
        return id_prestataire;
    }

    public String getEmail_prestataire() {
        return email_prestataire;
    }

    public String getUsername_prestataire() {
        return username_prestataire;
    }

    public String getPassword_prestataire() {
        return password_prestataire;
    }

    public String getDomaine_prestataire() {
        return domaine;
    }

    public void setId_prestataire(int id_prestataire) {
        this.id_prestataire = id_prestataire;
    }

    public void setEmail_prestataire(String email_prestataire) {
        this.email_prestataire = email_prestataire;
    }

    public void setUsername_prestataire(String username_prestataire) {
        this.username_prestataire = username_prestataire;
    }

    public void setPassword_prestataire(String password_prestataire) {
        this.password_prestataire = password_prestataire;
    }

    public void setDomaine_prestataire(String domaine) {
        this.domaine = domaine;
    }



    
}
