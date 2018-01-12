package com.services.impl;

import java.util.List;

//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bo.Internaute;
import com.dao.InternauteDao;
import com.services.GsInternauteService;


@Service
@Transactional
public class GsInternauteServiceImpl implements GsInternauteService {

	@Autowired
	private InternauteDao internauteDao;

	public void addInternaute(Internaute p) {

		// TODO: ajout des regles metier s'elles existent
System.out.println(p);
		internauteDao.create(p);

	}

	public List<Internaute> getAllInternautes() {
		return internauteDao.getAll();
	} 

	public Internaute getInternauteById(Long pId) {
		return internauteDao.findById(pId);
	}
	
}
