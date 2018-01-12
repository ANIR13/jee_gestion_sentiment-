package com.dao.impl;

import org.springframework.stereotype.Repository;

import com.bo.Destination;
import com.dao.DestinationDao;
import com.genericdao.impl.HibernateSpringGenericDaoImpl;

/**
 * Une impl�mentation du DAO pour l'entit� Destination. Cette impl�mentation se base
 * sur Spring (h�ritage de HibernateSpringGenericDaoImpl)
 * 
 * @author T.BOUDAA
 *
 */

@Repository
public class DestinationDaoImpl extends HibernateSpringGenericDaoImpl<Destination, Long> implements DestinationDao {

	public DestinationDaoImpl() {
		super(Destination.class);
	}

}
