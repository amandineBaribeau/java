/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testjava;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author amandine.baribeau
 */
public class Utilisateur {
   
    //attribut
    String prenom;
    String nom;
    int birthdate;
    char reponse = 'O';
    Scanner sc = new Scanner(System.in);
    String message;
    String ami;
    String nomAmi;
    String prenomAmi;
    int birthdateAmi;
    
    
    //constructeur
    public Utilisateur(){       
        System.out.println("Saisissez votre prenom : ");
        this.prenom = sc.nextLine();
        System.out.println("Saisissez votre nom : ");
        this.nom=sc.nextLine();
        System.out.println("Saisissez votre année de naissance : ");
        this.birthdate=sc.nextInt();
        sc.nextLine();
        System.out.println(" Vos informations personnelles : "+"Votre Nom : "+nom+"Votre prenom : "+prenom+" Votre année de naissance : "+birthdate);

    }
    
    
    //methode
    public void changerInfo(){
        System.out.println("Saisissez votre prenom : ");
        this.prenom = sc.nextLine();
        System.out.println("Saisissez votre nom : ");
        this.nom=sc.nextLine();
        System.out.println("Saisissez votre année de naissance : ");
        this.birthdate=sc.nextInt();
        sc.nextLine();
        System.out.println(" Vos informations personnelles : "+"Votre Nom : "+nom+"Votre prenom : "+prenom+" Votre année de naissance : "+birthdate);

    }
    
    public void afficherProfil(){
        
     System.out.println(" Vos informations personnelles : "+"Votre Nom : "+nom+"Votre prenom : "+prenom+" Votre année de naissance : "+birthdate);
    } 
    
    public void ecrireMessage(){
       System.out.println("Saisissez votre message : ");
       this.message = sc.nextLine(); 
       ArrayList<String> messages = new ArrayList<String>();
       messages.add(this.message);
        
    }
    
    public void afficherMessage(){
        
     System.out.println(" Vos message : "+message);
    }
    
    public void creerAmi(){
       System.out.println("saississez le nom de votre ami : ");
       this.nomAmi = sc.nextLine(); 
       System.out.println("saississez le prenom de votre ami : ");
       this.prenomAmi = sc.nextLine(); 
       System.out.println("Saisissez l'année de naissance de votre ami : ");
       this.birthdateAmi = sc.nextInt();
       sc.nextLine();
       System.out.println(" Votre nouvel ami : "+" Son Nom : "+nomAmi+" son prenom : "+prenomAmi+" son année de naissance : "+birthdateAmi);
       
       
    }
    
     public void afficherAmi(){
        
     System.out.println(" Votre ami : "+"son nom : "+nomAmi +" son prenom : "+prenomAmi+" sa date de naissance : "+birthdateAmi);

    }
}