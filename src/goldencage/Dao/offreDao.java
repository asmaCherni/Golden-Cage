/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package goldencage.Dao;
import goldencage.entities.offre;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import goldencage.util.myConnection;

/**
 *
 * @author ASMA
 */
public class offreDao {
     public void insertoffre(offre o){

        String requete = "insert into offre (nom_offre,description) values (?,?)";
        try {
            PreparedStatement ps = myConnection.getInstance().prepareStatement(requete);
            ps.setString(1, o.getNom_offre());
            ps.setString(2, o.getDescription());
            
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }
     public List<offre> Displayoffres (){


        List<offre> listoffre = new ArrayList<offre>();

        String requete = "select * from offre";
        try {
           Statement statement = myConnection.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while(resultat.next()){
                offre off =new offre();
                off.setId_offre(resultat.getInt(1));
                off.setDescription(resultat.getString(2));
                off.setNom_offre(resultat.getString(3));

                listoffre.add(off);
            }
            return listoffre;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des depots "+ex.getMessage());
            return null;
        }
    }
    
}
