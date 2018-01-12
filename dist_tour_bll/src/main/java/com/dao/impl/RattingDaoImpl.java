package com.dao.impl;

import org.springframework.stereotype.Repository;

import com.bo.Ratting;
import com.dao.RattingDao;
import com.genericdao.impl.HibernateSpringGenericDaoImpl;

/**
 * Une impl�mentation du DAO pour l'entit� Commentaire. Cette impl�mentation se base
 * sur Spring (h�ritage de HibernateSpringGenericDaoImpl)
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
