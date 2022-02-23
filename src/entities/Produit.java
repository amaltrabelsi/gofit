/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author ASUS
 */
public class Produit {
    private int Produit_Id;
    private String Ref_P;
    private double Prix_Uni; 
    private int Quantite;
    private String Description;
    private String Nom_Produit;
    private String Categorie ;
    private int Fk_AvisP_Id;
    private int Fk_CommentaireP_Id;
    
    
    //constructors
    

    public Produit(int Produit_Id, String Ref_P, double Prix_Uni, int Quantite, String Description, String Nom_Produit, String Categorie, int Fk_AvisP_Id, int Fk_CommentaireP_Id) {
        this.Produit_Id = Produit_Id;
        this.Ref_P = Ref_P;
        this.Prix_Uni = Prix_Uni;
        this.Quantite = Quantite;
        this.Description = Description;
        this.Nom_Produit = Nom_Produit;
        this.Categorie = Categorie;
        this.Fk_AvisP_Id = Fk_AvisP_Id;
        this.Fk_CommentaireP_Id = Fk_CommentaireP_Id;
    }

    public Produit() {
    }

    public Produit(String Ref_P, double Prix_Uni, int Quantite, String Description, String Nom_Produit, String Categorie, int Fk_AvisP_Id, int Fk_CommentaireP_Id) {
        this.Ref_P = Ref_P;
        this.Prix_Uni = Prix_Uni;
        this.Quantite = Quantite;
        this.Description = Description;
        this.Nom_Produit = Nom_Produit;
        this.Categorie = Categorie;
        this.Fk_AvisP_Id = Fk_AvisP_Id;
        this.Fk_CommentaireP_Id = Fk_CommentaireP_Id;
    }
    
    
    
    
    //getters and setters 
    

    public int getProduit_Id() {
        return Produit_Id;
    }

    public void setProduit_Id(int Produit_Id) {
        this.Produit_Id = Produit_Id;
    }

    public String getRef_P() {
        return Ref_P;
    }

    public void setRef_P(String Ref_P) {
        this.Ref_P = Ref_P;
    }

    public double getPrix_Uni() {
        return Prix_Uni;
    }

    public void setPrix_Uni(double Prix_Uni) {
        this.Prix_Uni = Prix_Uni;
    }

    public int getQuantite() {
        return Quantite;
    }

    public void setQuantite(int Quantite) {
        this.Quantite = Quantite;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getNom_Produit() {
        return Nom_Produit;
    }

    public void setNom_Produit(String Nom_Produit) {
        this.Nom_Produit = Nom_Produit;
    }

    public String getCategorie() {
        return Categorie;
    }

    public void setCategorie(String Categorie) {
        this.Categorie = Categorie;
    }

    public int getFk_AvisP_Id() {
        return Fk_AvisP_Id;
    }

    public void setFk_AvisP_Id(int Fk_AvisP_Id) {
        this.Fk_AvisP_Id = Fk_AvisP_Id;
    }

    public int getFk_CommentaireP_Id() {
        return Fk_CommentaireP_Id;
    }

    public void setFk_CommentaireP_Id(int Fk_CommentaireP_Id) {
        this.Fk_CommentaireP_Id = Fk_CommentaireP_Id;
    }
    
    //affichage ya nour 

    @Override
    public String toString() {
        return "Produit{" + "Produit_Id=" + Produit_Id + ", Ref_P=" + Ref_P + ", Prix_Uni=" + Prix_Uni + ", Quantite=" + Quantite + ", Description=" + Description + ", Nom_Produit=" + Nom_Produit + ", Categorie=" + Categorie + ", Fk_AvisP_Id=" + Fk_AvisP_Id + ", Fk_CommentaireP_Id=" + Fk_CommentaireP_Id + '}';
    }
    
    
    
}
