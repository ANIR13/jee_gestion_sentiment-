package com.decorators;

import org.displaytag.decorator.TableDecorator;

import com.bo.Destination;

public class PanierActionsDecorator extends TableDecorator {

	private String addToPanierLink;

	public String getAddToPanierLink() {

		Destination produit = (Destination) getCurrentRowObject();
		Long idprod = produit.getId();

		this.addToPanierLink = "<a href=\"addProduitToPanier?idProduit=" + idprod + "\">ajouter au panier</a>";

		return this.addToPanierLink;
	}

}