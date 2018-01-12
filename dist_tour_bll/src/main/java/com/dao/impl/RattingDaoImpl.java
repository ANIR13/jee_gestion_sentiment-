package com.dao.impl;

import org.springframework.stereotype.Repository;

import com.bo.Ratting;
import com.dao.RattingDao;
import com.genericdao.impl.HibernateSpringGenericDaoImpl;

/**
 * Une implémentation du DAO pour l'entité Commentaire. Cette implémentation se base
 * sur Spring (héritage de HibernateSpringGenericDaoImpl)
 * 
 * @author T.BOUDAA
 *
 */

@Repository
public class RattingDaoImpl extends HibernateSpringGenericDaoImpl<Ratting, Long> implements RattingDao {

	public RattingDaoImpl() {
		super(Ratting.class);
	}

}
