package com.services;

import java.util.List;

import com.bo.Internaute;

public interface GsInternauteService {
	/** implemente le service m�tier permettant de sauvgarder un produit */
	void addInternaute(Internaute p);

	/** impl�mente le service m�tier permettant de r�cup�rer tous les produits */
	List<Internaute> getAllInternautes();
	
	Internaute   getInternauteById(Long pId);

}
