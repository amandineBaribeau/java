/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testjava;

import java.util.Scanner;

/**
 *
 * @author amandine.baribeau
 */
public class Menu {
    
    // Attributs
    char reponse = 'O';
    Scanner sc = new Scanner(System.in);

    // Constructeurs
    public Menu(){
    }
    
    // Methodes
    public void displayMenu(Utilisateur user){
        System.out.println( "Voulez-vous ?\n"
                + " afficher votre profil ? tapez 1 \n"
                + " modifier vos infos personnelles? tapez 2 \n"
                + " Ecrire un message ? tapez 3\n"
                + " Afficher un message ? tapez 4\n"
                + " Ajouter un ami ? tapez 5?\n"
                + " Afficher un ami ? tapez 6 \n"
                + " Arreter le programme? tapez 7 ");  
               
        String choix = sc.nextLine();
            
        
        switch (choix)
            {
                case "1":
                  user.afficherProfil();
                  break;
                case "2":
                  user.changerInfo();
                  break;
                case "3":
                  user.ecrireMessage();
                  break;
                case "4":
                  user.afficherMessage();
                  break;
                case "5":
                  user.creerAmi();
                  break;
                case "6":
                  user.afficherAmi();
                  break;
                case "7":
                 reponse='N';
                  break;
                default:
                  System.out.println("Je n'ai pas compris votre demande");
                  
            } 
        
    }
    
    public boolean getReponse() {
        
        return (reponse == 'O');
    
}
    
}
