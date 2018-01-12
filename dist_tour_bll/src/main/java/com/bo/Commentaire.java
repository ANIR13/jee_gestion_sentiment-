package com.bo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Commentaire {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="pannier_fk")
	private Destination Destination;

	@ManyToOne
    @JoinColumn(name="commande_client_fk")
	private Internaute Internaute;

	private double total;



	public void setInternaute(Internaute Internaute) {
		this.Internaute = Internaute;
	}

}
