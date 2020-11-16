package com.recetteSB.recette.model;

public class Produits {

	
	private String nom  ;

	
	// Constructor
	
	

	public Produits(String nom) {
		super();
		this.nom = nom;
	}

//
	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Produit [nom=" + nom + "]";
	}


	 


	
	
	
}
