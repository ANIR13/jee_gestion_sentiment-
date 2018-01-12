package com.services;

import com.bo.*;


/**
 * interface du service metier permettant d'implémenter la logique métier et
 * applicative liées à la gestion des sentiment
 * 
 *
 */
public interface GsRattingService {

	/** Permet de valider une sentiment */
	void validerRatting(Destination p, Internaute c);

}