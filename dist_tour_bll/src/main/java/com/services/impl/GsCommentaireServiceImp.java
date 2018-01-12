package com.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bo.Commentaire;
import com.dao.*;

import com.services.GsCommmtaireService;



@Service
public class GsCommentaireServiceImp implements GsCommmtaireService {

	@Autowired
	private CommentaireDao CommentaireDao;

	
	
}
