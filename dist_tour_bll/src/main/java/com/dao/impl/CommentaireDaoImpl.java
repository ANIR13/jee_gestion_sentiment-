package com.dao.impl;

import org.springframework.stereotype.Repository;

import com.bo.Commentaire;
import com.dao.CommentaireDao;
import com.genericdao.impl.HibernateSpringGenericDaoImpl;

/**
 * Une implémentation du DAO pour l'entité Commentaire. Cette implémentation se base
 * sur Spring (héritage de HibernateSpringGenericDaoImpl)
 * 
 *
 */

@Repository
public class CommentaireDaoImpl extends HibernateSpringGenericDaoImpl<Commentaire, Long> implements CommentaireDao {

	public CommentaireDaoImpl() {
		super(Commentaire.class);
	}

}
