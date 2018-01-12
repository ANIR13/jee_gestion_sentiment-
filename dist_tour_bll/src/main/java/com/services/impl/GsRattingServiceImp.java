package com.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.bo.Commentaire;
import com.bo.Destination;
import com.bo.Internaute;
import com.bo.Ratting;
import com.dao.RattingDao;
import com.services.GsRattingService;

@Service
public class GsRattingServiceImp implements GsRattingService {

	@Autowired
	private RattingDao commandeDao;

	public void validerRatting(Commentaire comment, Internaute client) {

	}

	public void validerRatting(Destination p, Internaute c) {
		// TODO Auto-generated method stub
		
	}

}
