/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package goldencage.test;
import goldencage.Dao.PrestataireDao;
import goldencage.entities.Prestataire;


/**
 *
 * @author ASMA
 */
public class testAjoutPrestataire {
   public static void main(String[] args) {
          
    Prestataire presta = new Prestataire();
        PrestataireDao prestO = new PrestataireDao();
        presta.setDomaine_prestataire("coiff");
        presta.setPassword_prestataire("aaa");
        presta.setUsername_prestataire("asma");
        presta.setEmail_prestataire("@gmail");
        prestO.insertPrestataire(presta);
        
        
        
   } 
    
}
