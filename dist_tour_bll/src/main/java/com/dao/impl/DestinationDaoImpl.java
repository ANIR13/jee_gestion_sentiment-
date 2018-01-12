package com.dao.impl;

import org.springframework.stereotype.Repository;

import com.bo.Destination;
import com.dao.DestinationDao;
import com.genericdao.impl.HibernateSpringGenericDaoImpl;

/**
 * Une implémentation du DAO pour l'entité Destination. Cette implémentation se base
 * sur Spring (héritage de HibernateSpringGenericDaoImpl)
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
