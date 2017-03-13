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
    private String prenom;
    private String nom;
    private int birthdate;
    char reponse = 'O';
    Scanner sc = new Scanner(System.in);
    private ArrayList<String> messages = new ArrayList<String>();
    private ArrayList<String> nomAmis = new ArrayList<String>();
    private ArrayList<String> prenomAmis = new ArrayList<String>(); 
    private ArrayList<String> birthdateAmis = new ArrayList<String>();  
   
    
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
     public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(int birthdate) {
        this.birthdate = birthdate;
    }

    public ArrayList<String> getMessages() {
        return messages;
    }

    public void setMessages(ArrayList<String> messages) {
        this.messages = messages;
    }

    public ArrayList<String> getNomAmis() {
        return nomAmis;
    }

    public void setNomAmis(ArrayList<String> nomAmis) {
        this.nomAmis = nomAmis;
    }

    public ArrayList<String> getPrenomAmis() {
        return prenomAmis;
    }

    public void setPrenomAmis(ArrayList<String> prenomAmis) {
        this.prenomAmis = prenomAmis;
    }

    public ArrayList<String> getBirthdateAmis() {
        return birthdateAmis;
    }

    public void setBirthdateAmis(ArrayList<String> birthdateAmis) {
        this.birthdateAmis = birthdateAmis;
    }
    
   
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
       String message = sc.nextLine(); 
       messages.add(message);
       
        
    }
    
    public void afficherMessage(){
        
     System.out.println(" Vos message : "+messages.get(0));
    }
    
    public void creerAmi(){
       System.out.println("saississez le nom de votre ami : ");
       String nomAmi = sc.nextLine(); 
       nomAmis.add(nomAmi);
       System.out.println("saississez le prenom de votre ami : ");
       String prenomAmi = sc.nextLine(); 
       prenomAmis.add(prenomAmi);
       System.out.println("Saisissez l'année de naissance de votre ami : ");
       String birthdateAmi = sc.nextLine();
       
       birthdateAmis.add( birthdateAmi);
       System.out.println(" Votre nouvel ami : "+" Son Nom : "+nomAmis.get(0)+" son prenom : "+prenomAmis.get(0)+" son année de naissance : "+birthdateAmis.get(0));
       
       
    }
    
     public void afficherAmi(){
        
    System.out.println(" Votre nouvel ami : "+" Son Nom : "+nomAmis.get(0)+" son prenom : "+prenomAmis.get(0)+" son année de naissance : "+birthdateAmis.get(0));

    }
}