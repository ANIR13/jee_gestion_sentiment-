package com.services;

import java.util.List;

import com.bo.Internaute;

public interface GsInternauteService {
	/** implemente le service métier permettant de sauvgarder un produit */
	void addInternaute(Internaute p);

	/** implémente le service métier permettant de récupérer tous les produits */
	List<Internaute> getAllInternautes();
	
	Internaute   getInternauteById(Long pId);

}
