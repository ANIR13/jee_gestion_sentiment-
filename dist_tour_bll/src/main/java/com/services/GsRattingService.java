package com.services;

import com.bo.*;


/**
 * interface du service metier permettant d'impl�menter la logique m�tier et
 * applicative li�es � la gestion des sentiment
 * 
 *
 */
public interface GsRattingService {

	/** Permet de valider une sentiment */
	void validerRatting(Destination p, Internaute c);

}