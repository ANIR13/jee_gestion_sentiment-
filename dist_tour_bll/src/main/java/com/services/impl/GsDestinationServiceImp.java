package com.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bo.Destination;
import com.bo.Internaute;
import com.dao.DestinationDao;
import com.services.GsDestinationService;

@Service
public class GsDestinationServiceImp implements GsDestinationService {

	@Autowired
	private DestinationDao distinationDao;

	
}
