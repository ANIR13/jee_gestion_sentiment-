package com.dao.impl;

import org.springframework.stereotype.Repository;

import com.bo.Commentaire;
import com.dao.CommentaireDao;
import com.genericdao.impl.HibernateSpringGenericDaoImpl;

/**
 * Une impl�mentation du DAO pour l'entit� Commentaire. Cette impl�mentation se base
 * sur Spring (h�ritage de HibernateSpringGenericDaoImpl)
 * 
 *
 */

@Repository
public class CommentaireDaoImpl extends HibernateSpringGenericDaoImpl<Commentaire, Long> implements CommentaireDao {

	public CommentaireDaoImpl() {
		super(Commentaire.class);
	}

}
