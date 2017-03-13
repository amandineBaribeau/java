/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testjava;



/**
 *
 * @author amandine.baribeau
 */
public class TestJava {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       boolean stay;
       Utilisateur user=new Utilisateur();
        do{
            Menu myMenu = new Menu(); 
            myMenu.displayMenu(user);
            stay = myMenu.getReponse();
            
        }while(stay);
        
        
    
    
    }
}
   

