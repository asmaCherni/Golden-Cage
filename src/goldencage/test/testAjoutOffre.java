/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package goldencage.test;
import goldencage.Dao.offreDao;
import goldencage.entities.Prestataire;
import goldencage.entities.offre;

/**
 *
 * @author ASMA
 */
public class testAjoutOffre {
    public static void main(String[] args) {
          
    offre of = new offre();
    offreDao ofD =new offreDao();
    of.setNom_offre("asma2");
    of.setDescription("offre1");
    ofD.insertoffre(of);
    }
    
}
