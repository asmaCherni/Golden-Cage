/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package goldencage.Dao;
import goldencage.entities.Prestataire;
import goldencage.util.myConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ASMA
 */
public class PrestataireDao {
      public void insertPrestataire(Prestataire P ){

        String requete = "insert into prestataire (username_prestataire,password_prestataire,email_prestataire,domaine) values (?,?,?,?)";
        try {
            PreparedStatement ps = myConnection.getInstance().prepareStatement(requete);
            ps.setString(1, P.getUsername_prestataire());
            ps.setString(2, P.getPassword_prestataire());
            ps.setString(3, P.getEmail_prestataire());
            ps.setString(4, P.getDomaine_prestataire());
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }


   public void updatePrestataire(Prestataire P){
        String requete = "update depot set getPassword_prestataire=? where id_prestataire=?";
        try {
          PreparedStatement ps = myConnection.getInstance().prepareStatement(requete);
       
    
           ps.setString(1, P.getPassword_prestataire());
           
            ps.setInt(2, P.getId_prestataire());
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
         //  Logger.getLogger(PrestataireDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
       }
   }

   public void deletePrestataire(int id){
        String requete = "delete from prestataire where id=?";
        try {
            PreparedStatement ps = myConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Prestataire supprimée");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
    }


    public Prestataire findrestataireById(int id){
    
        Prestataire prestataire= new Prestataire();
     String requete = "select * from prestataire where id_prestataire=?";
        try {
            PreparedStatement ps = myConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {
                prestataire.setId_prestataire(resultat.getInt(1));
                prestataire.setUsername_prestataire(resultat.getString(2));
            }
            return prestataire;

        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du prestataire "+ex.getMessage());
            return null;
        }
    }

    public Prestataire findPrestataireByemail(String mail){
    Prestataire prestataire = new Prestataire();
     String requete = "select * from prestataire where email_prestataire = ?";
        try {
            PreparedStatement ps = myConnection.getInstance().prepareStatement(requete);
            ps.setString(1, mail);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {
                prestataire.setId_prestataire(resultat.getInt(1));
                System.out.println("testttttttt"+prestataire.getId_prestataire());
                prestataire.setEmail_prestataire(resultat.getString(2));
                System.out.println(resultat.getString(2));
            }
            return prestataire;

        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du depot "+ex.getMessage());
            return null;
        }
    }

    public List<Prestataire> DisplayAllPrestataires (){


        List<Prestataire> listeprestataires = new ArrayList<Prestataire>();

        String requete = "select * from prestataire";
        try {
           Statement statement = myConnection.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while(resultat.next()){
                Prestataire pre =new Prestataire();
                pre.setId_prestataire(resultat.getInt(1));
                pre.setEmail_prestataire(resultat.getString(2));
                pre.setDomaine_prestataire(resultat.getString(3));
                pre.setUsername_prestataire(resultat.getString(4));

                listeprestataires.add(pre);
            }
            return listeprestataires;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des depots "+ex.getMessage());
            return null;
        }
    }

}
